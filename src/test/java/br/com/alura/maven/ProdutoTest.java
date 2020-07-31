package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto bala = new Produto("bala juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.0001); 
		Produto salgadinho = new Produto("salgadinho fandangos", 1.32);
		assertEquals(1.452, salgadinho.getPrecoComImposto(), 0.0001);
		//valor esperado (com imposto), valor atual, margem de erro
	}
}
