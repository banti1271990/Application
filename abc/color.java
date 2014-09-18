 
 import java.awt.*; 
 import java.applet.*; 
 import java.awt.event.*; 
 /* 
  <APPLET CODE="color" HEIGHT=500 WIDTH=500> 
  </APPLET> 
 */ 

 public class color extends Applet implements ActionListener 
  { 
   String str; 
   Button b1,b2,b3; 
   public void init() 
    { 
      setLayout(null); 

      b1=new Button("Red"); 
      b1.setBackground(Color.red); 
      b2=new Button("Green"); 
      b2.setBackground(Color.green); 
      b3=new Button("Blue"); 
      b3.setBackground(Color.blue); 
      add(b1); 
      add(b2); 
      add(b3); 
      b1.setBounds(50,200,100,20); 
      b2.setBounds(170,200,100,20); 
      b3.setBounds(290,200,100,20); 

      b1.addActionListener(this); 
      b2.addActionListener(this); 
      b3.addActionListener(this); 
    } 
  public void actionPerformed(ActionEvent ae) 
   { 
     if(ae.getSource()==b1) 
        { 
          setBackground(Color.red); 
        } 
     else if(ae.getSource()==b2) 
 
                                                                       
       { 
          setBackground(Color.green); 
        } 
      else 
        { 
         setBackground(Color.blue); 
        }    
    } 
  public void paint(Graphics g) 
    { 
      g.drawString("Hello JAVA",10,20); 
    } 
 }
