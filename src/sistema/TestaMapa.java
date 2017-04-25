package sistema;

import java.util.HashMap;
import java.util.Map;

import contas.Conta;
import contas.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		//cria o mapa
		Map mapaDeContas = new HashMap();
		//adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		//qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		Conta contaDoGerente = (Conta) mapaDeContas.get("gerente");
		
		System.out.println("A conta do Diretor possui um saldo de: R$ " +contaDoDiretor.getSaldo());
		System.out.println("A conta do Gerente possui um saldo de: R$ " +contaDoGerente.getSaldo());
	}

}
