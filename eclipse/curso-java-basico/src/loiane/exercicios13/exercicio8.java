package loiane.exercicios13;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
			n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
			sal�rio no referido m�s
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor que voc� ganha por hora: ");
		double horaTrab = scan.nextDouble();
		
		
		double valorTotal = (horaTrab * 8);
		
		valorTotal = (valorTotal * 28); //28 dias
		
		System.out.println("O Valor total do seu sal�rio no mes �: " + valorTotal);
		

	}

}
