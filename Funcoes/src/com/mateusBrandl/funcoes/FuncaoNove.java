package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num = entrada.nextInt();
		
		System.out.println("O inverto de "+num+" é: "+FuncoesAtividade.Inverte(num));
		
		entrada.close();
	}

}
