package exercicio6;

public class PorcentualImpares {
    public static double calcularPorcentualImapares(int[] vetorRandomizado) {
        double somaImpares = 0;
        
        double percentual = 0;

        for(int i = 0; i<vetorRandomizado.length;i++){

            if(vetorRandomizado[i]%2== 0 ){

            }
            else{
                somaImpares += vetorRandomizado[i];
                
                
               
            }
           
        }
        for (int i = 0; i < vetorRandomizado.length; i++) {
            if (vetorRandomizado[i] % 2 != 0) {
                 percentual = (vetorRandomizado[i] / somaImpares) * 100;
             
                
            }
        }



      return percentual;  
    }

}
