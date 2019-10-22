package br.com.ciandt.enovais.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacaoTest {

	Multiplicacao multiplicacao;
	Double resultado;
	
	{
		multiplicacao = new Multiplicacao();
		resultado = new Double("0");
	}
	
	@Test
	public void multiplicarDoisNumerosIguais() {
		resultado = multiplicacao.calcular(5d, 5d);
		Assert.assertEquals(25d, resultado.doubleValue(), 0.1);
	}
}
