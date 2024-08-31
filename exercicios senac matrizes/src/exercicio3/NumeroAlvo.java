package exercicio3;

public class NumeroAlvo {
    public static int  numeroAlvo (int target, int[] vetorRandomizado){
       

        for(int i = 0; i<vetorRandomizado.length;i++){
            
             if(vetorRandomizado[i] == target){
                return i;

             }
             

        }
        return -1;
    }

}
