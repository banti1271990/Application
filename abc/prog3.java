import javax.swing.*;
import java.awt.*;
//import javax.swing.plaf.metal.MetalLookAndFeel;
//import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
 
public class prog3 extends JFrame
{
 JTable jtb;
 JScrollPane jsp;
 prog3()throws Exception
 {
  //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  String col[] = {"Roll No","Name","Marks"};
  /*Object date[][]={{"299","ashu",78},
                   {"259","banti",75}};*/
   Object date[][] = new Object[20][30];
  jtb = new JTable(date,col);
	//jtb.setBorder(BorderFactory.createLineBorder(Color.RED,5));
  int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
  int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
  jsp = new JScrollPane(jtb,v,h);
  Container c = getContentPane();
  c.add(jsp);
 }
 public static void main(String args[])throws Exception
 {
  prog3 p = new prog3();
  Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
  p.setSize(d.width,d.height);
  p.setVisible(true);
 }
}