package contas;
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	//subscreve o método da classe conta
	@Override
	public void atualiza(double taxa){
		this.saldo += this.getSaldo()*taxa*2;
	}

	public int compareTo(ContaPoupanca o){
		if (this.getNumero() < o.getNumero()){
			return -1;
			
		}
		if(this.getNumero() > o.getNumero()){
			return 1;
			
		}
		
		return 0;
	}


}
