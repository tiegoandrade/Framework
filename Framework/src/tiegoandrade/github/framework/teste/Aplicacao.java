package tiegoandrade.github.framework.teste;

import tiegoandrade.github.framework.ObjectCreator;

/**
 * Classe que representa a execu��o da l�gica do programa.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		/*
		 * Cria um objeto calculadora. A cria��o do objeto e a chamada dos
		 * m�todos que possuem a anota��o � responsabilidade do m�todo
		 * "ObjectCreator"
		 */
		Calculadora calc = ObjectCreator.create(Calculadora.class);
		
		/* Soma os valores. */
		int soma = calc.somar();
		
		/* Imprime os valores.	 */
		System.out.println(soma);
	}

}
