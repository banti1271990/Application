import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class savedata1 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4;
 JTextField t1,t2;
 JButton b1,b2;
 JPasswordField p;
 public savedata1()
 {
  setLayout(null);
   l1 = new JLabel(" Welcome to davim.... ");
   l2 = new JLabel("Full Name");
   t1 = new JTextField();
   l3 = new JLabel("E-mail Id");
   t2 = new JTextField();
   l4 = new JLabel("Password");
    p = new JPasswordField();
   b1 = new JButton("submit");
   b2 = new JButton("cancel");
     add(l1);
     add(l2);
     add(t1);
     add(l3);
     add(t2);
     add(l4);
     add(p);
     add(b1);
     add(b2);
     l1.setBounds(350,100,150,30);
     l2.setBounds(200,150,100,30);
     t1.setBounds(350,150,150,30);
     l3.setBounds(200,200,100,30);
     t2.setBounds(350,200,150,30);
     l4.setBounds(200,250,100,30);
      p.setBounds(350,250,150,30);
     b1.setBounds(230,300,100,30);
	b1.addActionListener(this);
	b2.addActionListener(this);
 
     b2.setBounds(380,300,100,30);
   }
   public void actionPerformed(ActionEvent ae)
   {
    String s = ae.getActionCommand();
    Connection con=null;
    Statement stmt =null;
    if(s.equals("submit"))
    {
     try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:dsn1");
       stmt = con.createStatement();
       int d = stmt.executeUpdate("insert into savedata values('"+t1.getText()+"','"+t2.getText()+"','"+p.getText()+"')");
       if(d==1)
       {
        JOptionPane.showMessageDialog(null," Data Save Successfully");
       }
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,e);
      }
     }
    else if(s.equals("cancel"))
    {
       System.exit(0);
    }
   }
   public static void main(String args[])
   {
    savedata1 sd = new savedata1();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    sd.setSize(d.width,d.height);
    sd.setVisible(true);
    sd.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
 } 