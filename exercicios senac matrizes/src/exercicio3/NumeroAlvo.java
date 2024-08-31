package exercicio3;

public class NumeroAlvo {
    public static int  numeroAlvo (int target, int [] numeros){
       
        
     
        numeros[0] = -219;
        numeros[1] = 119;
        numeros[2] = 99;
        numeros[3] = 7;

        for(int i = 0; i<numeros.length;i++){
            
             if(numeros[i] == target){
                return i;

             }
             

        }
        return -1;
    }

}
