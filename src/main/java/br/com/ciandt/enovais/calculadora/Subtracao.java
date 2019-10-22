package br.com.ciandt.enovais.calculadora;

public class Subtracao {
	
	public Double calcular(Double numeroUm, Double numeroDois) throws NullPointerException{
		
		if(numeroUm == null || numeroDois == null) {
			throw new NullPointerException("Preencha com números double os parâmetros");
		}
		
		return numeroUm.doubleValue() - numeroDois.doubleValue();
	}
	
}
