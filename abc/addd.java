import java.util.Scanner;
class addd
{
  public static void main(String args[])
  {
    int sum,a,b;
   System.out.println("Enter two integers to calculate their sum ");
   Scanner n=new Scanner(System.in);
   a=n.nextInt();
   b=n.nextInt();
    sum=a+b;
System.out.print("sum of two number is ");
   System.out.println(sum);
  }
}