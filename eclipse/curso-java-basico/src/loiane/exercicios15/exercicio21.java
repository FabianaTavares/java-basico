package loiane.exercicios15;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	21.Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
				. �lcool:
					a. at� 20 litros, desconto de 3% por litro
					b. acima de 20 litros, desconto de 5% por litro
				. Gasolina:
					c. at� 20 litros, desconto de 4% por litro
					d. acima de 20 litros, desconto de 6% por litro 
			Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel (codificado da seguinte forma: A-�lcool, Ggasolina),
			calcule e imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros: ");
		int qtdLitros = scan.nextInt();
		
		System.out.println("Entre com o tipo de combustivel: ");
		String combustivel = scan.next();
		
		double precoGas = 2.50;
		double precoAlcool = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if(combustivel.equalsIgnoreCase("a")) {
			if(qtdLitros <= 20) {
				percDesconto = 3;
			}else {
				percDesconto = 5;
			}
			
			total = qtdLitros * precoAlcool;
		}		
		else if(combustivel.equalsIgnoreCase("g")) {
			if(qtdLitros <= 20) {
				percDesconto = 4;
			}else {
				percDesconto = 6;
			}
			
			total = qtdLitros * precoGas;
		}
		
		/* Fazendo Calculos */
		totalDesc = (total / 100) * percDesconto;
		
		double precoPagar = total - totalDesc;
		
		System.out.println("Valor a ser pago: " + precoPagar);
		
		
		
	}

}
