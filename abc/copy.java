import java.io.*;
class cpoy
{
 public static void main(String args[])throws IOException
 {
  FileReader f1 = null;
  FileReader f2 = null; 
 }
 try
 {
  f1 = new FileReader(args[0]); 
  f2 = new FileReader(args[1]);
 }
 catch(Exception e)
 {
  System.out.println(e);
 }
 BufferedReader br = new BufferedReader(f1);
 System s;
 while((s=br.readLine())!=null)
 { 
  f2.write(s);
  f2.write("\n");
 }
  f1.close();
  f2.close();
}
}
 
    