package loiane.exercicios13;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  8. Faça um Programa que pergunte quanto você ganha por hora e o
			número de horas trabalhadas no mês. Calcule e mostre o total do seu
			salário no referido mês
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor que você ganha por hora: ");
		double horaTrab = scan.nextDouble();
		
		
		double valorTotal = (horaTrab * 8);
		
		valorTotal = (valorTotal * 28); //28 dias
		
		System.out.println("O Valor total do seu salário no mes é: " + valorTotal);
		

	}

}
