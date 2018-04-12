package loiane.curso.SemafaroThreads;

public enum CorSemafaro {

	VERDE(1000), AMARELO(300), VERMELHO(2000);
	
	private int tempoEspera;
	
	CorSemafaro( int tempoEspera) {
		// TODO Auto-generated constructor stub
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	
	
}
