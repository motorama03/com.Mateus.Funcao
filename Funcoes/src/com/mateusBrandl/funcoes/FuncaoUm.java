package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe at� que n�mero voc� deseja listar");
		int num = entrada.nextInt();		
		System.out.print(FuncoesAtividade.tabelaLin(num));

		entrada.close();
	}
	
	

}
