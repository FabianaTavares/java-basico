package loiane.exercicios13;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 5. Faça um Programa que converta metros para centímetros.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero em metros");
		
		double valor = scan.nextDouble();
		
		System.out.println("Valor Digitado equivale a: " + (valor * 100) + " cm");
		
		

	}

}
