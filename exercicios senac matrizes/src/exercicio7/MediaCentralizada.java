package exercicio7;

import exceptions.NumberNotFoundException;

public class MediaCentralizada {
    public static int calcularMediaCentralizada(int [] vetorRandomizado){
        if (vetorRandomizado.length <= 2) {
            throw new NumberNotFoundException("O vetor deve conter mais de dois elementos para calcular a média centralizada.");
        }
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int contagem = 0;

        for (int i = 0; i < vetorRandomizado.length; i++) {
            if (vetorRandomizado[i] > maior) {
                maior = vetorRandomizado[i];
            }
            if (vetorRandomizado[i] < menor) {
                menor = vetorRandomizado[i];
            }
            
        
            }
            for (int i = 0; i < vetorRandomizado.length; i++) {
             if(vetorRandomizado[i]!= maior && vetorRandomizado[i] != menor) {
                soma+= vetorRandomizado[i];
                contagem ++;

                
             }
            
            
                }
          
    
            return soma / contagem;
        }
    }

