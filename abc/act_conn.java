//import java.awt.*;
//import java.applet.*;
//import javax.swing.*;
import java.io.*;
import java.sql.*;
class act_conn
{
 public static void main(String args[])
 {
  String FirstName,MiddleName,LastName,UserName,Password,Address,Month;
  String SelectDomain,Gender,SelectCourses;
  int Year,Date;
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  Connection con = null;
  Statement stmt = null;
  ResultSet rs = null;
  try
  {
   System.out.println("Enter the first name \n");
   FirstName = b.readLine();
   System.out.println("Enter the middle name \n");
   MiddleName = b.readLine();
   System.out.println("Enter the last name \n");
   LastName = b.readLine();
   System.out.println("Enter the email id \n");
   UserName = b.readLine();
   System.out.println("Enter the password \n");
   Password = b.readLine();
   System.out.println("Enter the address \n");
   Address = b.readLine();
   System.out.println("Enter the date \n");
   Date = Integer.parseInt(b.readLine());
   System.out.println("Enter the month \n");
   Month = b.readLine();
   System.out.println("Enter the year \n");
   Year = Integer.parseInt(b.readLine());
   System.out.println("Enter the  domain \n");
   SelectDomain = b.readLine();
   System.out.println("Enter the gender \n");
   Gender = b.readLine();
   System.out.println("Enter the course name \n");
   SelectCourses = b.readLine();
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con = DriverManager.getConnection("jdbc:odbc:dsn1");
   stmt = con.createStatement();
   int i = stmt.executeUpdate("insert into registration values('"+FirstName+"','"+MiddleName+"','"+LastName+"','"+UserName+"','"+Password+"','"+Address+"',"+Date+",'"+Month+"',"+Year+",'"+SelectDomain+"','"+Gender+"','"+SelectCourses+"')");
   rs = stmt.executeQuery("select * from registration");
   while(rs.next())
   {
    System.out.print(rs.getString("First Name")+"\t");
    System.out.print(rs.getString("Middle Name")+"\t"); 
    System.out.print(rs.getString("Last Name")+"\t");
    System.out.print(rs.getString("User Name")+"\t");
    System.out.print(rs.getString("Password")+"\t"); 
    System.out.print(rs.getString("Address")+"\t");
    System.out.print(rs.getString("Date")+"\t");
    System.out.print(rs.getString("Month")+"\t");
    System.out.print(rs.getString("Year")+"\t");
    System.out.print(rs.getString("Select Domain")+"\t");
    System.out.print(rs.getString("Gender")+"\t");
    System.out.print(rs.getString("SelectCourses")+"\t");
   }
   con.close();
   stmt.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}