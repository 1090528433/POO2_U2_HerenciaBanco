package ufps.poo2.ejercicio.banco;

public class CurrentAccount extends Account {
	
	//Creacion de variable Limite de Sobregiro
	private double lim = -90000000;
	
	public CurrentAccount(int a) {
		super(a);
		
	}
	
	public void withdraw(double sum) {
		
		if(sum <= getBalance() && sum >= lim) {
			super.withdraw(sum);
		}
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}
	

}
