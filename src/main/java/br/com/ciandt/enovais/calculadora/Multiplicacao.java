package br.com.ciandt.enovais.calculadora;

public class Multiplicacao {
	
	public double calcular(Double numeroUm, Double numeroDois) throws NullPointerException{
		if(numeroUm == null || numeroDois == null) {
			throw new NullPointerException("Preencha com n�meros double os par�metros");
		}
		return numeroUm * numeroDois;
	}
	
}
