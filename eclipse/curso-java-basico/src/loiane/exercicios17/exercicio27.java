package loiane.exercicios17;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	27.O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de
			temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a m�dia das temperaturas
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperaturas");
		int qtdtemper = scan.nextInt();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		
		for(int i=1; i<qtdtemper; i++) {
			
			System.out.println("Informa a tempraruta x: " + i);
			temp = scan.nextDouble();
			
			soma += temp;
			
			if(temp >= maior) {
				maior = temp;
			}
			
			if(temp < menor) {
				menor = temp;
			}		
		}
		System.out.println("M�dia : " + (soma / qtdtemper));
		System.out.println("Menor Temperatura: " + menor);
		System.out.println("Maior Temperatura: " + maior);

	}

}
