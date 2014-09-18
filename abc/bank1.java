class bank 
 { 
  int acc_no,bal,bal1,bal2; 
   String name; 
   void deposit(int a) 
    { 
      bal1=bal+a; 
    } 
   void withdraw(int b) 
    { 
      bal2=bal1-b; 
    } 
   void display() 
    { 
      System.out.println("Account No. is: "+acc_no + "\n" + 
                         "Balance is: "+bal + "\n"+ 
                         "Name is: "+ name + "\n" + 
                         "Deposit balance is: "+ bal1 + "\n" + 
                         "Withdraw balance is : "+bal2); 
    } 
 } 
 class bank1 
  { 
   public static void main(String args[]) 
    { 
     bank a1=new bank(); 
     a1.acc_no=110; 
     a1.name="Shameem Khan"; 
     a1.bal=20000; 
     a1.deposit(4000); 
     a1.withdraw(5000); 

     a1.display(); 
   } 
 }
