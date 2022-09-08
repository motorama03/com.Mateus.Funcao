package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto");
		float valor = entrada.nextFloat();
		System.out.println("Agora informe a taxa de imposto sobre o produto!");
		float imposto = entrada.nextFloat();
		
		System.out.println(FuncoesAtividade.Imposto(imposto, valor));
		
		entrada.close();
	}

}
