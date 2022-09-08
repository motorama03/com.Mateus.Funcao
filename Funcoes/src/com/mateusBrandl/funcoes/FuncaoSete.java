package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da prestação");
		float valor = entrada.nextFloat();
		
		System.out.println("Informe há quantos dias o pagamento está atrasado ");
		int diasAtraso = entrada.nextInt();
		
		System.out.println("Você deve "+FuncoesAtividade.valorPagamento(valor, diasAtraso));
		
		entrada.close();
		
	}

}
