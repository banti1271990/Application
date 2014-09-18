class digit
{
 int num;
 digit(int num)
 {
  this.num=num;
 }
 void display()
 {
  int sum=0,rem,arm;
   arm=num;
   while(num>0)
   {
    rem=num%10;
    sum=sum+rem*rem*rem;
    num=num/10;
   }
    if(arm==sum)
    {
 
     System.out.println("this digit is armstrong");
    }
    else
    {
     System.out.println("this digit is not armstrong");
    }
  }
 
}
class armstrong
{
 public static void main(String args[])
 {
  digit d = new digit(153);
  d.display();
 }
}