package loiane.exercicios15;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Faça um Programa que pergunte em que turno você estuda. Peça
			para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a	
			mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
			Inválido!", conforme o caso.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o Turno (M, V ou N)");
		String turno = scan.next();
		
		switch(turno) {
			case "M": System.out.println("Bom dia"); break;
			case "V": System.out.println("Boa Tarde"); break;
			case "N": System.out.println("Boa Noite"); break;
			default: System.out.println("Valor Inválido"); break;				
		}
		
	}

}
