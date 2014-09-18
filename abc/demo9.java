public class demo9
{
public static void main(String args[]);
{
int a,n=0;
a=Integer.parseInt(args[0]);
while(a>0)
{
a=a/10;
n++;
}
System.out.println("no of digits are"+n);

}
}