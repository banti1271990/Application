import java.util.*;
class Table
{
 public static void main(String args[])
 {
   int n,tab,i;
   System.out.print("Enter the value of n = ");
   Scanner in = new Scanner(System.in);
   n=in.nextInt();
   System.out.println("Table of two ");
   for(i=1;i<=10;i++)
   {
      tab = n*i;
     System.out.println(tab);
   }
 }
}