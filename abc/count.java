import java.io.*;
class count
{
  public static void main(String args[])throws IOException
  {
    int count1=0;String s;
	BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
    do
    {
      s = n.readLine();
      count1++;
    }while(!(s.equalsIgnoreCase("quit")));
    System.out.println(count1);
   }
}
    