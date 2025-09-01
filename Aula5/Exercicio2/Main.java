package Aula5.Exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        // gera um numero aleatorio entre 0 e 1
        int i = rand.nextInt(2);
        int j = rand.nextInt(2);

        boolean [][] campoMinado = new boolean[2][2]; // matriz 2x2
        campoMinado [i][j] = true;

        // Para ler do teclado a posiçao digitadas
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a linha: ");
        int linha = entrada.nextInt();
        System.out.print("Digite a coluna: ");
        int coluna = entrada.nextInt();

        while(campoMinado[linha][coluna] == false){
            System.out.println("Nao atingiu a mina! Tente de novo.");
            System.out.print("Digite a linha: ");
            linha =  entrada.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = entrada.nextInt();

            if(campoMinado[linha][coluna] == true){
                System.out.println("Voce atingiu a mina! Parabens");
                break;

            }
        }
    }
}
