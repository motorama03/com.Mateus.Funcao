package com.mateusBrandl.funcoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FuncoesAtividade {
	
	public static String tabelaLin(int num) {
		StringBuilder saida = new StringBuilder();
		int j = -1;
		for(int x = 0; x < num; x++) {
			j = j +1;
			saida.append("\n");
			for(int y = 0; y <= j; y++) {
				saida.append((x + 1)+ "  ");
			}
		}
		return saida.toString();
	}
	
	public static String tabelaLinC(int num) {
		StringBuilder saida = new StringBuilder();
		int j = -1;
		for(int x = 0; x < num; x++) {
			j = j +1;
			saida.append("\n");
			for(int y = 0; y <= j; y++) {
				saida.append((y + 1)+ "  ");
			}
		}
		return saida.toString();
	}
	
	public static String Soma(int n1, int n2, int n3) {
		StringBuilder saida = new StringBuilder();
		saida.append(" "+(n1 + n2 + n3));
		
		return saida.toString();
	}
	
	public static String Comparacao(int n1) {
		StringBuilder saida = new StringBuilder();
		if(n1 > 0) {
			saida.append("P");
		}
		else
		saida.append("N");
	
		return saida.toString();	
	}
	
	public static String Imposto(float imp, float value) {
		StringBuilder saida = new StringBuilder();
		value = value +(value * imp);
		saida.append(value);

		return saida.toString();
	}
	
	public static String Horario(int hor) {
		StringBuilder saida = new StringBuilder();
		int horario = 0;
		if (hor > 12){
			horario = hor - 12;
		}
		else{
			horario = hor;
		}
		saida.append(horario);
		
		return saida.toString();
	}
	
	public static String valorPagamento(float preco, int dias){
		StringBuilder saida = new StringBuilder();
		float precoInicial = preco;
		float precoFim  = 0;
		if(dias > 0){
			saida.append(precoInicial +(preco * 0.3f));
			for(int x = 0; x < dias; x++){
				precoFim = (precoInicial + (preco*0.01f));
			}
			saida.append(precoFim);
		}
		else{
			saida.append(preco);
		}
		return saida.toString();
	}
	
	public static String qntCaractere(int numero){
		StringBuilder saida = new StringBuilder();
		String contacaracteres = Integer.toString(numero);
		saida.append(contacaracteres.length());
		
		return saida.toString();
	}
	
	public static String Inverte(int num){
		StringBuilder saida = new StringBuilder();
		
		int i = 0;
		while (num > 0) {
			i *= 10;
			i += (num % 10);
			num /= 10;
		}
		saida.append(i);
		
		return saida.toString();
	}
	
	public static int dados(){
		//StringBuilder saida = new StringBuilder();
		Random random = new Random();
		int somadados = 0;
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		somadados = dado1 + dado2;
		//saida.append(somadados);
		
		return (somadados);
	}
	
	public static String data(int ano, int mes, int dia){
		StringBuilder saida = new StringBuilder();
		String year = Integer.toString(ano);
		String month = Integer.toString(mes);
		String day = Integer.toString(dia);
		
		if(mes == 1){
			month = "Janeiro";
		}
		else{
			if(mes == 2){
				month = "Fevereiro";
			}
			else{
				if(mes == 3){
					month = "Março";
				}
				else{
					if(mes == 4){
						month = "Abril";
					}
					else{
						if(mes == 5){
							month = "Maio";
						}
						else{
							if(mes == 6){
								month = "Junho";
							}
							else{
								if(mes == 7){
									month = "Julho";
								}
								else{
									if(mes == 8){
										month = "Agosto";
									}
									else{
										if(mes == 9){
											month = "Setembro";
										}
										else{
											if(mes == 10){
												month = "Outubro";
											}
											else{
												if(mes == 11){
													month = "Novembro";
												}
												else{
													if(mes == 12){
														month = "Dezembro";
													}
													else{
														month = "Mês Inválido!";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		saida.append(day+" de "+month+" de "+year);
		
		return saida.toString();
	}
	
	public static String palavrainverte(String palavrinha) {
		StringBuilder saida = new StringBuilder();
		String palavra[] = palavrinha.split("");
		List embaralho = Arrays.asList(palavra);
		Collections.shuffle(embaralho);
		String palavrafim = String.join("", embaralho);
		saida.append(palavrafim);
		
		return saida.toString();
	}
	
	public static StringBuilder Desenhinho(int num) {

        StringBuilder output = new StringBuilder();
        int i = 1;

        for(i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                //first line
                if(i == 1 && j==1) {
                    output.append("x");
                }else if(i == 1 && j != num) {
                    output.append("");
                }else if(j== num && i == 1){
                    output.append("x");
                }
            }
        }
                
        for(i = 1; i <= num; i++) {
                if(i != 1 ) {
                    output.append("\n|");
                    for(int k = 1; k <= (num-2); k++) {
                        output.append(" ");
                        if(k == num-2) {
                            output.append("|");
                        }
                    }
                }
        }
        
        for(int m = 1; m <= num;m++) {
            if(m==1) {
                output.append("\nx");
            }else if(m != num) {
                output.append("_");
               }else if(m== num){
                   output.append("x");
                m = (num+1);
            }
        }

        return output;

    }

}
