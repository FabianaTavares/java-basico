package loiane.exercicios13;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   	14.Fa�a um programa que pe�a o tamanho de um arquivo para download
			(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
			informe o tempo aproximado de download do arquivo usando este link
			(em minutos).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velInternet = scan.nextDouble();
		
		double tempo = (tamArquivo / velInternet);
		
		System.out.println("O tempo aproximado de download �: " + tempo);

	}

}
