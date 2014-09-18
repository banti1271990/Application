import java.awt.*;
import java.applet.*;
/* <applet code = "app5" height = 800 width = 800>
 </applet>*/
public class app5 extends Applet
{
  public void init()
  {
   System.out.println("init() method called");
  }
  public void start()
  {
    System.out.println("start() method called");    
 }
  public void stop()
  {
   System.out.println("stop() method called");
  }
  public void destroy()
  {
   System.out.println("destroy() method called");
  }
  public void paint(Graphics g)
  {
    System.out.println("paint() method called");
    }
 }
  