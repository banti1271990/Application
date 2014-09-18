class th implements Runnable
{
 Thread t;
 String s;
 th(String s)
 {
  t= new Thread(this);
  this.s=s;
   t.start(); 
 }
 public void run()
 {
  try
   {
    for(int i=1;i<=5;i++)
     {
      System.out.println(s);
      t.sleep(500);
     }
    }
   catch(InterruptedException e)
   {
    System.out.println(e);
   }
 }
}
class cmtj
{
  public static void main(String args[])
  {
    th t1 = new th("hello");
    th t2 = new th("hi");
    th t3 = new th("welcome");
    try
    {
     t1.t.join();
     t2.t.join();
     t3.t.join(); 
    }
    catch(InterruptedException ie)
    {
     System.out.println(ie);
    }
  }
}