import java.applet.*;
import java.awt.*;
 public class appy extends Frame
 {
  Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
  Font f;
  TextField t1,t2;
  Checkbox c1,c2,c3,c4,c5;
  Button b1,b2;
  TextArea a;
  Choice h,h1,h2,h3;
  public appy()
  {
     String months[] = {"Jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
     setLayout(null);
     f=new Font("Monotype Corsiva",Font.BOLD|Font.ITALIC,24);
     l1 = new Label("login form");
     l1.setFont(f);
     l2 = new Label("user name");
     l3 = new Label("password");
     t1 = new TextField(15);
     t2 = new TextField(15);
	t2.setEchoChar('*');
     l4 = new Label("Subjects");
     c1 = new Checkbox("Computer Graphics");
     c2 = new Checkbox("operating System");
     c3 = new Checkbox("Data Communication & networking");
     c4 = new Checkbox("Artificial Intelligence");
     c5 = new Checkbox("Object Technology");
     b1 = new Button("submit");
     b2 = new Button("cancel");
     l5 = new Label("Address");
      a = new TextArea(" ");
      l = new Label("Date Of Birth");
     l6 = new Label("Date");
      h = new Choice( );
     l7 = new Label("Month");
     h1 = new Choice( );
     l8 = new Label("Year");
     h2 = new Choice( );
     l9 = new Label("Post Graduation");
     h3 = new Choice( );
     for(int j=1;j<=31;j++)
     {
      h.addItem(j+"");
     }
     for(int i=0;i<12;i++)
     {
       h1.addItem(months[i]);
     }
     for(int k=1947;k<=2020;k++)
     {
      h2.addItem(k+"");
     }
     add(l1);
     add(l2);
     add(t1);
     add(l3);
     add(t2);
     add(l4);
     add(c1);
     add(c2);
     add(c3);
     add(c4);
     add(c5);
     add(b1);
     add(b2);
     add(l5);
     add(a);
     add(l);
     add(l6);
     add(h);
     add(l7);
     add(h1);
     add(l8);
     add(h2);
     add(l9);
     add(h3);  
     l1.setBounds(350,100,150,30);
     l2.setBounds(200,150,100,30);
     t1.setBounds(350,150,150,30);
     l3.setBounds(200,200,100,30);
     t2.setBounds(350,200,150,30);
     l4.setBounds(200,250,100,30);
     c1.setBounds(200,300,200,40);
     c2.setBounds(200,350,200,40);
     c3.setBounds(200,400,200,40);
     c4.setBounds(200,450,200,40);     
     c5.setBounds(200,500,200,40);
     b1.setBounds(200,550,50,30);
     b2.setBounds(350,550,50,30);
     l5.setBounds(200,600,150,100);
      a.setBounds(350,600,150,50);
      l.setBounds(200,700,150,30);
     l6.setBounds(350,700,50,30);
      h.setBounds(400,700,50,30);
     l7.setBounds(450,700,50,30); 
     h1.setBounds(500,700,50,30); 
     l8.setBounds(550,700,50,30); 
     h2.setBounds(600,700,100,30);
     l9.setBounds(200,800,150,30);
     h3.setBounds(400,800,100,30);
   }
  public static void main(String args[])
  {
    appy a = new appy();
    a.setSize(800,800);
    a.setVisible(true); 
  } 
}
      
 