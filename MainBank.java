package bankings;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBank {
	
	private static ArrayList <User> user1 = new ArrayList<User>();
	
	 public void CreateAcc() {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the Account Number:");
			int actno = sc1.nextInt();
			System.out.println("Enter the User Name:");
			String name=sc1.next();
			System.out.println("Enter the Phone Number:");
			int phonenum=sc1.nextInt();
			System.out.println("Enter the Address:");
			String address = sc1.next();
			System.out.println("Enter the Pin:");
			int pin = sc1.nextInt();
			//System.out.println("Balance:");
			System.out.println("Succesfull!!");
			User user = new User(actno,name,phonenum,address, pin);
			user1.add(user);
			
			
		}

	 public void withdraw()
	 {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the Account Number:");
	 	int actnum = sc.nextInt();
	 	System.out.println("Enter the Pin:");
	 	int Pin = sc.nextInt();
	 	System.out.println("Enter the Amount to Withdraw:");
	 	long withdraw = sc.nextLong();
	 	for(int i =0;i<user1.size();i++) {
	 		if(user1.get(i).getActno()==actnum && user1.get(i).getPin()==Pin)
	 		{
	 		if(withdraw<user1.get(i).balance)
	 		{
	 		  user1.get(i).balance = withdraw - user1.get(i).balance;
	 		  
	 		  System.out.println("Your Balance is:"+Math.abs(user1.get(i).balance));
	 		}
	 		 else if (withdraw>user1.get(i).balance && withdraw==0)
	 		{
	 			System.out.println("Cannot Withdraw");
	 		}
	 		 else if (withdraw-user1.get(i).balance==0)
	 		 {
	 			 System.out.println("Your Balance is:" +0);
	 		 }
	 	     }
	 		else{
	 			System.out.println("Something Went Wrong");
	 		}
	 	}
	 }
	 public void Display() {
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("Enter the Pin");
	 int Pin = sc1.nextInt();
	 System.out.println("Enter Account Number:");
	 int AccountNumber = sc1.nextInt();
	 for(int i = 0;i<user1.size();i++) {
		 if((user1.get(i).getPin()==Pin) && (user1.get(i).getActno()==AccountNumber)) 
		 {
			 System.out.println("Your Account Number:"+user1.get(i).getActno());
			 System.out.println("Your Name:"+user1.get(i).getName());
			 System.out.println("Your Phone Number:"+user1.get(i).getPhonenum());
			 System.out.println("Your Address:"+user1.get(i).getAddress());
			 System.out.println("Balance:"+Math.abs(user1.get(i).balance));
		 }

		  else {
			  System.out.println("Enter the Correct pin:");
		  }
	  }
	 }
	 
	 public void Deposit() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Pin");
		 int Pin = sc.nextInt();
		 System.out.println("Enter Account Number:");
		 int AccountNumber = sc.nextInt();
		 for(int i = 0;i<user1.size();i++) {
			 if((user1.get(i).getPin()==Pin) && (user1.get(i).getActno()==AccountNumber)) 
			 {
			   System.out.println("Enter the amount to deposit:");	 
               long amount = sc.nextLong();			
			   if(amount < 5000)
			   {
				user1.get(i).balance = user1.get(i).balance + amount;
			   }
			   else
			   {
				   System.out.println("You cannot deposit more than 5000");
			   }
			 }
			 System.out.println("Your Balance is:"+Math.abs(user1.get(i).balance));
		 }
	 }
	 

	public static void main(String[] args) {
		
		
		int useroption = 0;
		Scanner sc = new Scanner(System.in);
		while(useroption > -1) 
		{
		if(useroption >= 0)
		{
			System.out.println("***** BANKING APPLICATION *****");	
			System.out.println("Enter 1 Create Account");
			System.out.println("Enter 2 View Balance");
			System.out.println("Enter 3 Deposit");
			System.out.println("Enter 4 Withdraw");
			System.out.println("Enter 5 View Details");
			System.out.println("Enter the option to proceed");
			
			useroption = sc.nextInt();
     		switch(useroption)
				{
				case 1: 
					System.out.println("Create Account:");
					MainBank bank = new MainBank();
					bank.CreateAcc();
					System.out.println("Account is Created Successfull!!");
					break;
					
				case 2:
					 System.out.println("View Balance");
					 Scanner sc1 = new Scanner(System.in);
					 System.out.println("Enter the Pin");
					 int Pin = sc1.nextInt();
					 System.out.println("Enter Account Number:");
					 int AccountNumber = sc1.nextInt();
					 for(int i = 0;i<user1.size();i++) {
				     if((user1.get(i).getPin()==Pin) && (user1.get(i).getActno()==AccountNumber)) 
				     {
					  System.out.println("Your balance is:"+Math.abs(user1.get(i).balance));
				     }
				     else {
				    	 System.out.println("Enter Valid Pin and Account Number: ");
				     }
					 }
					break;
				case 3:
					System.out.println("Deposit");
					MainBank bank3 = new MainBank();
					bank3.Deposit();
					break;
				case 4:
					System.out.println("Withdraw");
					MainBank bank1 = new MainBank();
					bank1.withdraw();
					break;
				case 5:
					 System.out.println("View Details");
					 MainBank bank2 = new MainBank();
					 bank2.Display();		
					 break;
		        }
     		
		}
		}
		
		
		
}
}
