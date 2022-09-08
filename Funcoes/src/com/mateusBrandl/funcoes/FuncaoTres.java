package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 3 valores inteiros");
		int num1 = entrada.nextInt();
		int  num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		System.out.println(FuncoesAtividade.Soma(num1, num2, num3));
		
		entrada.close();
		
	}

}
