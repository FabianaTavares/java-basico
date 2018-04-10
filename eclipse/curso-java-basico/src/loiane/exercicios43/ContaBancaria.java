package loiane.exercicios43;

public class ContaBancaria {

	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if((saldo-valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "";
		s += "nomeCliente: " + nomeCliente;
		s += "numConta: " + numConta;
		s += "saldo: " + saldo;
		
		return s;
	}
	
}
