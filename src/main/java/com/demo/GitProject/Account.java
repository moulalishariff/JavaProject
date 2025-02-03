package com.demo.GitProject;

class SavingsAccount implements BankAccount{
	public double amount=0;
	
	@Override
	public void deposit(double amt) {
		amount=amount+amt;
		System.out.println(amt+"/- is Depositing");
		System.out.println("Balance: "+amount+"\n");
	}

	@Override
	public void withdraw(double amt) {
		
		if(amount<1000) {
			System.out.println("Minimum Balance is 1000/- "+"\n"+"Not Available, Deposit the Amount");
			System.out.println("Balance: "+amount+"\n");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"/- is Withdrawing");	
			System.out.println("Balance: "+amount+"\n");
		}
	}
	
}
class SalaryAccount implements BankAccount{
	public double amount=0;
	
	@Override
	public void deposit(double amt) {
		amount=amount+amt;
		System.out.println(amt+"/- is Depositing");
		System.out.println("Balance: "+amount+"\n");
	}

	@Override
	public void withdraw(double amt) {
		
		if(amount<2000) {
			System.out.println("Minimum Balance is 2000/- "+"\n"+"Not Available, Deposit the Amount");
			System.out.println("Balance: "+amount+"\n");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"/- is Withdrawing");
			System.out.println("Balance: "+amount+"\n");
			}
		}
}
public class Account {

	public static void main(String[] args) {
		BankAccount b1=new SavingsAccount();
		b1.deposit(500);
		b1.deposit(100);
		b1.withdraw(100);
		b1.deposit(1000);
		b1.withdraw(500);
		
		BankAccount b2=new SalaryAccount();
		b2.deposit(500);
		b2.deposit(100);
		b2.withdraw(100);
		b2.deposit(1000);
		b2.withdraw(500);
	}

}
