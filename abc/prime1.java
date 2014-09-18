import java.util.*;
class prime1
{
  public static void main(String args[])
   {
      int n,i,p=1,j;
      System.out.print("Enter the value for n to print prime number = ");
      Scanner m = new Scanner(System.in);
      n = m.nextInt();
      for(i=1;i<=n;i++)
      {
         for(j=2;j<i-1;j++)
          {
             if(i%j==0)
             {
                  p=0;
                  break;
             }
             else
             {
               p=1;
             } 
          }
          if(p==1)
           System.out.println(i);
      } 
   }
}