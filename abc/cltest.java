class cltest
{
  public static void main(String args[])
   {
     int count,i=0;
     String string;
     count = args.length;
     System.out.println('\b');
     System.out.println("count = " +count);
     while(i<count) 
     {
        string = args[i];
        i = i+1;
        System.out.println(i+ ":"  +  "Java is"  +string+  "!");
     }
   }
}