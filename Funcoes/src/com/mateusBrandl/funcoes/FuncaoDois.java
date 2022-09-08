package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe até que número você deseja listar");
		int num = entrada.nextInt();		
		System.out.print(FuncoesAtividade.tabelaLinC(num));

		entrada.close();
	}

}
