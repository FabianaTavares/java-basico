package loiane.exercicios17;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	3. Fa�a um programa que leia e valide as seguintes informa��es:
				a. Nome: maior que 3 caracteres;
				b. Idade: entre 0 e 150;
				c. Sal�rio: maior que zero;
				d. Sexo: 'f' ou 'm';
				e. Estado Civil: 's', 'c', 'v', 'd';
		 */

		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		/*int idade = scan.nextInt();
		double salario = scan.nextDouble();
		String sexo = scan.next();
		String estCivil = scan.next();*/
		
		do {
			
			System.out.println("Entre com seu nome de Usu�rio: ");
			 nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa ter mais de 3 caracteres");
			}
		}while(!infoValida);		
		
		
	}

}
