package loiane.exercicios33;

/*
	Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
	número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não, um	
	limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
	pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
	cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
	para	testar	essa	classe.
*/

public class ContaCorrente {
	
	private int numero;
	private double saldo;
	private boolean tipo;
	private double limit;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	
	
}
