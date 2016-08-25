package tiegoandrade.github.framework.teste;

import tiegoandrade.github.framework.annotations.Init;

/**
 * Classe que representa uma calculadora capaz de somar dois n�meros.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Calculadora {

	/** Valor 1 utilizado na opera��o. */
	private int n1;

	/** Valor 2 utilizado na opera��o. */
	private int n2;

	/**
	 * M�todo de inicializa��o do objeto, que ser� chamado logo ap�s o objeto
	 * ser constru�do.
	 */
	@Init(runOnInstantiation = true)
	public void init() {
		this.n1 = 10;
		this.n2 = 20;
	}

	/**
	 * Soma dois n�meros.
	 * 
	 * @return A soma de dois n�meros.
	 */
	public int somar() {
		return n1 + n2;
	}
}
