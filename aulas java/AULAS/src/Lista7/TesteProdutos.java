package Lista7;

import java.util.Scanner;
public class TesteProdutos {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("  digite o pre�o do produto ");
		produto1.setPreco(leia.nextDouble());
		System.out.println("  digite o nome do produto ");
		produto1.setNome(leia.next());
		System.out.println("  digite a marca do produto ");
		produto1.setMarca(leia.next());
		

		System.out.printf(" o pre�o do produto �: %s  \n", produto1.getPreco());
		System.out.printf(" o nome do produto �:  %s \n", produto1.getNome());
		System.out.printf(" a marca do produto �: %s\n", produto1.getMarca());
}
}
