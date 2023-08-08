package exemplos;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		float media;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota da média: ");
		media = entrada.nextFloat();
		
		if(media>6) System.out.println("Aprovado");
		else System.out.println("Reprovado");

	}

}
