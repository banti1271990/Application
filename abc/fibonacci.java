import java.io.*;
class fibonacci 
{
 public static void main(String args[])throws IOException
 {
  BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter one number= ");
  int n = Integer.parseInt(m.readLine()); 
  int a,b,c;
  a=0;
  b=1;
  c=a+b;
  System.out.println(a);
  System.out.println(b);   
  while(c<=n)
  {
   a=b;
   b=c;
   c=a+b;
   System.out.println(c);    
  }     

   System.out.println("\n");   
 }

}