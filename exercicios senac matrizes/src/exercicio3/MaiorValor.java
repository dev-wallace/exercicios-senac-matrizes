package exercicio3;

import java.util.Scanner;
public class MaiorValor {
    public static int [][] maiorValor (){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe a quantidade de linhas da matriz");
        int linhas = sc.nextInt();

        System.out.println("informe a qauntidade de colunas ");
        int colunas = sc.nextInt();

        int maiorValor [] [] = new int [linhas] [colunas];
        int maior;
        for(int i = 0; i<maiorValor.length; i++){
            for(int j = 0;j<maiorValor[i].length;j++){
                System.out.println("informe os valores para a matriz ");
                maiorValor [i] [j] =sc.nextInt();

            }

        }
        maior = maiorValor [0][0];

      
   

        for(int j = 0; j<maiorValor.length;j++){
            for(int k = 0; k< maiorValor[j].length;k++){

                if (maiorValor[j] [k]>maior){
                    maior= maiorValor [j] [k];
                  
                }

            }
        }
         
        
        System.out.println("maior numero da matriz digitado " +maior);
       

        return maiorValor;

    }

    
}
