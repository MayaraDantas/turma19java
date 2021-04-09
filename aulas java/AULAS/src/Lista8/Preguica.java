package Lista8;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public void subirArvore(char subindo) {
		if (subindo == '1') {
			System.out.println(" A preguiça esta subindo na arvore ");
		} else if (subindo == '2') {
			System.out.println(" A preguiça não esta subinfo na arvore ");

		}
	}

}
