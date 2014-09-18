import java.sql.*;
import java.io.*;
class dbselect
{

 public static void main(String args[])
 {
   String name,course,address;
   float percentage;
  // BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
   Connection con = null;
   Statement stmt = null;
   ResultSet rs   = null;
   try
   {
    /*  System.out.println("Enter the name");
      name = b.readLine();
      System.out.println("Enter the percentage");
      percentage = Float.parseFloat(b.readLine());
      System.out.println("Enter the Course");
      course = b.readLine();
      System.out.println("Enter the address");
      address = b.readLine();    */

      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con = DriverManager.getConnection("jdbc:odbc:dsn1");
      stmt = con.createStatement();
      //int d = stmt.executeUpdate("insert into table1 values('"+name+"',"+percentage+",'"+course+"','"+address+"')");
      //int m = stmt.executeUpdate("update table1 set percentage = 75 where name = 'banti'");
      int n = stmt.executeUpdate("delete from table1 where name='harsh'");  
      rs = stmt.executeQuery("select * from table1");

    while(rs.next())
    {

     System.out.print(rs.getString("name")+"\t");
     System.out.print(rs.getInt("percentage")+"\t");
     System.out.print(rs.getString("course")+"\t");
     System.out.println(rs.getString("address")+"\t");    }
    con.close();
    stmt.close();
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
 }
}