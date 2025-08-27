package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        // para gerar números aleatórios entre 1 e 10
        numGerado = rand.nextInt(10) + 1;

        do {
            System.out.print("Qual o número que estou pensando? ");
            numAdivinhado = entrada.nextInt();
            if(numAdivinhado < numGerado)
                System.out.println("O meu número é maior!");
            else if(numAdivinhado > numGerado)
                System.out.println("O meu número é menor!");

        } while (numGerado != numAdivinhado);

        System.out.println("Parabéns, você acertou meu número!");

        // Para fechar o Scanner, após seu uso
        entrada.close();

    }
}
