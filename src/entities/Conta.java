package entities;

public class Conta {
	private String numero;
    private double saldo;
    public Conta (String numero){
      this.numero = numero;
      saldo = 0.0;
    } 
       
    public void creditar(double valor){
      this.saldo = this.saldo + valor;
    }
    
    public void debitar(double valor){
      this.saldo = this.saldo - valor;
    }
    
    public String getNumero(){
      return numero;
    }
    
    public double getSaldo(){
      return saldo;
    }

    public void setTaxa(double valor){
	  
	  }
	  
	  public double getTaxa() {
	   return -1;
	  }
}
/*
 *   public class Conta {
    private String numero;
    private double saldo;
    private double juros;
    public Conta (String numero){
      this.numero = numero;
      saldo = 0.0;
    } 
    
    public void creditar(double valor){
      this.saldo = this.saldo + valor;
    }
    
    public void debitar(double valor){
      this.saldo = this.saldo - valor;
    }
    
    public String getNumero(){
      return numero;
    }
    
    public double getSaldo(){
      return saldo;
    }
    public double getJuros() {
  		return juros;
  	}
  	public void setJuros(double juros) {
		  this.juros = juros;
	}
  }
 */