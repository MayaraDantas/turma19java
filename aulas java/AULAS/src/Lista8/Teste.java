package Lista8;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		// cachorro **********
		System.out.println(" digite o nome do cachorro");
		nome = leia.next();
		System.out.println(" digite o idade do cachorro");
		idade = leia.nextInt();

		Cachorro cachorros = new Cachorro(nome, idade);

		System.out.printf(" O nome do cachorro é: %s \n ", cachorros.getNome());
		System.out.printf("A idade do cachorro é: %d \n ", cachorros.getIdade());

		cachorros.emitirSom(" au au au ");
		// ****************

		// cavalo *************8
		System.out.println(" digite o nome do cavalo?");
		nome = leia.next();
		System.out.println("digite a idade do cavalo?");
		idade = leia.nextInt();

		Cavalo cavalos = new Cavalo(nome, idade);

		System.out.printf(" O nome do cavalo é: %s \n ", cavalos.getNome());
		System.out.printf(" A Idade do cavalo é: %d \n ", cavalos.getIdade());

		// *****************

		System.out.printf("digite o nome  da preguiça ? ");
		nome = leia.next();
		System.out.println("digite a idade da preguica? ");
		idade = leia.nextInt();

		Preguica preguicas = new Preguica(nome, idade);

		System.out.printf(" o nome da preguiça é: %s \n ", preguicas.getNome());
		System.out.printf("a idade da preguica é %d \n ", preguicas.getIdade());
		

	}

}
