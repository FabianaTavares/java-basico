package loiane.exercicios13;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		
		int priNumero = scan.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		
		int segNumero = scan.nextInt();
		
		System.out.println("O Resultado da soma dos dois numeros �: " + (priNumero + segNumero));

	}

}
