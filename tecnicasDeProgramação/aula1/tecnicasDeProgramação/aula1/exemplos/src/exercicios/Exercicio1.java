package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		float salario; Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");salario = entrada.nextFloat();
		
		if(salario>10000) System.out.println("Você é muito rico!");
		else System.out.println("Vai trabalhar abestado!");		
	}
}
