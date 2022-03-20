package ufps.poo2.ejercicio.banco;

public class CurrentAccount extends Account {
	
	//Creacion de variable Limite de Sobregiro
	private double lim;
	
	public CurrentAccount(int a) {
		super(a);
		setLimite(-2000000);
	}
	
	public void setLimite(double limi) {
		lim = limi;
	}
	
	@Override
	public void withdraw(double sum) {
		
		if(sum >= lim) {
			super.withdraw(sum);
		}
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}
	

}
