package Variaveis;

import java.util.Locale;

public class TestandoVariaveis {

	public static void main(String[] args) { // inicio do programa, tudo que esta dentro do main será executado.
		Locale.setDefault(Locale.US); // define a linguagem padrão que eu quero ultilizar nos codigos.

		// variavel é um espaço reservado para guardar uma informação dentro da memoria
		// do pc, sendo assim guarda um valor que vareia.

		String nome;// string é uma 'variavel' ultilizada para receber texto.
		nome = "David"; // 'nome' é uma variavel, '=' recebe, 'david' o valor atribuido dentro da
						// variavel
		System.out.println("o nome do sol é : " + nome); // (" sempre ultilizada para escrever texto)

		char mayara; // char é uma 'varivel' ultilizada para receber um caracter (APENAS UM DIGITO),
						// SEMPRE que aparecer a variavel char ultilizar as '' simples
		mayara = 'D';
		System.out.println("o chá de mayara recebe o sol " + mayara);

		int numero; // int é uma 'variavel' ultilizada para receber numeros inteiros.
		numero = 0; // iniciando uma variavel
		System.out.println(" minha idade é : " + numero);

		double dinheiro; // double é uma 'variavel' ultizada para receber numeros quebrados
		dinheiro = 100.58;
		System.out.println(" meu dinheirinho é R$: " + dinheiro);

		boolean ativo; // boolean é uma 'variavel'ultilizada para receber apenas duas informações
						// verdadeiro ou falso.
		ativo = true; // seja verdadeira ou falsa, Não é necessario as ""
		System.out.println(" o David tem que se cuidar : " + ativo);

	}

}
