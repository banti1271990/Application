import java.util.*;
class Fibb
{
  public static void main(String args[])
  {
    int a=0,b=1,n,i=1;
    System.out.print("Enter the value of n = ");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    System.out.println(+a +"\n" +b);
    while(i<=n)
   {
     a=b;
     b=i;
     i=a+b;
    System.out.println(i);
   }
  System.out.print("\n");
  } 
}