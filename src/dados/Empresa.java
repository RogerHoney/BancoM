package dados;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];
	
	//métodos
	public void adiciona(Funcionario f){
		for(int x=0;x<funcionarios.length;x++){
			if(funcionarios[x]==null){
				funcionarios[x]=f;
				break;
			}
		}
		
	}
	public void mostraEmpregados(){
	for (int i = 0; i < funcionarios.length; i++){
		if(funcionarios[i] != null){
			System.out.println("Nome: "+funcionarios[i].getNome());
			System.out.println("Salario: "+funcionarios[i].getSalario());
			System.out.println("Funcionário na posição: " + i);
		}
	}
	}

}
