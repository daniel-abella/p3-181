package br.cesed.si.p3.ed.listas.exemplo1.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.cesed.si.p3.ed.listas.exemplo1.MeuArrayList;
import br.cesed.si.p3.ed.listas.exemplo1.exceptions.ValorInvalidoException;

class MeuArrayListTests {

	@Test
	void testAdd1() {
		
		MeuArrayList meuAl = new MeuArrayList();
		
		Assertions.assertThrows(ValorInvalidoException.class, () -> {
			meuAl.add(null);
		  });
	}

	@Test
	void testAdd2() {
		
		MeuArrayList meuAl = new MeuArrayList();
		
		meuAl.add("elemento");
		meuAl.add("elemento");
		meuAl.add("elemento");
		
		Assert.assertEquals(3, meuAl.tamanho());
		
		
	}

}
