package tiegoandrade.github.framework.teste;

import tiegoandrade.github.framework.ObjectCreator;

/**
 * Classe que representa a execução da lógica do programa.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		/*
		 * Cria um objeto calculadora. A criação do objeto e a chamada dos
		 * métodos que possuem a anotação é responsabilidade do método
		 * "ObjectCreator"
		 */
		Calculadora calc = ObjectCreator.create(Calculadora.class);
		
		/* Soma os valores. */
		int soma = calc.somar();
		
		/* Imprime os valores.	 */
		System.out.println(soma);
	}

}
