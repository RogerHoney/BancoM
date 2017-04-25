package sistema;
import dados.Data;
import dados.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Hugo", "Caixa");
		Funcionario f2 = new Funcionario("Diana", "RH");
		Funcionario f3 = new Funcionario();
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		f1.setAdmissao(d1);
		f2.setAdmissao(d2);
		f3.setAdmissao(d3);
		
		f1.setSalario(937);
		f1.recebeAumento(350);
		f1.setRg("123412234");
		f1.getAdmissao().setDia(20);
		f1.getAdmissao().setMes(03);
		f1.getAdmissao().setAno(2017);
		f1.mostra();
		//d1.mostraData();
		f2.setSalario(1120);
		f2.recebeAumento(320);
		f2.setRg("123563234");
		f2.getAdmissao().setDia(21);
		f2.getAdmissao().setMes(03);
		f2.getAdmissao().setAno(2017);
		f2.mostra();
		//d2.mostraData();
		f3.setNome("Clotilde");
		f3.setSalario(920);
		f3.recebeAumento(315);
		f3.setDepartamento("Serviços Gerais");
		f3.setRg("173563284");
		f3.getAdmissao().setDia(28);
		f3.getAdmissao().setMes(03);
		f3.getAdmissao().setAno(2017);
		f3.mostra();
		//d3.mostraData();
		

	}

}
