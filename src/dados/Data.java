package dados;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	
	//mostra data
	
	public void mostraData(){
		System.out.println("Data de admissão: " +dia+ "/" +mes+ "/" +ano);
	
	}
	
	//getters and setters

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
