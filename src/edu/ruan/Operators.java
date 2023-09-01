package edu.ruan;

import java.util.Date;

public class Operators {
  public static void main(String[] args) {
    // O operador de = é classificado como operador de atribuição
    String nome = "Ruan";
    int idade = 12;
    String anoAtual = new Date().toString();
    char sexo = 'M';
    Boolean falseOrTrue = false;

    System.out.println(nome);
    System.out.println(idade);
    System.out.println(anoAtual);
    System.out.println(sexo);
    System.out.println(falseOrTrue);

    // Operadores Aritméticos são os que fazer cálculos como exemplo: + - / * OBS: o
    // operador + pode fazer também concatenação entre textos
    // Quando faço por exemplo 1 + "1" ele vai juntar tornando-se 11.
    int soma = 1 + 1;
    String nomeCompleto = "Ruan" + "Victor dos Santos Rateira";
    int subtracao = 3033 - 23;
    int multiplicacao = 2023 * 23;
    int divisao = 14 / 2;
    int modulo = 18 % 3;

    System.out.println(soma);
    System.out.println(nomeCompleto);
    System.out.println(subtracao);
    System.out.println(multiplicacao);
    System.out.println(divisao);
    System.out.println(modulo);

    // Operadores Unários são operadores que alteram o valor da variavel.
    // usando - antes da variavel faz com que o número do valor da variavel torna-se
    // contrário do que ja é
    int num = 5;
    System.out.println(-num);

    // usando + antes da variavel faz com que o número do valor da variavel torna-se
    // positivo.
    int num2 = -5;
    System.out.println(-num2);

    // adiciona mais 1 - Incrementa 1
    int num3 = 0;
    num3++;
    System.out.println(num3);

    // subtrai 1 - Decrementa 1
    int num4 = 0;
    num3--;
    System.out.println(num3);

    // negação - inverte o valor de true para false ou de false para true. pode-se
    // usar mais de uma vez o !
    boolean valor = true;

    System.out.println(!true);

    // Operador ternário é como se foose um if simples
    String resultado;
    int a = 3, b = 2;

    resultado = (a == b ? "verdadeiro" : "false");
    System.out.println(resultado);

    // Operadores relacionais são aqueles que compara duas ou mais expressões
    // retornando true(Verdadeiro) ou false(Falso)
    System.out.println(1 > 1); // > = maior
    System.out.println(1 < 1); // < = menor
    System.out.println(1 >= 1); // >= = maior ou igual
    System.out.println(1 <= 1); // <= = menor ou igual
    System.out.println(1 != 1); // != = diferente
    System.out.println(1 == 1); // == = igual
    // System.out.println(1 !== "1"); OBS: não é possivel fazer comparação entre
    // valores com tipos diferentes
    System.out.println("Ruan" == "Ruan"); // é possive comparar string vendo se estão iguais

    // Operadores Lógicos é quando podemos juntar comparações
    // usando o operador && somente retornar true quando as duas exmpressoes
    // retornarem true
    System.out.println(1 == 1 && 2 == 2);
    System.out.println(1 == 1 && 2 == 1);

    // usando o operador || se uma das operações retornar true a expressao retorna

    System.out.println(1 == 1 || 1 == 1);
    System.out.println(1 == 1 || 1 == 2);
    // true

  }
}
