package exercicio2;

import java.util.Scanner;

public class Mavenproject1 {
    public static int [] testeJava() {
        Scanner entrada = new Scanner(System.in);
        // declara e cria o vetor
        int[] v = new int[5];
        // le dados para o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.print("V[" + i + "]: ");
            v[i] = entrada.nextInt();
        }
        // inverte os elementos do vetor
        int aux;
        for (int i = 0; i < v.length / 2; i++) {
            aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
        // apresenta os dados do vetor
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        entrada.close();
        System.out.println();
        return v;
    }
}
