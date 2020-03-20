package regras;

public class Jogador implements Comparable<Jogador> {
	
	private int identificacao;
	private int pontuacao;
	
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	
	public Jogador(int identificação) {
		this.identificacao = identificação;
	}
	
	public void jogarDados(Jogador this, Dado dado1, Dado dado2) {
		
		int resultadoDaJogada = dado1.sortearNumero()+dado2.sortearNumero();
		
		if(resultadoDaJogada>=7) {
			System.out.println("\tPontuação da jogada: " + resultadoDaJogada);
			this.pontuacao += resultadoDaJogada;
		}else {
			System.out.println("\tPontuação da jogada: " + resultadoDaJogada + ", ou seja, < 7 pontos!");
		}
	}
	
	@Override
	public String toString() {
		return this.getIdentificacao() + "ª Jogador " + "com " + this.getPontuacao() + " pontos";
	}
	
	@Override
	public int compareTo(Jogador outroJogador) {
		if(this.pontuacao > outroJogador.pontuacao) {
			return -1;
		}
		if(this.pontuacao < outroJogador.pontuacao) {
			return 1;
		}
		return 0;
	}
}