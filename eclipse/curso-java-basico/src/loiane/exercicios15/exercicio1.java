package loiane.exercicios15;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero � maior: " + num1);
		}else {
			System.out.println("O segundo numero � maior: " + num2);
		}
		
		
	}

}
