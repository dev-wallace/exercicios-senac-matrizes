package exercicio8;

import exceptions.NumberNotFoundException;

public class DuasSomas {
    public static int[] duasSomas(int[] vetorRandomizado, int target) {
        
        if ( vetorRandomizado.length < 2) {
            throw new NumberNotFoundException ("O vetor deve conter pelo menos dois elementos.");
        }

        
        for (int i = 0; i < vetorRandomizado.length; i++) {
            for (int j = i + 1; j < vetorRandomizado.length; j++) {
                if (vetorRandomizado[i] + vetorRandomizado[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

      
        return vetorRandomizado;
    }
    
}

