package Aula3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entre com as notas

        System.out.print("Entre com a nota1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Entre com a nota2: ");
        double nota2 = entrada.nextDouble();

        double total = nota1 + nota2;
        double media = total/2;

        System.out.println("Media das notas: " + media);

        if(media >= 60)
        {
            System.out.println("O aluno esta aprovado!");
        }
        else if(media < 30)
        {
            System.out.println("O aluno esta reprovado!");
        }
        else
        {
            System.out.println("O aluno esta de NP3!");
        }

        entrada.close();
    }
}
