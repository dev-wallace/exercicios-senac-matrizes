package exercicio1;
import java.util.Scanner;
public class MatrizTransposta {
    public static int [] [] matrizTransposta (){

      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("a quantidade de linhas da matriz");
        int linhas = sc.nextInt();
        System.out.println("");
      

        System.out.println("a quantidade de colunas da matriz");
        int colunas = sc.nextInt();

        int aux = linhas;
        linhas = colunas;
        colunas = aux;

        int matrizTransposta [] [] = new int [linhas] [colunas];

        for(int i = 0;i<matrizTransposta.length; i++){
            for(int j = 0; j<matrizTransposta[i].length;j++){
                System.out.println("informe os vaores das linhas para a matriz " +aux+ "x" +linhas+ "*ela sera transposta*");

                matrizTransposta [i] [j]= sc.nextInt();

            
            }
       
        }

        
        for(int i = 0;i<matrizTransposta.length; i++){
            for(int j = 0; j<matrizTransposta[i].length;j++){

                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
        return matrizTransposta;

    }
    
}
