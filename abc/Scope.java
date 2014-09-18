class Scope
{
 public static void main(String args[])
  {
    int m = 10;
    {
     int m1=20;
     System.out.println("m1="+m1);

    }
System.out.println("m="+m);
   }
}