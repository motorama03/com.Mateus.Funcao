package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoSeis {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a hora");
		int hora = entrada.nextInt();
		
		System.out.println("Agora informe os minutos");
		int minuto = entrada.nextInt();
		
		System.out.println(FuncoesAtividade.Horario(hora)+":"+minuto);
		
		entrada.close();
		
	}

}
