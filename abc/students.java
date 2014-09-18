class RollRangeException extends Exception
{
 int r;
 RollRangeException(int r)
 {
  this.r=r;
 }
 public String toString()
 {
  return"RollRangeException"+r;
 } 
}
class students
{
 public static void check(int r)throws RollRangeException
 {
  if(r>=1&&r<=100)
   System.out.println(r);
   else
   throw new RollRangeException(r);
 }
 public static void main(String args[])
 {
int r=Integer.parseInt(args[0]);  
try
  {
   check(r);
  }
  catch(RollRangeException e)
  {
   System.out.println(e);
  }
 }
}