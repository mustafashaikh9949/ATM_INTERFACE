package Level1Task1;


import java.util.*;

class ATM{
	float Balance;
	int PIN = 9949;
	 
	public void checkpin() {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if (enteredpin == PIN) {
			menu();
		}
		else {
			System.out.println("The wrong pin type the correct pin  ");
		}
	}
		
	public void menu() {
		System.out.println("Enter Your Choice");
		System.out.println("1.Transaction History");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Transafer1");
		System.out.println("5.Quit");
		Scanner sc = new Scanner(System.in);
		
		int opt = sc.nextInt();
		if(opt == 1) {
			TransactionHistory();
		}
		else if(opt == 2) {
			Withdraw();
		}
		else if(opt ==3) {
			Deposit();
		}
		else if(opt == 4) {
			Transafer1();
		}
		else if(opt ==5) {
		 return;
	    }
		else {
			System.out.println("Enter a valid choice");
		}
	}



public void TransactionHistory() {
	
	System.out.println("Balance " + Balance);
	menu();
  }
  
  public void Withdraw() {
	  System.out.println("Enter amount to withdraw");
	  Scanner sc = new Scanner(System.in);
	  float amount = sc.nextFloat();
	  if(amount >Balance) {
		  System.out.println("Insuffient Balnace");
	 }
	  else {
		  Balance = Balance - amount;
		  System.out.println("Money Withdraw Successfully");
	  }
	  menu();
  }
  public void Deposit() {
	   System.out.println("Enter the amount");
	   Scanner sc = new Scanner(System.in);
	   float amount = sc.nextFloat();
	   Balance = Balance +amount ;
	   System.out.println("Money Deposited Successfully");
	   menu();
  }
  
  public void Transafer1() {
	  System.out.println("Enter the amount");
	  Scanner sc = new Scanner(System.in);
	  float amount = sc.nextInt();
	  Balance = Balance - amount ;
	  System.out.println("Transafer amount Successfully");
	  menu();
  }
   
  public void Quit() {
	  Scanner sc = new Scanner(System.in);
	  return;
  }
 
  }

public class ATM_MACHINE{
	public static void main(String[]args) {
	
		ATM obj = new ATM();
		obj.checkpin();
	}
}








