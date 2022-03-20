package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Bank;

public class Client {

public static void main(String[] args) {
		
//	Bank b = new Bank();
//	b.deposito(13, 500000);
//	b.deposito(13, 500000);
//	b.retirar(13, 250000);
//	
//	System.out.println(b.mostrarCuenta(13).toString());
	
		// Account acObj = new Account(); // Genera error, ¿por qué?
		
		// ================================================
		// TESTING ACCOUNT CLASS	
		// ================================================
	
		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------
	
//		Account acObj = new Account(4); 
//		
//	
//		System.out.println(acObj.getBalance());
//		acObj.deposit(10);
//		acObj.deposit(40);
//		acObj.deposit(20);
//		System.out.println(acObj.getBalance());
//		acObj.withdraw(20);
//		System.out.println(acObj.getBalance());
		
		// ================================================
		// TESTING BANK CLASS	
		// ================================================
		
		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------
		
		
		Bank bank = new Bank(); 		
		
		bank.openAccount('A', 3354678);
		bank.openAccount('A', 3359302);
		bank.openAccount('C', 3379844);
		
//		bank.payDividend(3354678, 10);
//		bank.payDividend(3354678, 30);
		
//		bank.payDividend(3359302, 50);
//		bank.payDividend(3359302, 50);
//		
//		bank.payDividend(3379844, 10);
//		bank.payDividend(3379844, 10);
		
		bank.deposito(3354678, 10); bank.auxiliar();
		bank.deposito(3354678, 30); bank.auxiliar();
		
		bank.deposito(3359302, 50); bank.auxiliar();
		bank.deposito(3359302, 50); bank.auxiliar();
		
		bank.deposito(3379844, 10); bank.auxiliar();
		bank.deposito(3379844, 100); bank.auxiliar();
		
		System.out.println("*** Val = "+bank.getBalance(3379844));
		
		bank.withdrawAccount(3379844, 20); bank.auxiliar();
		bank.withdrawAccount(3379844, 5); bank.auxiliar();
		
		System.out.println("*** Val = "+bank.getBalance(3379844));
		
		bank.withdrawAccount(3379844, 15); bank.auxiliar();
		
		System.out.println("*** Val = "+bank.getBalance(3379844));
		
//		bank.sendLetterToOverdraftAccounts();
		
	
		// ==================================================
	
	
		/*
		 	Debería obtener un resultado similar a este:
		 	
		 	*** Val = 20.0
			CurrentAccount.withdraw
			CurrentAccount.withdraw
			Bank.getBalance
			Bank.payDividend ::: ac.getBalance() = -5.0
			*** Val = -5.0
			CurrentAccount.withdraw
			CurrentAccount.withdraw(...): cannot withdraw this amount.
			Bank.getBalance
			Bank.payDividend ::: ac.getBalance() = -5.0
			*** Val = -5.0
			Sending letter to this 3379844 account
		 */
		
	}
	
}
