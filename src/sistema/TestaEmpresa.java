package sistema;
import dados.Empresa;
import dados.Funcionario;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa ();
		
		Funcionario f4 = new Funcionario();
		f4.setNome("Cláudio Henrique");
		f4.setSalario(1500);
		empresa.adiciona(f4);
		
		Funcionario f5 = new Funcionario();
		f5.setNome("Maria Joaquina");
		f5.setSalario(1800);
		empresa.adiciona(f5);
		
		empresa.mostraEmpregados();

	}

}
