package com.trybe.java.escolainteligente;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Portaria {

  /**
   * Atributos da classe.
   */
  private static int qtdFundamental1 = 0;
  private static int qtdFundamental2 = 0;
  private static int qtdMedio = 0;

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;

    double percFundamental1 = (double) 100 * qtdFundamental1 / total;
    double percFundamental2 = (double) 100 * qtdFundamental2 / total;
    double percMedio = (double) 100 * qtdMedio / total;

    DecimalFormat formato = new DecimalFormat("#.##"); // limitar a 2 casas decimais
    percFundamental1 = Double.valueOf(formato.format(percFundamental1).replace(',', '.'));
    percFundamental2 = Double.valueOf(formato.format(percFundamental2).replace(',', '.'));
    percMedio = Double.valueOf(formato.format(percMedio).replace(',', '.'));

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio + "\n");

    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + percFundamental1 + "%");
    System.out.println("Ensino Fundamental II: " + percFundamental2 + "%");
    System.out.println("Ensino Médio: " + percMedio + "%" + "\n");

    System.out.println("TOTAL: " + total);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    boolean continuar = true;
    while (continuar) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");

      short menuOption = scanner.nextShort();
      if (menuOption == 1) {
        System.out.println("Entre com a idade da pessoa estudante");
        int idade = scanner.nextInt();
        if (idade <= 10) {
          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
          Portaria.qtdFundamental1 += 1;
        } else if (idade <= 14) {
          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
          Portaria.qtdFundamental2 += 1;
        } else {
          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
          Portaria.qtdMedio += 1;
        }
      } else if (menuOption == 2) {
        continuar = false;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }

    emitirRelatorio(Portaria.qtdFundamental1, Portaria.qtdFundamental2, Portaria.qtdMedio);
    scanner.close();
  }
}
