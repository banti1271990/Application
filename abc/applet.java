import java.awt.*;
import java.applet.*;
/* <applet code = "app5" height = 800 width = 800>
 </applet>*/
public class app5 extends Applet
{
  frame1 f; 
  public void init()
  {
    f = new frame1("Frame window");
  }
  public void start()
  {
    	f.setSize(400,400);
	f.setVisible(true);
  }
  public void stop()
  {
    f.setVisible(false);
  }
  public void paint(Graphics g)
  {
    g.drawString("Applet window",200,200);
  }
 }
class frame1 extends Frame
{
 frame1(String s)
 {
   super("frame window");
 }
 public void paint(Graphics g)
 {
  g.drawString("This is my frame window",200,200);
 }
}
