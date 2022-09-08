package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoOito {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num = entrada.nextInt();
		System.out.println("Foram digitados "+FuncoesAtividade.qntCaractere(num)+" caracteres!");
		
		entrada.close();
		
	}

}
