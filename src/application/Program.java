package application;

import entities.BancoArray;
import entities.Conta;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		BancoArray BancoItau =new BancoArray();
		Conta ContadoJeff =new ContaPoupanca("123");
		Conta ContadoBill =new Conta("1234");
		BancoItau.setTaxa(0.5);
		
		BancoItau.cadastrar(ContadoJeff);
		ContadoJeff.creditar(200.0);
		if(BancoItau.saldo("123")==200.0){
			System.out.println("TRUE");	
			}
		else {	
			System.out.println("FALSE");
		}
		BancoItau.debitar("123",100.0);
		if(BancoItau.saldo("123")==100.0){
			System.out.println("TRUE");	
			}
		else {	
			System.out.println("FALSE");
		}
		
		BancoItau.renderJuros("123");
		if(BancoItau.saldo("123")==150.0){
		System.out.println("TRUE");	
		}
		else {
			System.out.println("FALSE");
		}
		
		BancoItau.cadastrar(ContadoBill);
		ContadoBill.creditar(200.0);
		BancoItau.debitar("1234",100.0);
		if(BancoItau.saldo("1234")==100.0){
			System.out.println("TRUE");	
			}
		BancoItau.transferir("123","1234" ,100.0);
		if(BancoItau.saldo("123")==50.0 && BancoItau.saldo("1234")==200.0){
			System.out.println("TRUE");	
			}
		else {
			System.out.println("FALSE");
		}
	}
}
