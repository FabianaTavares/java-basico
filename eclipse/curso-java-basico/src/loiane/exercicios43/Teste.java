package loiane.exercicios43;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Teste Conta Banc�ria");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta simples");
		contaSimples.setNumConta("1234");
		
		contaSimples.depositar(100);
		
		contaSimples.sacar(50);
		
		
		System.out.println(contaSimples);
		
	}
}
