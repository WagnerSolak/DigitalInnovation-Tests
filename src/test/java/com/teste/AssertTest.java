package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;


public class AssertTest {
	
	@Test
	public void testAssertArrayEquals(){
		byte [] esperado = "teste".getBytes();  // pegando os bytes
		byte [] atual = "teste".getBytes();		// criando outro array com mesmo texto
		assertArrayEquals(esperado, atual);    // comparando os dois
	}
	
	@Test
	public void testAssertEquals(){  
		assertEquals("text", "text");  // testando string
	}
	
	@Test
	public void testAssertFalse(){
		assertFalse(false);  // testar um if pro exemplo para verificar se � false ou true
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull(new Object()); // para garantir que o objecto n�o est� retornando valor nulo
	}
	
	@Test
	public void testAssertNotSame(){
		assertNotSame(new Object(), new Object()); // verificando se os objectos n�o s�o os mesmos
	}
	
	@Test
	public void testAssertNull(){
		assertNull(null);  // para garantir que o objecto est� nulo naquele momento
	}
	
	@Test
	public void testAssertSame(){
		Integer aNumber = Integer.valueOf(768);
		assertSame(aNumber, aNumber);  // verificar se o objecto � o mesmo
	}

	
}
