package bankings;


import java.util.Scanner;

public class User {
	 int actno;
	 String name;
	 int phonenum;
	 String address;
	 int pin;
	 long balance = 1000;
	
	public User(int actno,String name,int phonenum,String address,int pin)
	{
		this.actno = actno;
		this.name = name;
		this.phonenum = phonenum;
		this.address = address;
		this.pin = pin;
		
	}
	
public User() {
		super();
	}



public int getActno()
   {
	   return actno;
   }
   
   public void setActno(int actno)
   {
	   this.actno = actno;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public void setName(String name)
   {
	   this.name = name;
   }
   
   
   public int getPhonenum()
   {
	   return phonenum;
   }
   
   public void setPhonenum(int phonenum)
   {
	   this.phonenum = phonenum;
   }
   
   
   public String getAddress()
   {
	   return address;
   }
   
   public void setAddress(String address)
   {
	   this.address = address;
   }
   
   public int getPin()
   {
	   return pin;
   }
   
   public void setPin(int pin)
   {
	   this.pin = pin;
   }
   
   public long getBalance()
   {
	   return balance;
   }
   
   public void setBalance(int balance)
   {
	   this.balance = balance;
   }

   
   
}
	


