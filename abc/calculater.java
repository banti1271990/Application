class add
{
 int a,b;
 add(int a,int b)
 {
  this.a = a;
  this.b = b; 
 }
 void display()
 {
  int c;
        c = a+b;
        System.out.println(c); 
 } 
}
class sub 
{
 int m,n; 
 sub(int m,int n)
 {
  this.m=m;
  this.n=n; 
 }
 void display()
 {
  int d;
       d = m-n;
       System.out.println(d); 
 }
}
class mul
{
 int k,l;
 mul(int k,int l)
 {
  this.k=k;
  this.l=l; 
 } 
 void display()
 {
  int r;
        r = k*l;
        System.out.println(r); 
 }
}
class div
{
 int p,q;
 div(int p,int q) 
 {
  this.p=p;
  this.q=q;
 }
 void display()
 {
  int o;
        o = p/q;
        System.out.println(o); 
 } 
}
class calculater
{
 public static void main(String args[])
 {
  add x = new add(10,20);
      x.display();
  sub y = new sub(95,85);
      y.display();
  mul z = new mul(89,89); 
      z.display();  
  div s = new div(60,5);
      s.display();
 }
}