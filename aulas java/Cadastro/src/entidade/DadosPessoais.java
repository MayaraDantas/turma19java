package entidade;

public class DadosPessoais {
	// atributos
	private String nome;
	private int idade;
	private String cpf;
	private String genero;
	private String som;

	// construtor

	public DadosPessoais(String nome, int idade, String cpf, String genero, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.som = som;

	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	// encapsulamentos
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void emitirSom() {
		System.out.println("som emitido pela pessoa" + this.som);
	}

}
