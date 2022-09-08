package com.mateusBrandl.funcoes;
import java.util.Random;

public class MinhasFuncoes {

	public static int[] criaVetor(int tamanho) {
		Random gerador = new Random();
		int[] v = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
            v[i] = (gerador.nextInt(100));
         }
		return v;
	}
	
		public static String mostrarTop(int[] v) {
			
			StringBuilder saida = new StringBuilder();
			for(int x = 0; x < v.length; x++) {
				saida.append(v[x]);
				saida.append(" | ");
			}
			return saida.toString();
			
		/*
		 *Função Lerda!!!
		 *
		 * public static String mostrar(int[] v) {
		
		String saida = "";
		for(int x = 0; x < v.length; x++) {
			saida = saida + v[x] + " | ";
		}
		return saida;
		
		 * 
		 */
			
			
}
	
}
