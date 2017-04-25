package sistema;

import contas.Conta;
import contas.ContaPoupanca;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		//cp.deposita(-100);
		try {
			cp.deposita(-100);
			System.out.println("Depositou com sucesso!!!!");
			} catch (IllegalArgumentException e) {
			//System.out.println("Você tentou depositar um valor inválido");
			System.out.println(e);
			}



	}

}
