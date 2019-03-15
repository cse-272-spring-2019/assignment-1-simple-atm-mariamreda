
package myatmproject;

public class myatm implements ATM {
	String[] methods= new String[50];
     
        int i=0;

 private int Balance;

     public myatm(int Balance) {
       this.Balance=Balance;
    }



    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getBalance() {
        return Balance;
    }

 public String[] HISTORY(){
 return methods;
 }
 
 public int get()
  {  
  return i;
    }         

  
 public int upcount()
 {
 
 i++;
  return i;
 }
 
  public int downcount()
  {       
  i--;
  return i;
  }
	
  
        @Override
   public void deposit (  int amount)
   {
       Balance = Balance + amount;
       methods[i]=("you use deposit method"+amount);
        i++;
    
   //System.out.println("You deposit:  " + amount);
 // System.out.println("your balance is  : " + Balance);
   }
   
   
        @Override
	public void withdrawal(int amount ) {
		// TODO Auto-generated method stub

	 	
	/* if (amount>10000)
		 System.out.println ("sorry you can’t wihdraw maxium withdraw daily is 10000");
	if (amount > Balance||Balance==0.0)
		 System.out.println("no enough money to withdraw");

	 if (amount<=Balance&&amount<=10000)
	 {*/
        Balance =Balance - amount;
        methods[i]=("you use withdraw method"+amount);
        i++;
	
//System.out.println("You withdrew: " + amount);
//System.out.println("Your balance is: " + Balance);
	 }
	}
        
    /*  public void checkBalance( )
        {
            System.out.println("your balance is : "+Balance);
        }

   }*/

