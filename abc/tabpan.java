import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.util.*;
class p1 extends JPanel
{
 JButton b1,b2;
 public p1()
 {
  b1=new JButton("Submit");
  b1=new JButton("Cancel");
  add(b1);
  add(b2);
 }
}
class p2 extends JPanel
{
 JLabel l1;
 p2()
 {
  l1=new JLabel("this is tab");
   add(l1);
 }
}
class tabpan extends JFrame
{
 JTabbedPane jtp;
 tabpan()
 {
  jtp = new JTabbedPane();
  jtp.addTab("tab1",new p1());
  jtp.addTab("tab2",new p2());
  Container c = getContentPane();
  c.add(jtp);
 }
 public static void main(String args[])
 {
   tabpan tb = new tabpan();
   Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
   tb.setSize(d.width,d.height);
   tb.setVisible(true);
   tb.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}
