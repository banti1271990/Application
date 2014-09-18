import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class prog1 extends JFrame
{
 JLabel l;
 JButton b;
 public prog1()
 {
  l = new JLabel("hello");
  b = new JButton(new ImageIcon("x.jpg"));
  Container c = getContentPane();
  c.setLayout(new FlowLayout());
  c.add(l);
  c.add(b);
  b.setBounds(200,150,60,60);
 }
public static void main(String args[])
{
 prog1 a = new prog1();
 a.setSize(800,800);
 a.setVisible(true);
 a.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}