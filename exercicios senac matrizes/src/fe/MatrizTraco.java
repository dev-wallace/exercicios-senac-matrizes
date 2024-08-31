package fe;
import java.util.Scanner;
public class MatrizTraco {

    public static int [] [] matrizTraco (){

        Scanner sc = new Scanner(System.in);


        int matrizTraco [] [] = new int [3] [3];

        /*
         * {123}
         * {456}
         * {789}
         * traco = 1 5 9
         */
 
        for(int i = 0; i<matrizTraco.length;i++){
            for(int j = 0; j<matrizTraco[i].length;j++){
                System.out.print("informe os valores para a matriz ");

                matrizTraco [i] [j] = sc.nextInt();

            }
        }
        System.out.println("exibindo traco da matriz ");

        for(int i = 0; i<matrizTraco.length;i++){

               System.out.println(matrizTraco[i][i] + " ");

        }

        sc.close();
        return matrizTraco;
    }



}
