package entities_lampada;

import exeception_lampada.VoltagemException;

public class Lampada {
	
	private final String marca, cor;
	private final Integer voltagem, potencia;
	private Boolean ligada, queimada;
	
	public Lampada() {
		this.marca = "";
		this.cor = "";
		this.voltagem = null;
		this.potencia = null;
	}
	
	public Lampada(String marca, String cor, Integer voltagem, Integer potencia) {
		voltagemCerta();
		this.marca = marca;
		this.cor = cor;
		this.voltagem = voltagem;
		this.potencia = potencia;
	}

	public Lampada(String marca, String cor, Integer voltagem, Integer potencia, Boolean ligada, Boolean queimada) {
		voltagemCerta();
		this.marca = marca;
		this.cor = cor;
		this.voltagem = voltagem;
		this.potencia = potencia;
		this.ligada = ligada;
		this.queimada = queimada;
	}

	public Boolean getLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}

	public Boolean getQueimada() {
		return queimada;
	}

	public void setQueimada(Boolean queimada) {
		this.queimada = queimada;
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
	
	private boolean voltagemCerta() {
		if (voltagem != 110 && voltagem != 220) {
			throw new VoltagemException("A voltagem deve ser 110 ou 220 volts!");
		}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lampada other = (Lampada) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (voltagem == null) {
			if (other.voltagem != null)
				return false;
		} else if (!voltagem.equals(other.voltagem))
			return false;
		return true;
	}
	
	public boolean isligada() {
		if (ligada == true) {
			return true;
		} 
		return false;
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