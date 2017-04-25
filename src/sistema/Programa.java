package sistema;
import contas.Conta;
import contas.ContaCorrente;

public class Programa {

	public static void main(String[] args) {
		//criando a conta
	    Conta c1;
	    c1 = new ContaCorrente();
	    Conta c2 = new ContaCorrente();
	    // inserindo os valores de minhaConta
	    c1.setDono("Duke");
	    c1.setSaldo(1000.0);
	    c2.setDono("Adelaide");
	    c2.setSaldo(500);
	    // saca 200 reais
	    c1.saca(2000);
	    // deposita 500 reais
	    c1.deposita(500);
	    //tranfere de duke para Adelaide
	    c1.transfere(c1, c2, 300);
	    //imprimindo os valores
	    System.out.println("Dono da conta: " + c1.getDono());
	    System.out.println("Saldo atual: " + c1.getSaldo());
	    System.out.println("Dono da conta: " + c2.getDono());
	    System.out.println("Saldo atual: " + c2.getSaldo());

	}

}
