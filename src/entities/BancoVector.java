package entities;

import java.util.Vector;

public class BancoVector {   
	  private double taxa = 1.0;
	  Vector<Conta> contas = new Vector<>();	
	  public void cadastrar(Conta conta){
	     contas.add(conta);
	  }
	  
	  private Conta procurar(String numero){
	    for(Conta conta:contas) {
	      if(conta.getNumero().equals(numero)) {
	        return conta;
	      }
	    }
	    return null;
	  } 
	  
	  public void creditar(String numero, double valor){
		  Conta conta = procurar(numero);
	    if (conta != null) { 
	      conta.creditar(valor); 
	    } else { 
	      System.out.println("Conta Inexistente!");
	    }
	  } 
	  
	  public void debitar(String numero, double valor){
		 Conta conta = procurar(numero);
	    if (conta != null) { 
	      conta.debitar(valor); 
	    } else { 
	      System.out.println("Conta Inexistente!");
	    }    
	  } 
	  
	  public double saldo(String numero) {
		 Conta conta = procurar(numero);
	    if (conta != null) {
	      return conta.getSaldo();
	    } else { 
	      System.out.println("Conta Inexistente!");
	    }
	    return 0;
	  }
	  
	  public void transferir(String origem, String destino, double valor){
		 Conta contaOrigem = procurar(origem);
	    if(contaOrigem != null) {
	    Conta contaDestino = procurar(destino);
	      if(contaDestino != null) {
	        if(contaOrigem.getSaldo() > valor) {
	          contaOrigem.debitar(valor);
	          contaDestino.creditar(valor);
	        } else {
	          System.out.println("Saldo Insuficiente!");
	        }
	      } else {
	        System.out.println("Conta Destino n� " + destino + " Inexistente!");        
	      }
	    } else {
	      System.out.println("Conta Origem n� " + origem + " Inexistente!");
	    }
	  }  
	  
	 public void renderJuros(String numero) {
		  for(Conta conta:contas) {
		      if(conta.getNumero().equals(numero)) {
		        ((ContaPoupanca) conta).renderJuros(taxa);
		      }
	  }}
	  
	 public void setTaxa(double valor){
		 taxa=valor;
	  }
	  
	 public double getTaxa() {
		 return taxa;
	  }
	}
