import exercicio1.*;
import exercicio2.*;
import exercicio3.*;
import exercicio4.*;
import exercicio5.*;


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

    while (ligado) {
      // Exibe o menu
      System.out.println("Escolha uma das opções abaixo:");
      System.out.println("Opção 1 - Inicializar o vetor com números aleatórios");
      System.out.println("Opção 2 - Imprimir o vetor");
      System.out.println("Opção 3 - Verificar se um determinado número está contido no vetor");
      System.out.println("Opção 4 - Buscar o maior número armazenado no vetor");
      System.out.println("Opção 5 - Calcular a média dos números pares armazenados no vetor");
      System.out.println("Opção 9 - Sair");

      if (ligado) {

        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();

        switch (escolha) {
          case 1:
            System.out.println(
                "========================================================================================================================");
            int[] vetor = new int[0];
            vetor = VetorRandomizada.vetorRandomizada();
            System.out.println("Vetor inicializado com números aleatórios:");
            for (int valor : vetor) {
              System.out.print(valor + " ");
            }
            System.out.println();
            System.out.println(
                "========================================================================================================================");

            break;

          case 2:
            System.out.println(
                "========================================================================================================================");
            ImprimirVetor.imprimirVetor();
            System.out.println();
            System.out.println(
                "========================================================================================================================");

            break;

          case 3:
            System.out.println(
                "========================================================================================================================");
            System.out.println("Informe o numero alvo ");
            int target = sc.nextInt();
            int[] numeros = new int[4];
            int verificador = NumeroAlvo.numeroAlvo(target, numeros);
            if (verificador == -1) {
              System.out.println("valor nao encontrado");
            } else {
              System.out.println("numero encontrado no indice " + verificador);

            }

            System.out.println();
            System.out.println(
                "========================================================================================================================");

            break;

          case 4:
            System.out.println(
                "========================================================================================================================");
            int maior = MaiorValor.maiorValor();
            System.out.println("O maior número armazenado no vetor é: " + maior);
            System.out.println(
                "========================================================================================================================");
            break;
            case 5:
            System.out.println(
                "========================================================================================================================");
                int[] mediaNumerosPeres = new int[4];
                
            double mediaPares = MediaPares.calcularMediaPares(mediaNumerosPeres);
            System.out.println("a meida dos numero pares e " +mediaPares);
            System.out.println(
              "========================================================================================================================");
           
            break;

            case 6:
           
            break;

            case 7:
           
            break;
            
            case 8:
           
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
    }

    sc.close();
  }
}
