package Bank;

import java.io.DataInputStream;
import java.io.IOException;

//Parent class Account
 class Account{
	
	//Variables for user
	private String accountNumber;
	private String customerName;
	private double balance;
	
	
	public Account(String accountNumber,String customerName,double balance){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}
		
	//Getter and setter methods
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Display Information
	public void displayInformation() {
		System.out.println("Customer Name "+getCustomerName());
		System.out.println("Account Number "+getAccountNumber());
		System.out.println("Account Balance "+getBalance());
		
	}
}
 
//Maintenance Charges Interface
interface MaintenanceCharge{
	public float calculateMaintenanceCharge(float noOfYear);
}

//Child class is CurrentAccount class
class CurrentAccount extends Account implements MaintenanceCharge{
	float m=100;
	
	public CurrentAccount(String accountNumbe,String customerName,double balance){
		super(accountNumbe,customerName,balance);
	}
	public float calculateMaintenanceCharge(float noOfYear) {
		float n=noOfYear;
		return ((m*n)+(float)200);
	}
		
}

//Child class  is SavingAccount class
class SavingAccount extends Account implements MaintenanceCharge{
	
	//Base maintenance charges
	float m=50;
	float maintenanceCharge;
	public SavingAccount(String accountNumbe,String customerName,double balance) {
		super(accountNumbe,customerName,balance);
	}
	
	public float calculateMaintenanceCharge(float noOfYear) {
		float n=noOfYear;
		return ((m*n)+(float)50);
	}
	
}

//UserInterface class for user info
 class UserInterface {
	
	public static void main(String args[])throws IOException {
		
		int choice;
		float noOfYear;
		String accountNum;
		String customerName;
		double balance;
		float maintenanceCharge;
		
		//creating object for taking user input
		DataInputStream userInput=new DataInputStream(System.in);
		System.out.println("1. Saving Account \n2. Current Account");
		
		//For asking user choice
		System.out.println("Enter your choice: ");
		choice=Integer.parseInt(userInput.readLine());
		
		//If choice is 1 then it will calculate maintenance charges for savingAccount 
		//If choice is 2 then it will calculate maintenance charges for curreAccount 
		switch(choice){
		
			case 1:
				//Taking user input
				System.out.println("Enter the Account number");
				accountNum=userInput.readLine();
				System.out.println("Enter the Customer Name");
				customerName=userInput.readLine();
				System.out.println("Enter the Balance amount");
				balance=Double.parseDouble(userInput.readLine());
				System.out.println("Enter the number of years");
				noOfYear=Float.parseFloat(userInput.readLine());
				
				//Creating object of SavingAccount class
				SavingAccount savingAccount=new SavingAccount(accountNum, customerName, balance);
			    maintenanceCharge=savingAccount.calculateMaintenanceCharge(noOfYear);
			    savingAccount.displayInformation();
				System.out.println("Maintenance Charge for Saving Account is Rs "+maintenanceCharge);
				break;
				
			case 2:
				//Taking input from user
				System.out.println("Enter the Account number");
				accountNum=userInput.readLine();
				
				System.out.println("Enter the Customer Name");
				customerName=userInput.readLine();
				
				System.out.println("Enter the Balance amount");
				balance=Double.parseDouble(userInput.readLine());
				
				System.out.println("Enter the number of years");
				noOfYear=Float.parseFloat(userInput.readLine());
				
				//Creating object of currentAccount class
				CurrentAccount currentAccount=new CurrentAccount(accountNum, customerName, balance);
			    maintenanceCharge=currentAccount.calculateMaintenanceCharge(noOfYear);
			    
			    System.out.println("Customer Name "+currentAccount.getCustomerName());
			    
				System.out.println("Account Number "+currentAccount.getAccountNumber());
				
				System.out.println("Account Balance "+currentAccount.getBalance());
				
				currentAccount.displayInformation();
				System.out.println("Maintenance Charge for Current Account is Rs "+maintenanceCharge);
				break;
				
			default:
				System.out.println("You have entered wrong choice..please try again");
				break;				
		}
		
		
	}
}