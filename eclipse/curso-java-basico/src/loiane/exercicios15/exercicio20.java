package loiane.exercicios15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	20.Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
				. "Telefonou para a v�tima?"
				a. "Esteve no local do crime?"
				b. "Mora perto da v�tima?"
				c. "Devia para a v�tima?"
				d. "J� trabalhou com a v�tima?" 
				O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. Se a pessoa responder 
				positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
				como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima?");
		String res1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String res2 = scan.next();
		
		System.out.println("Mora perto da v�tima?");
		String res3 = scan.next();
		
		System.out.println("Devia para a v�tima?");
		String res4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String res5 = scan.next();
		
		int count = 0;
		
		if(res1.equalsIgnoreCase("s")) {
			count++;
		}
		
		if(res2.equalsIgnoreCase("s")) {
			count++;
		}
		
		if(res3.equalsIgnoreCase("s")) {
			count++;
		}
		
		if(res4.equalsIgnoreCase("s")) {
			count++;
		}
		
		if(res5.equalsIgnoreCase("s")) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("Suspeita");
		}else if(count == 3 || count == 4) {
			System.out.println("Cumplice");
		}else if(count >= 5) {
			System.out.println("Assassino");
		}else if (count == 0) {
			System.out.println("Inocente");
		}

	}

}
