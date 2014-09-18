import java.applet.*;
import java.awt.*;
/* <Applet code = "app2" height=500 width=500>
   <param name = "num1" value="20"> 
   <param name = "num2" value="29">
  </Applet> */
public class app2 extends Applet
{
  int n1,n2,max=0;
  public void init()
  {
   n1=Integer.parseInt(getParameter("num1"));
   n2=Integer.parseInt(getParameter("num2"));
   if(n1>n2)
         max=n1;
    else
         max=n2;
   }
   public void paint(Graphics g)
   {
     g.drawString("maximum"+max,200,200);
     showStatus("my applet");
   }
  } 