class Swap
{
  int n1,n2;
  void getdata(int num1,int num2)
  {
    n1 = num1;
    n2 = num2;
   System.out.println("value Before swap = "+n1+"\nValue Before Swap = "+n2);

   
  }
}
class Swap1
{
  public static void main(String args[])
 {
   int a=6;
   Swap sp = new Swap();
    
   sp.getdata(45,54);
   sp.n1 =sp.n1+sp.n2;
   sp.n2 = sp.n1-sp.n2;
   sp.n1 = sp.n1-sp.n2;
   System.out.println("value After swap = "+sp.n1+"\nValue After Swap = "+sp.n2);
   Swap pp = new Swap();
   pp.getdata(22,33);
   pp.getdata(67,76);
   pp.n1 =pp.n1+pp.n2;
   pp.n2 = pp.n1-pp.n2;
   pp.n1 = pp.n1-pp.n2;
   System.out.println("value After swap = "+pp.n1+"\nValue After Swap = "+pp.n2);
   System.out.println("a++="+a++ +"\n++a="+ ++a);
    
   
   
 
 }
}
