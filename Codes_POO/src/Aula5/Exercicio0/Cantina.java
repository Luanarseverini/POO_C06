package Aula5.Exercicio0;

public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgados(Salgado novoSalgado) {

        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo() {
        System.out.println("A " + nome + " possui os seguintes salgados:");
        for (Salgado salgado : salgados) {
            if (salgado != null) //Verifica se existe salgado antes de imprimir
                System.out.println(salgado.nome);
        }
    }
}
