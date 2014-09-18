import java.util.*;
class Harmonic
{
   public static void main(String args[])
    {
      int n;
      float sum=0,i=1;
     System.out.println("Enter  number= ");
     Scanner in = new Scanner(System.in);
     n=in.nextInt();
      for(;i<=n;)
       {
       
         sum=sum+1/i;
         i++;
       }
     System.out.println("Sum of harmonic series = " +sum);     
     }
}