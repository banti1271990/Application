import java.applet.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
 public class page extends Frame implements ActionListener
 {
  Label l1,l2,l3;
  TextField t1,t2;
  Button b1,b2;
  public page()
  {
      setLayout(null);
	l1 = new Label("login form");
      l2 = new Label("User Name");
      t1 = new TextField();
      l3 = new Label("Password");
      t2 = new TextField();
      t2.setEchoChar('*');
      b1 = new Button("submit");
      b2 = new Button("cancel");
      add(l1);
      add(l2);
      add(t1);
      add(l3);
      add(t2);
      add(b1);
      add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
      l1.setBounds(350,100,150,30);
      l2.setBounds(200,150,100,30);
      t1.setBounds(350,150,150,30);
      l3.setBounds(200,200,100,30);
      t2.setBounds(350,200,150,30);
      b1.setBounds(200,250,80,30);
      b2.setBounds(350,250,80,30);
  }  
  public void actionPerformed(ActionEvent ae)
  {
    String s = ae.getActionCommand();
    Connection con=null;
    Statement stmt =null;
    ResultSet rs = null;
    if(s.equals("submit"))
    {
     try
     {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:dsn1");
       stmt = con.createStatement();
       rs = stmt.executeQuery("select * from login where UserName ='"+t1.getText()+"' and  Password= '"+t2.getText()+"'");
       if(rs.next())
         JOptionPane.showMessageDialog(null,"valid login");
       else
         JOptionPane.showMessageDialog(null,"Invalid login,try again");
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
      page a = new page();
      a.setSize(800,800);
      a.setVisible(true); 
    } 
}
      
 