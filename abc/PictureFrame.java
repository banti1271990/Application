import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class PictureFrame extends JFrame implements ActionListener
{
  Image img;
  JButton getPictureButton;
  JTextField text  =  new JTextField(30);
  JLabel jlabel1;
  public static void main(String args[])
  {
    new PictureFrame();
  }
  public PictureFrame()
  {
    this.setSize(300,300);
    this.setTitle("Image Frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel picpanel = new PicturePanel();
    this.add(picpanel,BorderLayout.CENTER);
    
    JPanel buttonpanel = new JPanel();
    getPictureButton = new JButton("Open Image File");
    text = new JTextField(15);
    JLabel jlabel1 = new JLabel(" image file",new ImageIcon("file"),JLabel.LEFT);
    getPictureButton.addActionListener(this);
     buttonpanel.add(jlabel1);
    buttonpanel.add(getPictureButton);
    buttonpanel.add(text);
    this.add(buttonpanel,BorderLayout.SOUTH);
    this.setVisible(true);
   }
  public void actionPerformed(ActionEvent e)
  {
    String file = getImageFile();
    if(file!=null)
    {
      Toolkit kit = Toolkit.getDefaultToolkit();
      img = kit.getImage(file);
      img = img.getScaledInstance(300,-1,Image.SCALE_SMOOTH);
      this.repaint(); 
    }
  }
  private String getImageFile()
  {
    JFileChooser fc = new JFileChooser();
    fc.setFileFilter(new ImageFilter());
    int result =fc.showOpenDialog(null);                                                     
    File file=fc.getSelectedFile();
    if(result==JFileChooser.APPROVE_OPTION)
    {
      text.setText("you Choose"+file.getPath());
      file = fc.getSelectedFile();  
      return file.getPath();
    }
    else
        return("you clicked cancel");
       }
  private class PicturePanel extends JPanel
  {
   public void paint(Graphics g)
   {
     g.drawImage(img,0,0,this);
   }
  }
  private class ImageFilter extends javax.swing.filechooser.FileFilter
  {
   public boolean accept(File f)
   {
    if(f.isDirectory())
     return true;
     String name = f.getName();
     if(name.matches(".*((.jpg)|(.gif)|(.png)|(.mpg)|(tif)|(mpeg)|(jpeg)|(tiff))"))
       return true;
     else
       return false;
   }
  
   public String getDescription()
   {
    return "Image files(*.jpg,*.gif,*.png,*mpg,*.tif,*.mpeg,*.jpeg,*.tiff)";
   }
  }
 }