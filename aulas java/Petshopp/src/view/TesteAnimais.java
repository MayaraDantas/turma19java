package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.DadosAnimais;

public class TesteAnimais {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<DadosAnimais> list = new ArrayList<>();

		int idade;
		String nome, porte, raca, som;
		double peso;
		char sair = 0;

		do {
			System.out.println(" Digite a Idade do seu bichinho: ");
			idade = leia.nextInt();

			System.out.println(" Digite o Nome do seu bichinho: ");
			nome = leia.next();

			System.out.println(" Digite o Porte do seu bichinho: ");
			porte = leia.next();

			System.out.println(" Digite a Raça do seu bichinho: ");
			raca = leia.next();

			System.out.println(" Quantos kilos  o seu bichinho pesa : ");
			peso = leia.nextDouble();

			System.out.println("Qual som bichinho faz: ");
			som = leia.next();

			list.add(new DadosAnimais(raca, peso, porte, nome, idade, som));

			System.out.println("deseja encerrar seu cadastro? 1/ sim. 2/ não");
			sair = leia.next().charAt(0);

		} while (sair != '1');

		for (DadosAnimais dados : list) {

			System.out.println(" Idade: " + dados.getIdade());
			System.out.println(" Nome: " + dados.getNome());
			System.out.println(" Porte: " + dados.getIdade());
			System.out.println(" Peso: " + dados.getPeso());
			System.out.println(" Raça: " + dados.getRaca());

			dados.emitirSom();

		}

	}
}
