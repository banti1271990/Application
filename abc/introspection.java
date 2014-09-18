import java.lang.reflect.*;
class introspection
{
 public static void main(String args[])throws Exception
 {
  Class c = Class.forName("java.awt.Dimension");
  Constructor cos[] = c.getConstructors();
System.out.println("Constructors................");
  for(int i=0;i<cos.length;i++)
  System.out.println(cos[i]); 
  Method method[] = c.getMethods();
System.out.println("Methods................");
  for(int j=0;j<method.length;j++)
  System.out.println(method[j]);
  Field field[] = c.getFields();
System.out.println("Fields................");
  for(int k=0;k<field.length;k++)
  System.out.println(field[k]);
 }
}