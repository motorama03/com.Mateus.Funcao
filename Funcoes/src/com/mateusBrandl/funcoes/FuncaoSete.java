package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da presta��o");
		float valor = entrada.nextFloat();
		
		System.out.println("Informe h� quantos dias o pagamento est� atrasado ");
		int diasAtraso = entrada.nextInt();
		
		System.out.println("Voc� deve "+FuncoesAtividade.valorPagamento(valor, diasAtraso));
		
		entrada.close();
		
	}

}
