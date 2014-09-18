import java.applet.*; 
 import java.awt.*; 
 /*<APPLET CODE="param1" HEIGHT=500 WIDTH=500> 
   <PARAM NAME="num1" VALUE="10"> 
   <PARAM NAME="num2" VALUE="60"> 
   </APPLET> 
 */ 
 public class param1 extends Applet 
   { 
     int n1,n2,max,min; 
    public void init() 
     { 
       n1=Integer.parseInt(getParameter("num1")); 
       n2=Integer.parseInt(getParameter("num2")); 
      if(n1>n2) 
       { 
         max=n1; 
         min=n2; 
       } 
      else 
       { 
         max=n2; 
         min=n1; 
       } 
     } 
  public void paint(Graphics g) 
   { 
    g.drawString("Maximum no is: "+ max,100,100); 
    g.drawString("Minimum no is: "+ min,100,200); 
   } 
  } 

