import exercicio1.*;
import exercicio2.*;
import exercicio3.*;
import exercicio4.*;
import exercicio5.*;
import exercicio6.PorcentualImpares;
import exercicio7.MediaCentralizada;
import exercicio8.DuasSomas;

import java.util.Scanner;

/*
Entrega a Atividade 1 - Algoritmos e Programação II

Eu,

Wallace Araujo

declaro que

todas as respostas são fruto do meu próprio trabalho,
não copiei respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    boolean ligado = true;
    int[] vetorRandomizado = null; 

    while (ligado) {
      
      System.out.println("Escolha uma das opções abaixo:");
      System.out.println("Opção 1 - Inicializar o vetor com números aleatórios");
      System.out.println("Opção 2 - Imprimir o vetor");
      System.out.println("Opção 3 - Verificar se um determinado número está contido no vetor");
      System.out.println("Opção 4 - Buscar o maior número armazenado no vetor");
      System.out.println("Opção 5 - Calcular a média dos números pares armazenados no vetor");
      System.out.println("Opção 6 - Calcular o percentual dos números ímpares armazenados no vetor");
      System.out.println("Opção 7 - Calcula a média centralizada dos números armazenados no vetor");
      System.out.println("Opção 8 - Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
      System.out.println("Opção 9 - Sair");

      System.out.print("Escolha uma opção: ");
      int escolha = sc.nextInt();

      switch (escolha) {
        case 1:
          System.out.println(
              "========================================================================================================================");
          System.out.println("Informe o tamanho do vetor");
          int linhas = sc.nextInt();
          vetorRandomizado = new int[linhas];

          vetorRandomizado = VetorRandomizada.vetorRandomizado(vetorRandomizado);
          System.out.println("Vetor inicializado com números aleatórios:");
          for (int valor : vetorRandomizado) {
            System.out.print(valor + " ");
          }
          System.out.println();
          System.out.println(
              "========================================================================================================================");
          break;

        case 2:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
            ImprimirVetor.imprimirVetor(vetorRandomizado);
            System.out.println();
            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;

        case 3:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
            System.out.println("Informe o número alvo ");
            int target = sc.nextInt();

            int verificador = NumeroAlvo.numeroAlvo(target, vetorRandomizado);
            if (verificador == -1) {
              System.out.println("Valor não encontrado.");
            } else {
              System.out.println("Número encontrado no índice " + verificador);
            }

            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;

        case 4:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
            int maior = MaiorValor.maiorValor(vetorRandomizado);
            System.out.println("O maior número armazenado no vetor é: " + maior);
            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;

        case 5:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
            double mediaPares = MediaPares.calcularMediaPares(vetorRandomizado);
            System.out.println("A média dos números pares é: " + mediaPares);
            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;
        case 6:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
              double percentual = PorcentualImpares.calcularPorcentualImapares(vetorRandomizado);
              System.out.println("porcentual dos numero impares e :"+percentual);

            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;
        case 7:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
                try {
                  int meio = MediaCentralizada.calcularMediaCentralizada(vetorRandomizado);
                  System.out.println(meio);
                } catch (Exception e) {
                  System.out.println("Erro: " + e.getMessage());
                  
                }
            
            
            
            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;
        case 8:
          if (vetorRandomizado != null) {
            System.out.println(
                "========================================================================================================================");
                System.out.println("informe o numero alvo ");
                int numeroProcurar = sc.nextInt();

               
                int[] verificando = DuasSomas.duasSomas(vetorRandomizado, numeroProcurar);
                for (int valor : verificando) {
                  System.out.print(valor + " ");
                }
                if (verificando == vetorRandomizado) {
                  System.out.println("Valor não encontrado.");
                } 

System.out.println("");
            System.out.println(
                "========================================================================================================================");
          } else {
            System.out.println(
                "-------------------------------Vetor não inicializado. Escolha a opção 1 primeiro.-------------------------------");
          }
          break;

        case 9:
          System.out.println("Saindo...");
          ligado = false; // Sai do loop
          break;

        default:
          System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
          break;
      }
    }

    sc.close();
  }
}
