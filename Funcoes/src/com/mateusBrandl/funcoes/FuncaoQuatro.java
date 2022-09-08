package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor!");
		int num = entrada.nextInt();
		System.out.println(FuncoesAtividade.Comparacao(num));
		
		entrada.close();
		
	}

}
