package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    return (nota1 + nota2 + nota3 + nota4) / 4;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o nome da Pessoa Estudante?");
    String nome = scanner.next();
    System.out.println("Entre com as notas das provas:");
    System.out.println("Avaliação 1:");
    double av1 = Double.parseDouble(scanner.next());
    System.out.println("Avaliação 2:");
    double av2 = Double.parseDouble(scanner.next());
    System.out.println("Avaliação 3:");
    double av3 = Double.parseDouble(scanner.next());
    System.out.println("Avaliação 4:");
    double av4 = Double.parseDouble(scanner.next());

    double media = calcularMedia(av1, av2, av3, av4);
    System.out.println("A média das notas de " + nome + " é " + media);
    scanner.close();
  }
}
