package contas;
import dados.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public void atualiza(double taxa){
		this.saldo += this.getSaldo()*taxa*2;
	}
	public void deposita(double valor){
		this.saldo +=valor - 0.10;
	}
	public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
	
	
	
}
