package br.com.ciandt.login.calculadora;

public class Soma {

	public double calcular(Double primeiroNumero, Double segundoNumero) throws SomaException  {
		
		try {
			return primeiroNumero + segundoNumero;
		} catch (Exception e) {
			throw new SomaException("hdksjahdk");
		}
	}

}
