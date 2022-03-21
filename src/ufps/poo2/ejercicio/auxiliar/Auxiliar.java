package ufps.poo2.ejercicio.auxiliar;
import ufps.poo2.ejercicio.banco.CurrentAccount;


public class Auxiliar {
	
	
	public static boolean verificarSobregiro(double sum, CurrentAccount cuenta) {
		
		double resultado = 0;
		
		if(cuenta.getBalance() > 0) {
			resultado = Math.abs(cuenta.getLimite()) + cuenta.getBalance() ;
		}
		else{
			resultado = Math.abs(cuenta.getLimite() - cuenta.getBalance());
		}
		return resultado >= sum;
	}

}
