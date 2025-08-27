package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        // gera numeros aleatorios entre 1 e 10
        numGerado = rand.nextInt(10) + 1;

        do{
            System.out.print("Qual numero estou pensando? ");
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado != numGerado)
                System.out.println("Errado!");
        }while (numGerado != numAdivinhado);

        System.out.println("Parabens, numero certo!");

        entrada.close();
    }
}
