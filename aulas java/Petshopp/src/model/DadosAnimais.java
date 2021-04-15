package model;

public class DadosAnimais {

	// atributos

	private String raca;
	private double peso;
	private String porte;
	private String nome;
	private int idade;
	private String som;

	// construtor

	public DadosAnimais(String raca, double peso, String porte, String nome, int idade, String som) {
		super();
		this.raca = raca;
		this.peso = peso;
		this.porte = porte;
		this.nome = nome;
		this.idade = idade;
		this.som = som;

	}
	// encapsulamento

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public void emitirSom() {
		System.out.println("Som emitido pelo animal: " + this.som);
	}
}
