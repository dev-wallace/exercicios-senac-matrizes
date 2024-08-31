import exercicio1.*;
import exercicio2.*;
import exercicio4.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    boolean ligado = true;
    int[] vetor = new int[0]; // Inicializar o vetor fora do loop
  
    while (ligado) {
      // Exibe o menu
      System.out.println("Escolha uma das opções abaixo:");
      System.out.println("Opção 1 - Inicializar o vetor com números aleatórios");
      System.out.println("Opção 2 - Imprimir o vetor");
      System.out.println("Opção 3 - Verificar se um determinado número está contido no vetor");
      System.out.println("Opção 4 - Buscar o maior número armazenado no vetor");
      System.out.println("Opção 9 - Sair");

      if (ligado) {
      
        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();

       
        switch (escolha) {
          case 1:
          System.out.println("========================================================================================================================");
            vetor = VetorRandomizada.vetorRandomizada(); 
            System.out.println("Vetor inicializado com números aleatórios:");
            for (int valor : vetor) {
              System.out.print(valor + " ");
            }
            System.out.println();
            System.out.println("========================================================================================================================");
          

            break;

          case 2:
          System.out.println("========================================================================================================================");
          ImprimirVetor.imprimirVetor();
          System.out.println();
          System.out.println("========================================================================================================================");
       
            break;

          case 3:
            
            break;

          case 4:
          System.out.println("========================================================================================================================");
            int maior = MaiorValor.maiorValor(); 
            System.out.println("O maior número armazenado no vetor é: " + maior);
            System.out.println("========================================================================================================================");
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
