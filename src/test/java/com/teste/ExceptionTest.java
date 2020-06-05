package com.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {  // declaração de teste -> o que espera da excecao
	
	/*@Test(expected = IndexOutOfBoundsException.class)
	public void empty(){
		new ArrayList<Object>().get(0);  // arrayList vazio e o get(0) para pegar o primeiro elemento
	}*/
	
	@Test(expected = IndexOutOfBoundsException.class)  // teste falhará pq agora temos um elemento na lista
	public void empty(){
		List<String> lista = new ArrayList<String>();
		//lista.add("Posição Zero");
		lista.get(0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);  //esperado a exceção
		thrown.expectMessage("Index: 0, Size: 0");       //esperado essa msg
		list.get(0);								     //pegar a posicao zero
	}
	
	/*@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperando que o IndexOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));  // a msg da excecao tem que ser esta (is("Index: 0, Size: 0"))
		}
	}  */
	

}
