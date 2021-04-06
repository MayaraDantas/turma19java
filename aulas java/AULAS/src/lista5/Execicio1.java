package lista5;


import java.util.Scanner;

public class Execicio1 {
	

	


		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int int1, int2, int3;
			
			System.out.println("Por favor, insira um número inteiro qualquer: ");
			int1 = leia.nextInt();
			System.out.println("Por favor, insira mais um número inteiro qualquer: ");
			int2 = leia.nextInt();
			System.out.println("Por favor, insira um último número inteiro qualquer: ");
			int3 = leia.nextInt();
			
			if (int1 == int2 && int1 == int3) {
				System.out.println("Os números são equivalentes");}
			else if (int1 < int2 && int2 < int3) {
				System.out.printf("Dentre os números %d, %d e %d, o maior deles é: %d",int1,int2,int3,int3);
			}	else if (int1 > int2 && int1 > int3) {
				System.out.printf("Dentre os números %d, %d e %d, o maior deles é: %d",int1,int2,int3,int1);
			}
			else if (int2 > int1 && int2 > int3) {
				System.out.printf("Dentre os números %d, %d e %d, o maior deles é: %d\n",int1,int2,int3,int2);
			}
			else if (int1 == int2 && int1 > int3) {
				System.out.printf("Dentre os números %d, %d e %d, o maior deles é: %d",int1,int2,int3,int1);
			}
			System.out.println("\nPROGRAMA FINALIZADO!");
			
		}

	}
//

