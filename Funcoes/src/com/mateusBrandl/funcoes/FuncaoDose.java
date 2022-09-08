package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoDose {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe uma palavra para embaralhar!");
		String palavra = entrada.next();
		String resultado = FuncoesAtividade.palavrainverte(palavra);
		System.out.println(resultado);
	
		entrada.close();
	}
}
