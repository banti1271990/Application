import java.io.*;
class factorial
{
 public static void main(String args[])throws IOException
 {
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter one number= ");
  int n = Integer.parseInt(b.readLine()); 
  int i,ft=1;
  for(i=1;i<=n;i++) 
  { 
  ft=ft*i;
  } 
  System.out.println(ft);   
 }

}