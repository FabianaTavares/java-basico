package loiane.exercicios33;

/*
	Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
	n�mero,	um	saldo,	um	status	que	informa	se	ela	�	especial	ou	n�o, um	
	limite. Desenvolva	m�todos	para	realizar	saque	(verificando	se	o	cliente	
	pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
	cliente	est�	usando	cheque	especial	ou	n�o.	Desenvolva	um	programa	
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
