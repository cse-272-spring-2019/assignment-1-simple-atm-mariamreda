
package myatmproject;
import java.util.Scanner;

public class view {
	//myatm atm =new myatm();
	// Scanner input =new Scanner(System.in);
    
         private int creditnumber;
	// private  int password;
         
        public view( int creditnumber/*, int password*/)
        {
        this.creditnumber=creditnumber;
       // this.password=password;
          
        }

    public void setCreditnumber(int creditnumber) {
        this.creditnumber = creditnumber;
    }

   /* public void setPassword(int password) {
        this.password = password;
    }*/

    public int getCreditnumber() {
        return creditnumber;
    }

   /* public int getPassword() {
        return password;
    }*/
    
	public boolean check ( int x/*, int y */) 
        {
           
	//System.out.println(" \t welcome to ATM machine \t ");
	//System.out.println("please enter your credit number:");
	//x=input.nextInt();
	//System.out.println("please enter your password:");
	//y=input.nextInt();
	 if (/*y==password &&*/ x==creditnumber)
	 {	//System.out .println("login successful");
         
	//Choice();	
return true;
         }
	 else 
		 {
		  return false;
 //System.out.println("your credit number or your password is wrong");
    //check();
	}
		
	
	} 
	
	
	/*public void Choice()
	{   
		System.out.println("chosse your process");
		System.out.println("1.withdraw \t 2.Deposit ");
		System.out.println("3.check balance");
	    System.out.println("4.next step  \t 5.pervious step\n");
	    

	
	int choice; 
	
	double amount;
	
	    do {
         System.out.println ("Enter your choice : ");
           choice=input.nextInt();

        } while (choice < 1 || choice > 3);
    
        switch(choice)
        {
      case 1:
       
   		 System.out.println("enter amount you want to withdraw:");
   		 amount=input.nextDouble();
          atm.withdrawal(amount);
      
            Choice();
            break;
            
       case 2:
        	System.out.println("enter amount you want to deposit:");
        	 amount=input.nextDouble();
          atm.deposit(amount);
          Choice();
            break;
            
        case 3: 
        	atm.checkBalance();
    
        	 Choice();
           
            break;
 
        default:
            break;
        
    }*/



}

