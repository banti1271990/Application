import java.lang.*;
import java.io.*;
 class addmatrix
{
   static void add()
  {
   int a[][], b[][], c[][];
    
    a =  new int[3][3];
    b =  new int[3][3];
    c = new  int[3][3];
       DataInputStream dts =new DataInputStream(System.in);
    try
    {
      System.out.println("Enter first matrix 3*3 order:");
    for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
      {
            a[i][j]=Integer.parseInt(dts.readLine());
        }
      }
          System.out.println("Enter second Matrix 3*3 order:");
  for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
      {
            b[i][j]=Integer.parseInt(dts.readLine());
        }
      }
for (int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    {  
      c[i][j]=a[i][j]+b[i][j];
     }
   }
for(int i=0;i<3;i++)
   {
       for(int j=0;j<3;j++)
      {
            System.out.print(c[i][j]+"  ");
      }
    System.out.println("\t");    
           } 
   }
  catch(Exception x)
     {
      System.out.println("Error");
      }

   }
  public static void main(String arg[])
   {
add(); 
    }
   }





