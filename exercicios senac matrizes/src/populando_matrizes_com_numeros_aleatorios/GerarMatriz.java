package populando_matrizes_com_numeros_aleatorios;
import java.util.Random;
public class GerarMatriz {


    public static int [] [] gerarMatriz () {
        Random random = new Random();

        int matriz [] [] = new int [2] [2];
        
        for(int i = 0; i<matriz.length; i ++){
            for(int j = 0;j < matriz[i].length; j++){

                matriz [i] [j] = random.nextInt(101);
            }
        }

  
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        return matriz;

    }
    
}
