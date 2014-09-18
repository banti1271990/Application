class dig
{
 int num;
 dig(int num)
 {
  this.num=num;
 }
 void display()
 {
  int rev=0,rem;
  while(num>0)
  {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
   }
   System.out.println(rev);
 }
 
}
class reverse
{
 public static void main(String args[])
 {
  dig d = new dig(54321);
  d.display();
 }
}