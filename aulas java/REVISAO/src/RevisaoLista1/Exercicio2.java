package RevisaoLista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		int dias, meses, anos, diasInfo; 
		 
		System.out.println("Digite quantos dias você tem de vivido ? ");
		diasInfo= leia.nextInt();
		anos= diasInfo / 365;
		meses= (diasInfo % 365)/ 30; 
		dias= (diasInfo % 365)% 30;
		System.out.printf (" você tem de ano :%d  você tem de meses :%d você tem de dias : %d ", anos, meses, dias);
		
	}

}
