import java.io.*;
class cut
{
 public static void main(String args[])throws IOException
 {
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  FileWriter f1 = new FileWriter("abc.text");
  int count=0;
  String s;
  do
  {
   s=b.readLine();
   f1.write(s);
   f1.write("\n");
   count++;
   }while(!(s.equalsIgnoreCase("quit")));  
      
   System.out.println("number of lines = "+count);
   f1.close();
  }
 }