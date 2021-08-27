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