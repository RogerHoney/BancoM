package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import contas.ContaPoupanca;

public class TestaOperacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new ArrayList<>();
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		c1.setDono("Henrique");
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1452);
		c2.setDono("Joao");
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(5862);
		c3.setDono("Maria");
		contas.add(c3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++){
			System.out.println("numero: " + contas.get(i).getNumero());
		}

	}

}
