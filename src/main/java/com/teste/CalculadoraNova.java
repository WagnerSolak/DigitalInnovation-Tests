package com.teste;

public class CalculadoraNova {
	
	public int somar(int ...valores){  //uso de varargs
		int soma = 0;
		for(int valor : valores){
			soma += valor;
		}
		return soma;
	}

}
