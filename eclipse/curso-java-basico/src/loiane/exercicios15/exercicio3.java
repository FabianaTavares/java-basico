package loiane.exercicios15;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	3. Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
			Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a letra do Sexo: ");
		String sexo = scan.next();
		
		/*
		 * String � uma classe e n�o se usa comparadores ==, � feito de outra forma a compara��o de strings
		 */
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("O Sexo digitado � Feminino.");
		}else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("O Sexo digitado � Masculino.");
		}else {
			System.out.println("O Sexo Inv�lido.");
		}
		
	}

}
