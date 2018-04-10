package loiane.exercicios52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int opcao = obterOpcaoMenu(scan);
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida) {
			System.out.println("Digite a op��o desejada:");
			System.out.println("1: Consultar");
			System.out.println("2: Adicionar");
			
			try {
				//opcao = scan.nextInt();
				
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada); /*converte string para inteiro*/
				
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;					
				}
				else {
					throw new Exception("Entrada inv�lida");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Entrada invalida, tente novamente.");
			}
			
		}
		
		return opcao;
	}

}
