package loiane.exercicios19;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
			mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
		 */

		Scanner scan = new Scanner(System.in);	
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A e igual: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
 		System.out.println();
 		
 		System.out.print("Vetor B e igual: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
 		System.out.println();
	}

}
