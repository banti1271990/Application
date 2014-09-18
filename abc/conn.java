import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class p1 extends JPanel
{
 JButton b1,b2,b3;
 JLabel l1,l2,l3;
 JTextField t1,t2; 
 Font f;
 public p1()
 {
  setLayout(null);
  setBackground(Color.cyan);
  l1 = new JLabel("Login Form");
  l1.setForeground(Color.red);
   f = new Font("Monotype Corsiva",Font.BOLD|Font.ITALIC,24); 
   b3 = new  JButton(new ImageIcon("x.jpg"));
  l2 = new JLabel("User Name");
  t1 = new JTextField();
  l3 = new JLabel("Password");
  t2 = new JTextField();
  b1 = new JButton("submit");
  b1.setForeground(Color.green);
  b2 = new JButton("cancel"); 
  b2.setForeground(Color.blue);
  add(l1);
  add(b3);
  add(l2);
  add(t1);
  add(l3);
  add(t2); 
  add(b1);
  add(b2);
  l1.setBounds(300,100,200,30);
  b3.setBounds(600,30,140,150); 
  l2.setBounds(200,200,150,30);
  t1.setBounds(350,200,150,30);
  l3.setBounds(200,250,150,30);
  t2.setBounds(350,250,150,30);
  b1.setBounds(200,300,100,30);
  b2.setBounds(350,300,100,30);
 }
}
class p2 extends JPanel
{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
 JTextField t1,t2,t3,t4,t5;
 JTextArea a;
 Choice h1,h2,h3;
 JCheckBox c1,c2;
 JRadioButton r1,r2;
 JComboBox cb;
JScrollPane jsp;
 JPanel jp;
 public p2()
 {
  
  String months[] = {"Jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
setLayout(new BorderLayout());  
jp=new JPanel();
jp.setLayout(null);
  setBackground(Color.magenta);
  l1 = new JLabel("Registration Form ");
  l2 = new JLabel("First Name");
  t1 = new JTextField();
  l3 = new JLabel("Middle Name");
  t2 = new JTextField();
  l4 = new JLabel("Last name");
  t3 = new JTextField();
  l5 = new JLabel("User Name");
  t4 = new JTextField("");
  l6 = new JLabel("Password");
  t5 = new JTextField();
  l7 = new JLabel("Address");
  a  = new JTextArea();
  l8 = new JLabel("Date Of Birth");
  l9 = new JLabel("Date");
  h1 = new Choice( );
 l10 = new JLabel("Month");
  h2 = new Choice( );
 l11 = new JLabel("Year");
  h3 = new Choice( );
 l12 = new JLabel("Select Domain");
  c1 = new JCheckBox("Software Developer");
  c2 = new JCheckBox("Main Frame");
 l13 = new JLabel("Gender");
  r1 = new JRadioButton("Male");
  r2 = new JRadioButton("Female");
 l14 = new JLabel("Select Courses");
  cb = new JComboBox();
  cb.addItem("Master Of Computer Applications");
  cb.addItem("MS 5 Year");
  cb.addItem("M.Tech");
  cb.addItem("Msc IT");
  cb.addItem("Master Of Business Administrative");
  for(int j=1;j<=31;j++)
     {
      h1.addItem(j+"");
     }
     for(int i=0;i<12;i++)
     {
       h2.addItem(months[i]);
     }
     for(int k=1947;k<=2020;k++)
     {
      h3.addItem(k+"");
     }
  int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS; 
  int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
 jp.add(l1);
 jp.add(l2);
 jp.add(t1);
 jp.add(l3);
 jp.add(t2);
 jp.add(l4);
 jp.add(t3); 
 jp.add(l5);
 jp.add(t4);
 jp.add(l6);
 jp.add(t5);
 jp.add(l7);
 jp.add(a);
 jp.add(l8);
 jp.add(l9);
 jp.add(h1);
 jp.add(l10);
 jp.add(h2);
 jp.add(l11);
 jp.add(h3);
 jp.add(l12);
  jp.add(c1);
  jp.add(c2);
  jp.add(l13);
  jp.add(r1);
  jp.add(r2);
  jp.add(l14);
  jp.add(cb);
  l1.setBounds(300,50,200,30); 
  l2.setBounds(200,100,150,30);
  t1.setBounds(350,100,150,30);
  l3.setBounds(200,150,150,30);
  t2.setBounds(350,150,150,30);
  l4.setBounds(200,200,150,30);
  t3.setBounds(350,200,150,30);
  l5.setBounds(200,250,150,30);
  t4.setBounds(350,250,200,30);
  l6.setBounds(200,300,150,30);
  t5.setBounds(350,300,150,30);
  l7.setBounds(200,350,150,30);
   a.setBounds(350,350,150,30);
  l8.setBounds(200,400,200,30);
  l9.setBounds(200,450,50,30);
  h1.setBounds(250,450,50,30);
 l10.setBounds(300,450,50,30);
  h2.setBounds(350,450,50,30);
 l11.setBounds(400,450,50,30);
  h3.setBounds(450,450,50,30);
 l12.setBounds(200,500,200,30);
  c1.setBounds(200,550,200,30);
  c2.setBounds(400,550,200,30);
 l13.setBounds(200,600,100,30);
  r1.setBounds(200,650,100,30);
  r2.setBounds(300,650,100,30);
 l14.setBounds(200,700,200,30);
  cb.setBounds(250,750,250,30);
add(jp);
jsp = new JScrollPane(jp,v,h);
 Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
jsp.setPreferredSize(new Dimension(d.width,d.height)); 
 add(jsp,BorderLayout.CENTER);

 }
}
  
    
class conn extends JFrame
{
 JTabbedPane jtp;
 conn()
 {
  jtp=new JTabbedPane();
  jtp.addTab("Login",new p1());
  jtp.addTab("Registration",new p2());
  Container c = getContentPane();
            c.add(jtp);
  
 }
 public static void main(String args[])
 {
  conn a = new conn();
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
  a.setSize(d.width,d.height);
  a.setVisible(true);
  a.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}