package loiane.exercicios15;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	13.Fa�a um Programa que leia um n�mero e exiba o dia correspondente
			da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
			aparecer valor inv�lido.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero do dia da semana (de 1 a 7): ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Ter�a"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sabado"); break;
		}			
	}
}
