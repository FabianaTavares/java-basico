package loiane.exercicios13;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		    12.Tendo como dados de entrada a altura de uma pessoa, construa um
			algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
			(72.7*altura) - 58
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua Altura");
		
		double altura = scan.nextDouble();
		
		System.out.println("Seu peso ideal é: " + ((72.7 * altura) - 58));

	}

}
