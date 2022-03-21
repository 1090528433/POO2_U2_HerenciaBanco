package ufps.poo2.ejercicio.banco;

import ufps.poo2.ejercicio.auxiliar.Auxiliar;

public class CurrentAccount extends Account {
	
	//Creacion de variable Limite de Sobregiro
	private double lim;
	
	public CurrentAccount(int a) {
		super(a);
		setLimite(-200);
	}
	
	public double getLimite() {
		return lim;
	}
	
	public void setLimite(double limi) {
		lim = limi;
	}
	
	@Override
	public void withdraw(double sum) {
		
		if(sum > 0 && Auxiliar.verificarSobregiro(sum, this)) {
			super.withdraw(sum);
		}
		else
			System.err.println("Account.withdraw(...): " + "ese retiro supera el limite de sobregiro");
	}
	

}
