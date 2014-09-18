import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.sql.*;
public class savedata extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l7,l8,l9,l10;
 JTextField t1,t2;
 JButton b1,b2;
 JComboBox h1,h2,h3;
 Font f;
 String d,m,y.dob;
 public savedata()
 {
   String months[] = {"Jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
   setLayout(null);
   f=new Font("Monotype Corsiva",Font.BOLD|Font.ITALIC,24);
   l1 = new JLabel("Registration Form");
   l1.setFont(f);
   l2 = new JLabel("Full Name");
   t1 = new JTextField();
   l3 = new JLabel("E-mail Id");
   t2 = new JTextField();
      l7 = new JLabel("Date Of Birth");
   l10 = new JLabel("Date");
   h1 = new JComboBox( );
   l10 = new JLabel("Month");
   h2 = new JComboBox( );
  l10 = new JLabel("Year");
   h3 = new JComboBox( );
   b1 = new JButton("SUBMIT");
   b2 = new JButton("CANCEL");
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
     add(l1);
     add(l2);
     add(t1);
     add(l3);
     add(t2);
     add(l4);
     add(t3);
     add(l5);
     add(t4);
     add(l6);
     add(t5);
     add(l7);
     add(l8);
     add(h1);
     add(l9);
     add(h2);
     add(l10);
     add(h3);
     add(b1);
     add(b2);
     l1.setBounds(350,100,150,30);
     l2.setBounds(200,150,100,30);
     t1.setBounds(350,150,150,30);
     l3.setBounds(200,200,100,30);
     t2.setBounds(350,200,150,30);
     l4.setBounds(200,250,100,30);
     t3.setBounds(350,250,150,30);
     l5.setBounds(200,300,100,30);
     t4.setBounds(350,300,150,30);
     l6.setBounds(200,350,100,30);     
     t5.setBounds(350,350,150,30);
     l7.setBounds(200,400,100,30);
     l8.setBounds(200,450,50,30);
     h1.setBounds(250,450,50,30);
     l9.setBounds(300,450,50,30);
     h2.setBounds(350,450,50,30);
    l10.setBounds(400,450,50,30);
     h3.setBounds(450,450,50,30);
     b1.setBounds(230,500,100,30); 
     b2.setBounds(380,500,100,30);
     d=h1.getItem();
     m=h2.getItem();
     y=h3.getItem();
     dob=d+"/"+m"/"+y; 
   }

   public void actionPerformed(ActionEvent ae)
   {
    String s = ae.getActionCommand();
    Connection con=null;
    Statement stmt =null;
    ResultSet rs = null;
    if(s.equals("SUBMIT"))
    {
     try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:dsn1");
       stmt = con.createStatement();
       int d = stmt.executeUdate("insert into student values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"',"+t5.getText()+")");
       //rs = stmt.executeQuery();
       //if(rs.next())
         //JOptionPane.showMessageDialog(null,"valid login");
       //else
         //JOptionPane.showMessageDialog(null,"Invalid login,try again");
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
    savedata sd = new savedata();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    sd.setSize(d.width,d.height);
    sd.setVisible(true);
    sd.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
} 