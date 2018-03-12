package br.cesed.si.p3.po.projeto1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.cesed.si.p3.po.projeto1.ContaCorrente;
import br.cesed.si.p3.po.projeto1.ValorInvalidoException;

class ContaCorrenteTests {

	private ContaCorrente contaCorrente;

	// parametros de teste
	private int agencia = 3204;
	private int conta = 19875;
	private String titular = "Daniel";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// antes de todos os testes
		// exemplo: aqui dentro vc cria uma conexao com o banco de dados
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// exemplo: fecha a conexao com o banco de dados
	}

	@BeforeEach
	void setUp() throws Exception {
		contaCorrente = new ContaCorrente(agencia, conta, titular);
	}

	@AfterEach
	void tearDown() throws Exception {
		contaCorrente = null;
	}

	@Test
	void testDepositar1() throws ValorInvalidoException {
		assertEquals(0, contaCorrente.getSaldo(), 0);
		contaCorrente.depositar(100);
		assertEquals(99.5, contaCorrente.getSaldo(), 0);
	}

	@Test
	void testDepositar2() throws ValorInvalidoException {
		
		assertEquals(0, contaCorrente.getSaldo(), 0);
		
		Assertions.assertThrows(ValorInvalidoException.class, () -> {
			contaCorrente.depositar(-100);	
		});
	}

	@Test
	void testDepositar3() throws ValorInvalidoException {
		
		assertEquals(0, contaCorrente.getSaldo(), 0);
		
		Assertions.assertThrows(ValorInvalidoException.class, () -> {
			contaCorrente.depositar(0);	
		});
	}	
}
