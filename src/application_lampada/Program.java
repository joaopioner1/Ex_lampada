package application_lampada;

import entities_lampada.Lampada;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner Date: 24/08/2021
		Lampada l1 = new Lampada("generico", "bege", 220, 60);
		System.out.println(l1);
	}

}
/*

Projeto 1: Lâmpadas:
Classe: Lâmpada (representa uma lâmpada comum)
Atributos: marca, voltagem (110, 220 ou bivolt), potência (por exemplo 60 Watts), cor
(branca, amarela), ligada(sim ou não), queimada(sim ou não).
Pense sobre os atributos, ou características de uma lâmpada. O que uma lâmpada é? E o
que uma lâmpada está? Para todos atributos que devem ser imutáveis, os implemente
assim (com a palavra chave “final”) .
Construtor: Crie o construtor com os atributos imutáveis como parâmetro. Considere que
inicialmente a lâmpada está desligada
Métodos:
Getters de todos atributos não booleanos;
isLigada()- retorna se é está ligada ou não;
isQueimada- retorna se a lâmpada está queimada;
liga(int voltagemTomada) - liga a lâmpada e verifica se a voltagem não vai queimar a
lâmpada (isso só ocorre se lâmpada 110 for ligada em tomada 220), caso queime a
lâmpada, automaticamente, ela ficará desligada;
desliga() - desliga a lâmpada;
toString() - retorne uma string com a informação de todos atributos;
equals  verifique se duas lâmpadas são iguais. Pense o que você deve comparar para
verificar se duas lâmpadas são iguais

*/