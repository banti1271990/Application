
import java.util.Scanner;
 
class Add
{
   public static void main(String args[])
   {
      int x, y, Sum,Sub,Mul,Div;
      System.out.println("Enter two integers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      Sum = x + y;
      Sub = x - y;
      Mul = x * y;
      Div = x / y;
      System.out.printf("Sum of entered integers =%d\n",Sum);
       System.out.printf("Subtraction of entered integers =%d\n",Sub);
     System.out.printf("Multiplication of entered integers =%d\n",Mul);
   System.out.printf("Multiplication of entered integers =%d\n",Div);
   }
}
