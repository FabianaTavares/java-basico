package loiane.exercicios24;

public class exercicio01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarelo";
		lampada.tipoLuz = "Amarelo";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajour";
		lampada.tipos[1] = "Lampe�es";
		
		
	}
}
