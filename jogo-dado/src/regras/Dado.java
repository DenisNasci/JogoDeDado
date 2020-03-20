package regras;

import java.util.Random;

public class Dado {
	
	private int numeroSorteado;
	private Random aleatorio = new Random();
	
	public int sortearNumero() {
		return numeroSorteado = aleatorio.nextInt(6) + 1;
	}

	public int getNumeroSorteado() {
		return numeroSorteado;
	}
}
