package loiane.exercicios52;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		// TODO Auto-generated constructor stub
		
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Contato " + nomeContato + "não existe na agenda.";
	}
}
