package entities_lampada;

public class Lampada {
	//botar bivolt 
	private final String marca;
	private final String cor;
	private final Integer voltagem;
	private final Integer potencia;
	private Boolean ligada;
	private Boolean queimada;

	
	public Lampada(String marca, String cor, Integer voltagem, Integer potencia) {
		this.marca = marca;
		this.cor = cor;
		this.voltagem = voltagem;
		this.potencia = potencia;
	}

	public Lampada(String marca, String cor, Integer voltagem, Integer potencia, Boolean ligada, Boolean queimada) {
		this(marca, cor, voltagem, potencia);
		this.ligada = ligada;
		this.queimada = queimada;
	}

	public Boolean getLigada() {
		return ligada;
	}

	public Boolean getQueimada() {
		return queimada;
	}

	public String getMarca() {
		return marca;
	}

	public String getCor() {
		return cor;
	}

	public Integer getVoltagem() {
		return voltagem;
	}

	public Integer getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return "Lampada [marca=" + marca + ", cor=" + cor + ", voltagem=" + voltagem + ", potencia=" + potencia
				+ ", ligada=" + ligada + ", queimada=" + queimada + "]";
	}

	public boolean isLigada() {
		if (this.ligada == true) {
			return true;
		} 
		return false;
	}
	
	public boolean isQueimada() {
		if (this.queimada == true) {
			return true;
		} 
		return false;
	}
	
	public boolean liga(int tomadaVolts) {
		if (voltagem >= tomadaVolts || desliga() != true && queimada != true) {
			return true;
		}
		this.queimada = true;
		this.ligada = false;
		return false;
	}
	
	public boolean desliga() {//tem que alterar
		return this.ligada && !this.queimada ? true : false; //operador ternario
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