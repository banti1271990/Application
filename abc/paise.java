import java.util.*;
class Paise
{
  public static void main(String args[])
   {
      double n;
      double paise;
      System.out.println("Enter the Rupees in decimal  ");
      Scanner in = new Scanner(System.in);
      n = in.nextDouble();
      paise=n*100;
      System.out.println("Paise are "+paise);
   }
}