package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import regras.Dado;
import regras.Jogador;

public class Partida {
	
	public static ArrayList<Jogador> jogador = new ArrayList<>();
	public static ArrayList<Jogador> ranking = new ArrayList<>();
	public static int rodadas = 7;
	public static Scanner totalDeJogadores = new Scanner(System.in);
	public static Scanner continua = new Scanner(System.in);
	public static Dado dado1 = new Dado();
	public static Dado dado2 = new Dado();
	
	public static void main(String[] args) {
		
		apresentacao();
		
		criaJogadores(entrada());
		
		iniciaPartida();
		
		classificacao(jogador);
	}

	private static int entrada() {
		return totalDeJogadores.nextInt();
	}

	private static void apresentacao() {
		System.out.println(">>>>>>>>>>>>>>>>> INICIANDO O JOGO DE DADOS >>>>>>>>>>>>>>>>>");
		System.out.println("Quantos jogadores na partida?");
	}

	private static void iniciaPartida() {
		for (int i = 1; i <= rodadas; i++) {
			System.out.println("\n>>>>>>>>>>>>>>>>> " + i +"ª RODADA >>>>>>>>>>>>>>>>>");
			shooterJogaDados();
		}
	}

	private static void shooterJogaDados() {
		for (int j = 0; j < jogador.size(); j++) {
			System.out.print("Enter para o " + jogador.get(j).getIdentificacao() + "ª jogador lançar os dados ...");
			continua.nextLine();
			jogador.get(j).jogarDados(dado1, dado2);
		}
	}
	
	public static void criaJogadores(int total) {
		
		for (int i = 1; i <= total; i++) {
			Jogador shooter = new Jogador(i);
			jogador.add(shooter);
		}
	}
	
	public static void classificacao(ArrayList<Jogador> jogador) {
		
		System.out.println("\n>>>>>>>>>>>>>>>>> Ranking dos jogadores >>>>>>>>>>>>>>>>>");
		
		Collections.sort(jogador);
		
		for (int i = 0; i < jogador.size(); i++) {
			System.out.println(i+1 + "ª lugar -> " + jogador.get(i));
		}
	}
}
