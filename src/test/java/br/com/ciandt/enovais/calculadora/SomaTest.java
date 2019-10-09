package br.com.ciandt.enovais.calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.ciandt.enovais.calculadora.Soma;
import br.com.ciandt.enovais.calculadora.SomaException;

public class SomaTest {

	Soma soma;
	Double resultado;
	
	@Before
	public void init() {
		soma = new Soma();
		resultado = 0d;
	}
	
	@Test
	public void quandoSomarUmMaisUmDeveRetornarDois() throws Exception {
		resultado = soma.calcular(1d, 1d);
		Assert.assertEquals(2d, resultado, 0.1);
	}
	
	@Test(expected = SomaException.class)
	public void quandoSomarNumerosNulosDeveRetornarException() throws Exception {
		resultado = soma.calcular(null, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void quandoSomarPrimeiroNumeroNuloDeveRetornarException() throws Exception {
		resultado = soma.calcular(null, 1d);
	}
	
	@Test(expected = Exception.class)
	public void quandoSomarSegundoNumeroNuloDeveRetornarException() throws Exception {
		resultado = soma.calcular(1d, null);
	}
	
}
