package exercicio4;


public class MaiorValor {
    public static int maiorValor (){
         

        int maiorValor []  = new int [3];
        maiorValor[0] = -219;
        maiorValor[1] = 119;
        maiorValor[2] = 99;

        int maior;
    
        maior = maiorValor [0];

        for(int i = 0; i<maiorValor.length;i++){
           
                if (maiorValor[i] >maior){
                    maior= maiorValor [i];
                  
                }

            }
        
        return maior;
        
    }
  
    
}
