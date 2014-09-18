class th implements Runnable
{
 Thread t;
 th()
 {
  t=new Thread(this);
  System.out.println(t);
  t.start();
  }
  public void run()
  {
   try
    {
     for(int i=1;i<=5;i++)
      {
        System.out.println(i);
        t.sleep(500);
       }
     }
     catch(InterruptedException ie)
      {
       System.out.println(ie);
      }
    }
 }
class th
{
  public static void main(String args[])
  {
   Thread t1 = Thread.currentThread();
   th t2 = new th();
    try
     {
       for(int i=1;i<=5;i++)
        {
         System.out.println(i);
         t1.sleep(1000);
        }
      }
      catch(InterruptedException e)
      {
        System.out.println(e);  
      } 
     }
  }  