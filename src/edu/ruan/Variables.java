package edu.ruan;

import java.util.Date;

public class Variables {
  public static void main(String[] args) {

    // String guarda textos
    String nome = "Ruan";
    // int guarda números inteiros
    int idade = 19;
    // double números flutuantes
    double salario = 1500.29;
    /*
     * Tipo float deve-se ter o F no final, se não será inferido como variável do
     * tipo double.
     * 
     */
    float PI = 3.14F;
    // Date datas
    Date diaAtual = new Date();

    // variaveis X constantes

    // as variáveis pode-se se ter mudado os valores da variavel
    nome = "Roberto";

    // as constantes o valor dessa variável não pode ser modificado
    final int ANO_ATUAL = 2023;

    System.out.println(nome);
    System.out.println(idade);
    System.out.println(salario);
    System.out.println(PI);
    System.out.println(ANO_ATUAL);

  }
}
