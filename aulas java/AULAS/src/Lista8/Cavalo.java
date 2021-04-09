package Lista8;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public void corre(char correndo) {
		if (correndo == '1') {
			System.out.println("O cavalo está correndo");

		} else if (correndo == '2') {
			System.out.println("O cavalo nao esta correndo ");

		}
	}

}
