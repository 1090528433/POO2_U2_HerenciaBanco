package ufps.poo2.ejercicio.banco;

public class SavingsAccount extends Account{
	
	private double interest;
	
	public SavingsAccount(int a) {
		super(a);
		interest = 0.5;
	}
	
	public void deposit(double sum) {
		if (sum > 0) {
			double depo = (getBalance() * interest) + sum;
		    super.deposit(depo);
		}
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}
	

}
