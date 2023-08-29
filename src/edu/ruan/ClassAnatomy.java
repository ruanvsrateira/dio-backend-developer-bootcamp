package edu.ruan;

public class ClassAnatomy {
  public static void main(String[] args) {
    String primeiroNome = "Ruan";
    String segundoNome = "Victor";
    String nomeCompleto = mostraNomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  public static String mostraNomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
