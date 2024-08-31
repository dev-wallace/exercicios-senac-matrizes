package exercicio4;


public class MaiorValor {
    public static int maiorValor (int[] vetorRandomizado) {
         


        int maior;
    
        maior = vetorRandomizado [0];

        for(int i = 0; i<vetorRandomizado.length;i++){
           
                if (vetorRandomizado[i] >maior){
                    maior= vetorRandomizado [i];
                  
                }

            }
        
        return maior;
        
    }
  
    
}
