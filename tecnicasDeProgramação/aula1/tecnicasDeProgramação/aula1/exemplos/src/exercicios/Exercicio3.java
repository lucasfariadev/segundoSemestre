package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	
	public static void main(String[] args) {
		
		float P1, P2, P3, A1, media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua P1: ");
		P1 = entrada.nextFloat();
		
		System.out.print("Digite a sua P2: ");
		P2 = entrada.nextFloat();
		
		System.out.print("Digite a sua A1: ");
		A1 = entrada.nextFloat();
		
		media = (P1 + (2*P2)+A1)/4;
		
		if (media>=6) System.out.println("Aprovado");
		
		else {
			System.out.print("Digite sua P3: ");
			P3 = entrada.nextFloat();
			(P3 + media)/2)
			if(   6) System.out.println("Aprovado");
			else System.out.println("Reprovado");
			
		}
		
		
	}

}
