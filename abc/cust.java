class customer 
{ 
int purchase,paid; 
String name,add; 
  void display() 
   { 
     System.out.println("Name is :" + name + "\n" + "Address is :" + add + "\n" + 
                        "Purchase :" + purchase + "\n" + "Paid rupee" + paid); 
   } 
  void pending() 
   { 
     int pend; 
     pend=purchase-paid; 
     System.out.println("Pending balance is :" + pend); 
   } 
} 

 class cust 
 { 
  public static void main(String args[]) 
   { 
     customer c1=new customer(); 
     c1.name=(args[0]); 
     c1.add=(args[1]); 
     c1.purchase=Integer.parseInt(args[2]); 
     c1.paid=Integer.parseInt(args[3]); 

     c1.display(); 
     c1.pending(); 
   } 
 }
