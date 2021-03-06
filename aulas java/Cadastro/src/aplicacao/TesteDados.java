package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.DadosPessoais;

public class TesteDados {

	public static void main(String[] args) {

		List<DadosPessoais> list = new ArrayList<>();

		Scanner leia = new Scanner(System.in);

		String nome, genero, cpf, som;
		int idade;
		char sair = 0;

		do {
			System.out.println(" Digite seu Nome : ");
			nome = leia.next();

			System.out.println(" Digite sua Idade: ");
			idade = leia.nextInt();

			System.out.println(" Digite seu Cpf: ");
			cpf = leia.next();

			System.out.println(" Digite seu Genero: ");
			genero = leia.next();

			System.out.println(" Digite uma frase: ");
			som = leia.next();

			list.add(new DadosPessoais(nome, idade, cpf, genero, som));

			System.out.println(" Deseja encerrar o seu cadastro? 1/SIM  2/N?O ");
			sair = leia.next().charAt(0);

		} while (sair != '1');

		for (DadosPessoais dados : list) {
			System.out.println(" Nome " + dados.getNome());
			System.out.println(" Idade " + dados.getIdade());
			System.out.println(" Cpf " + dados.getCpf());
			System.out.println(" Genero " + dados.getGenero());

			dados.emitirSom();

		}

	}

}
