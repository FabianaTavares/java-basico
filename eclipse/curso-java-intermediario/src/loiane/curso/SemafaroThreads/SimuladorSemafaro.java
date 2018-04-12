package loiane.curso.SemafaroThreads;

public class SimuladorSemafaro {

	public static void main(String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for(int i=10; i<10; i++) {
			System.out.println(semafaro.getCor());
			////semafaro.esperaCorMudar();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		semafaro.desligarSemafaro();
			
	}

}
