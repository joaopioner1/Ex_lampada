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

Projeto 1: L�mpadas:
Classe: L�mpada (representa uma l�mpada comum)
Atributos: marca, voltagem (110, 220 ou bivolt), pot�ncia (por exemplo 60 Watts), cor
(branca, amarela), ligada(sim ou n�o), queimada(sim ou n�o).
Pense sobre os atributos, ou caracter�sticas de uma l�mpada. O que uma l�mpada �? E o
que uma l�mpada est�? Para todos atributos que devem ser imut�veis, os implemente
assim (com a palavra chave �final�) .
Construtor: Crie o construtor com os atributos imut�veis como par�metro. Considere que
inicialmente a l�mpada est� desligada
M�todos:
Getters de todos atributos n�o booleanos;
isLigada()- retorna se � est� ligada ou n�o;
isQueimada- retorna se a l�mpada est� queimada;
liga(int voltagemTomada) - liga a l�mpada e verifica se a voltagem n�o vai queimar a
l�mpada (isso s� ocorre se l�mpada 110 for ligada em tomada 220), caso queime a
l�mpada, automaticamente, ela ficar� desligada;
desliga() - desliga a l�mpada;
toString() - retorne uma string com a informa��o de todos atributos;
equals  verifique se duas l�mpadas s�o iguais. Pense o que voc� deve comparar para
verificar se duas l�mpadas s�o iguais

*/