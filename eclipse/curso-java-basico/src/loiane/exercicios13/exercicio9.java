package loiane.exercicios13;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Fa�a um Programa que pe�a a temperatura em graus Farenheit,
			transforme e mostre a temperatura em graus Celsius.
			o C = (5 * (F-32) / 9).
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("por gentileza entre com uma temperatura em graus Farenheit: ");
		double celcius = scan.nextDouble();
		
		
		System.out.println("A temperatura em Graus Celcius �: " + (5 * (celcius-32) / 9));
		
		
	}

}
