package exercicio1;
import java.util.Random;
public class  VetorRandomizada {


    public static int []  vetorRandomizada () {
        Random random = new Random();

        int matrizRandomizada []  = new int [4];
        
        for(int i = 0; i<matrizRandomizada.length; i ++){
            

            matrizRandomizada [i]  = random.nextInt();
            }
        
        return matrizRandomizada;

    }
    
}
