package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> obAccount = new ArrayList<Account>();
	
	public Bank() {}
	
	public String deposito(int accnum, double sum) {
		
		for(int i = 0; i < obAccount.size(); i++) {
			if(accnum == obAccount.get(i).getAccountNumber()){
			obAccount.get(i).deposit(sum);
			System.out.println("Deposito realizado");
			return String.valueOf(obAccount.get(i).getBalance());
			}
		}
		return new String("La cuenta no existe");
		
	
	}
	
	public double withdrawAccount(int accnum, double sum) {
		System.out.println("Estoy retirando dinero");
		for(int i = 0; i<obAccount.size(); i++) {
			if(accnum == obAccount.get(i).getAccountNumber()) {
				
				obAccount.get(i).withdraw((sum));
				return obAccount.get(i).getBalance();
			}
		}
		return 0;
	}
	
	public Account mostrarCuenta(int accnum) {
		
		for(int i = 0; i < obAccount.size(); i++) {
			if(accnum == obAccount.get(i).getAccountNumber()) {
				return obAccount.get(i);
			}
		}
		
		return new Account(1);
	}
	//Aqui abrimos las cuentas
	public void openAccount(char tipoCuenta, int codigoCuenta){
		if(tipoCuenta == 'A') {
	   obAccount.add(new SavingsAccount(codigoCuenta));
		}else if (tipoCuenta == 'C') {
			obAccount.add(new CurrentAccount(codigoCuenta));
		}
		else {
			System.err.println("No se puede registrar otro tipo de cuenta");
		}
	  }
	
	//Aqui cerramos las cuentas
	public void cerrarCuenta(char tipoCuenta, int codigoCuenta){
		if(tipoCuenta == 'A') {
	   obAccount.remove(new SavingsAccount(codigoCuenta));
		 }else if(tipoCuenta == 'C')
			 obAccount.remove(new CurrentAccount(codigoCuenta));
		}
	
	public double getBalance(int codigoCuenta) {
		
		for(int i = 0; i < obAccount.size(); i++) {
			if(codigoCuenta == obAccount.get(i).getAccountNumber()) {
				return obAccount.get(i).getBalance();
			}
		}
		
		return 0;
	}
	
	public void auxiliar() {
		for(int i = 0; i < obAccount.size(); i++) {
			System.out.println(obAccount.get(i).toString());
		}
	}
		
  }
	
   
	


