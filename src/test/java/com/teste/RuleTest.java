package com.teste;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {  // simulando uma operação de IO, e garantir que o arquivo foi criado
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder(); // declaramos um arquivo temporaryFolder
	
	@Test
	public void shouldCreateNewFileTemporaryFolder() throws IOException {
		File created = tmpFolder.newFile("file.txt");  // craindo arquivo dentro da pasta temporária
		
		assertTrue(created.isFile());  // verifica se o arquivo foi criado
		assertEquals(tmpFolder.getRoot(), created.getParentFile()); // root da pasta temporario é o mesmo do arquivo criado
	}
}
