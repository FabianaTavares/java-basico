package loiane.exercicios15;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a
			para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a	
			mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
			Inv�lido!", conforme o caso.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o Turno (M, V ou N)");
		String turno = scan.next();
		
		switch(turno) {
			case "M": System.out.println("Bom dia"); break;
			case "V": System.out.println("Boa Tarde"); break;
			case "N": System.out.println("Boa Noite"); break;
			default: System.out.println("Valor Inv�lido"); break;				
		}
		
	}

}
