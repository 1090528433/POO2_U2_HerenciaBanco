package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> obAccount = new ArrayList<Account>();

	public Bank() {
	}

	public void payDividend(int accnum, double sum) {

		for (int i = 0; i < obAccount.size(); i++) {
			if (accnum == obAccount.get(i).getAccountNumber()) {
				obAccount.get(i).deposit(sum);
				System.out.println("Balance de la cuenta: <" + accnum + "> $"+ mostrarBalance(accnum));
			}
		}
	}

	public void withdrawAccount(int accnum, double sum) { 
		System.out.println("Estoy retirando dinero");
		for (int i = 0; i < obAccount.size(); i++) {
			if (accnum == obAccount.get(i).getAccountNumber()) {

				obAccount.get(i).withdraw((sum));

				System.out.println("Balance de la cuenta: <" + accnum + "> $"+ mostrarBalance(accnum));
			}
		}
	}

	public void cuentaEnSobregiro() {
		for (int i = 0; i < obAccount.size(); i++) {
			if (obAccount.get(i).getBalance() < 0) {
				System.out.println("Esta cuenta esta en sobregiro: " + obAccount.get(i).getAccountNumber());
			}
		}

	}

	public double mostrarBalance(int accnum) {

		for (int i = 0; i < obAccount.size(); i++) {
			if (accnum == obAccount.get(i).getAccountNumber()) {
				return obAccount.get(i).getBalance();
			}
		}

		return 0;
	}

	// Aqui abrimos las cuentas
	public void openAccount(char tipoCuenta, int codigoCuenta) {
		if (tipoCuenta == 'A') {
			obAccount.add(new SavingsAccount(codigoCuenta));
		} else if (tipoCuenta == 'C') {
			obAccount.add(new CurrentAccount(codigoCuenta));
		} else {
			System.err.println("No se puede registrar otro tipo de cuenta");
		}
	}

	// Aqui cerramos las cuentas
	public void cerrarCuenta(int codigoCuenta) {
		for(int i = 0; i<obAccount.size(); i++) {
			if(codigoCuenta == obAccount.get(i).getAccountNumber()) {
				obAccount.remove(i);
			}
		}
	}
	
	public void sendLetterToOverdraftAccounts() {
		for(int i = 0; i<obAccount.size(); i++) {
			if(obAccount.get(i).getBalance() < 0) {
				System.out.println("Sending letter to this " + obAccount.get(i).getAccountNumber() + " account");
			}
		}
	}

}
