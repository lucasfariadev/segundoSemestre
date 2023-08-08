package exemplos;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {

		float notaP1, notaP2, media;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a nota da P1: ");
		notaP1 = scanner.nextFloat();
		System.out.println("Informe a nota da P2: ");
		notaP2 = scanner.nextFloat();
		media = (notaP1 + notaP2) / 2;

		System.out.println("A media final é: " + media);

	}

}
