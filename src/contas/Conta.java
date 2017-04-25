package contas;

public abstract class Conta {
	
	protected int numero;
	protected String dono;
	protected double saldo;
	protected double limite;
	
	//getters e setters
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//métodos
	
	public abstract void atualiza(double taxa);
		
	

	  public boolean saca(double valor) {
	        if (this.saldo < valor) {
	          System.out.println("O Valor do saque é maior que o saldo");
	            return false;
	    } else {
	        this.saldo = this.saldo - valor;
	        return true;
	      }
	    }
	  
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" +
					" um valor negativo"
);
			} else {
			this.saldo += valor;
			}

	 }
	 public boolean transfere(Conta origem, Conta destino, double valor){
			if(this.saldo<valor){
	      System.out.println("O Valor que deseja transferir é maior que o saldo");
				return false;
			}else{
	      origem.saca(valor);
				destino.deposita(valor);
				return true;
			}
	 }
}
