package loiane.exercicios15;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int valor = scan.nextInt();

		
		if(valor < 0) {
			System.out.println("O Valor Digitado � negativo");
		}else {
			System.out.println("O valor digitado � positivo");
		}
		
	}

}
