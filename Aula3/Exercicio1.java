package Aula3;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entre com os valores

        System.out.print("Entre com o valor do lanche1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o valor do lanche2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o valor do lanche3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        double media = (double) total/3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);

        entrada.close();
    }
}
