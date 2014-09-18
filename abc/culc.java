abstract class figure
{
 abstract void area();
}
class rectangle extends figure
{
 int l,b;
 rectangle(int l,int b)
 {
  this.l=l;
  this.b=b;
 }
 void area()
 {
  float ar;
  ar=l*b;
  System.out.println(ar);
 }
}
class circle extends figure
{
 int r;
 circle(int r)
 {
  this.r=r;
 }
 void area()
 {
  double a;
  a=3.14*r*r;
  System.out.println(a);
 } 
} 
class calc
{
 public static void main(System args[])
 {
   circle c = new circle(10);
   c.area();
   rectangle v = new rectangle(5,10);
   v.area();
 }
}