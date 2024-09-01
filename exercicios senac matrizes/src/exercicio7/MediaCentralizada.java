package exercicio7;

public class MediaCentralizada {
    public static int calcularMediaCentralizada(int [] vetorRandomizado){
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int meio =0;

        // Encontrando o maior e menor valor no vetor
        for (int i = 0; i < vetorRandomizado.length; i++) {
            if (vetorRandomizado[i] > maior) {
                maior = vetorRandomizado[i];
            }
            if (vetorRandomizado[i] < menor) {
                menor = vetorRandomizado[i];
            }
            
            if(meio<maior && meio >menor){
                meio =vetorRandomizado[i];
                
                

            }

            }

    
        

       
        

        return meio;
    }

}
