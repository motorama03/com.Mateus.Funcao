package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoTeste {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Informe: 1 - inserir, 2-alterar, 3-excluir, 4-listar");
		
		System.out.println(soma());
		System.out.println("Opção escolhida: ");
		
		entrada.close();
	}
	
	public static String soma() {
		String saida = "## MENU ## \n";
		saida = saida + "1 - Inserir\n";
		saida = saida + "2 - Alterar\n";
		saida = saida + "1 - Excluir\n";
		saida = saida + "1 - Listar\n";
		return saida;
		
	}

}
