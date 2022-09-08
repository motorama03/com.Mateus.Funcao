package com.mateusBrandl.funcoes;
import java.util.Scanner;

public class FuncaoDez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao CRAPS");
		System.out.println("Escreva algo para continuar");
		String any = entrada.next();
		
		int somadado = (FuncoesAtividade.dados());
		int somadado2 = 0;
		System.out.println("Você tirou o numero "+somadado+" somando os dois dados!");
		
		if(somadado == 7 || somadado == 11){
			System.out.println("Parabens Você é um natural! Tirou "+somadado);
		}
		else{
			if(somadado == 2 || somadado == 3 || somadado == 12){
				System.out.println("Você perdeu, a soma dos dados equivale a "+somadado);
			}
			else{
				System.out.println("Seu ponto é "+somadado);
				System.out.println("Lançando os dados novamente");
				do{
					somadado2 = (FuncoesAtividade.dados());	
					System.out.println("Lançada de dados foi "+somadado2);
				}while(somadado != somadado2 && somadado2 != 7);
				
				if(somadado == somadado2){
					System.out.println("Parabéns a segunda jogada dos dados é igual a primeira, você ganhou!!!");
				}
				if(somadado2 == 7){
					System.out.println("Você tirou 7, você perdeu!");
				}
			}
		}
		System.out.println(any);
		
		entrada.close();
	}

}
