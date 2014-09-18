class large 
  { 
   public static void main(String args[]) 
    { 
      int max1=0, max2=0,max3=0; 
      for(int i=0;i<args.length;i++) 
       { 
         int n=Integer.parseInt(args[i]); 
         if(max1<n) 
          { 
            max3=max2; 
            max2=max1; 
            max1=n; 
          } 
    else if(max2<n) 
          { 
            max3=max2; 
            max2=n; 
          } 
    else if(max3<n) 
          { 
            max3=n; 
          } 
      } //end for 

    System.out.println("First largest no. is:"+ max1 + "\n" + 
                       "Second largest no. is:" + max2 + "\n" + 
                        "Third largest no.is:" + max3); 
   } 
 }

  




