package br.com.ciandt.enovais.calculadora;


import org.junit.Assert;
import org.junit.Test;

public class SubtracaoTest {
	
	Subtracao sub;
	Double resultado;
	
	{
		sub = new Subtracao();
		resultado = new Double(0);
	}
	
	@Test
	public void subtraindoDoisValoresIguaisDeveRetornarZero() {
		resultado = sub.calcular(10d, 10d);
		Assert.assertEquals(0, resultado.doubleValue(), 0.1);
	}
	
	@Test(expected = NullPointerException.class)
	public void subtraindoDoisValoresComOPrimeiroNull() {
		resultado = sub.calcular(null, 10d);
	}
	
	@Test(expected = NullPointerException.class)
	public void subtraindoDoisValoresComOSegundoNull() {
		resultado = sub.calcular(10d, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void subtraindoDoisValoresNulos() {
		resultado = sub.calcular(null, null);
	}
}