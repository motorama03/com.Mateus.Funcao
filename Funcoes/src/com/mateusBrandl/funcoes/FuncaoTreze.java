package com.mateusBrandl.funcoes;
import java.util.Scanner;
import java.util.Random;
public class FuncaoTreze {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    System.out.println("Insira um número de 1 até 20: ");
    int n = input.nextInt();

    Random rand = new Random();
    StringBuilder sbResult = new StringBuilder();

    if(n < 1 || n > 20) {
        int rand_input = rand.nextInt(20);
        sbResult = FuncoesAtividade.Desenhinho(rand_input);
    }else {
        sbResult = FuncoesAtividade.Desenhinho(n);
    }
    System.out.println(sbResult);

    input.close();
    }
}
