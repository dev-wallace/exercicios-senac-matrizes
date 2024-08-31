package exercicio1;
import java.util.Random;
public class  VetorRandomizada {


    public static int []  vetorRandomizado (int[] vetorRandomizado) {

        Random random = new Random();

          
        
        for(int i = 0; i<vetorRandomizado.length; i ++){
            

            vetorRandomizado [i]  = random.nextInt(0,100);
            }
        
        return vetorRandomizado;

    }
    
}
