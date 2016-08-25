package tiegoandrade.github.framework.teste;

import tiegoandrade.github.framework.annotations.Init;

/**
 * Classe que representa uma calculadora capaz de somar dois números.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Calculadora {

	/** Valor 1 utilizado na operação. */
	private int n1;

	/** Valor 2 utilizado na operação. */
	private int n2;

	/**
	 * Método de inicialização do objeto, que será chamado logo após o objeto
	 * ser construído.
	 */
	@Init(runOnInstantiation = true)
	public void init() {
		this.n1 = 10;
		this.n2 = 20;
	}

	/**
	 * Soma dois números.
	 * 
	 * @return A soma de dois números.
	 */
	public int somar() {
		return n1 + n2;
	}
}
