package br.com.ciandt.enovais.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {
	
	Divisao divisao;
	Double resultado;
	
	{
		divisao = new Divisao();
		resultado = new Double(0);
	}
	
	@Test
	public void dividirDoisNumerosIguais() {
		resultado = divisao.calcular(5d, 5d);
		Assert.assertEquals(1d, resultado.doubleValue(), 0.1);
	}
	
	@Test(expected = NullPointerException.class)
	public void dividirDoisNumerosComOPrimeiroSendoNull() {
		resultado = divisao.calcular(null, 10d);
	}
	
	@Test(expected = NullPointerException.class)
	public void dividirDoisNumerosComOSegundoSendoNull() {
		resultado = divisao.calcular(10d, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void dividirDoisNumerosComNull() {
		resultado = divisao.calcular(null, null);
	}
}
