package loiane.exercicios13;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
		 */
		
		System.out.println("Entre com um numero");
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		System.out.println("o numero digitado foi: " + numero);
		
		

	}

}
