package loiane.exercicios15;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int valor = scan.nextInt();

		
		if(valor < 0) {
			System.out.println("O Valor Digitado é negativo");
		}else {
			System.out.println("O valor digitado é positivo");
		}
		
	}

}
