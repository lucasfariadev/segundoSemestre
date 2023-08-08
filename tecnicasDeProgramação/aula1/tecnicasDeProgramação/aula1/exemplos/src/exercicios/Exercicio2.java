package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 1 para triangulo ou 2 para quadrado:");
		int escolha = entrada.nextInt();
		
		if (escolha == 1) {
			System.out.print("Digite a base: ");
			float base = entrada.nextFloat();
			System.out.print("Digite a altura: ");
			float altura = entrada.nextFloat();
			
			float areaTriangulo = (base * altura)/2;
			System.out.println("A área do triângulo é: " + areaTriangulo);
		}
		
		if (escolha == 2) {
			System.out.print("Digite o valor do lado: ");
			float lado = entrada.nextFloat();
			
			double areaQuadrado = Math.pow(lado, 2);
			
			System.out.println("A área do quadrado é: " + areaQuadrado);
		}
	}

}
