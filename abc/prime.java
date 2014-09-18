import java.util.*;
class prime
{
   public static void main(String args[])
      {
          int i,num;
          System.out.print("Enter the value of num=");
          Scanner m = new Scanner(System.in);
          num = m.nextInt();
          for(i=2;i<=num;i++)
          {
             if(num%i==0)
              break;
          }
          if(num==i)
          {
             System.out.print(" The number is prime="+num);
           }
          else
           {
              System.out.print("The number is not a prime number="+num);
            }
      }
}