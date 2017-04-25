package dados;
public class Funcionario {
	private String nome;
	private String departamento;
	//String dataDeEntrada;
	private String rg;
	private double salario;
	private Data admissao;
	
	//construtor
	
	public Funcionario(){
		System.out.println("Funcionário(a) criado(a) com sucesso!!!");
	}
	
	public Funcionario(String nome, String departamento){
		this.nome = nome;
		this.departamento = departamento;
		System.out.println("Funcionário(a) criado(a) com sucesso!!!");
	}
	
	//getters and setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Data getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Data admissao) {
		this.admissao = admissao;
	}
	
	//métodos
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
		}
	
	double calculaGanhoAnual() {
		return this.salario*12;
		}
	public void mostra(){
		System.out.println("Nome do Funcionário: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salário: R$ "+this.salario);
		System.out.println("Ganho anual: R$ "+this.calculaGanhoAnual());
		System.out.println("Identificação: "+this.rg);
		System.out.println("Data de admissão: " +admissao);
		System.out.println("----------------------------------------------------");
	}


}
