package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoOnze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano");
		int AAAA = entrada.nextInt();
		
		System.out.println("Informe o mês");
		int MM = entrada.nextInt();
		
		System.out.println("Informe agora o dia!");
		int DD = entrada.nextInt();
		
		String data = FuncoesAtividade.data(AAAA, MM, DD);
		System.out.println(data);
		
		entrada.close();
	}

}
