package loiane.exercicios15;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  	8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
			qual produto voc� deve comprar, sabendo que a decis�o � sempre
			pelo mais barato.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro pre�o de produto: ");
		double preco1 = scan.nextDouble();

		System.out.println("Entre com o segundo pre�o de produto: ");
		double preco2 = scan.nextDouble();
		
		System.out.println("Entre com o terceiro pre�o de produto: ");
		double preco3 = scan.nextDouble();
		
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
		}else if(preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2");
		}else if(preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre os produto 3");
		}
		
		
		
	}

}
