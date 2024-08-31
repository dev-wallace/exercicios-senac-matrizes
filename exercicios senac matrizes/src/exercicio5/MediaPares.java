package exercicio5;

public class MediaPares {
    public static double calcularMediaPares(int mediaNumerosPeres[]){

        mediaNumerosPeres [0] = 200;
        mediaNumerosPeres [1 ]= 200;
        mediaNumerosPeres [2] = 400;
        mediaNumerosPeres [3] = 600;
        double aux;
        double soma =0;
        
        for(int i = 0; i < mediaNumerosPeres.length;i++){
            if(mediaNumerosPeres[i]%2 == 0){
                aux = mediaNumerosPeres[i];

                soma += aux;
                
                
               

            }
            soma = soma / (i + 1);
          
           
        }
        return soma;

    }

}
