package br.com.ciandt.enovais.calculadora;

public class Soma {

	public double calcular(Double primeiroNumero, Double segundoNumero) throws SomaException  {
		
		if (primeiroNumero == null || segundoNumero == null) {
			throw new SomaException("números não podem ser nulos");
		}
		
		return primeiroNumero + segundoNumero;
	}

}
