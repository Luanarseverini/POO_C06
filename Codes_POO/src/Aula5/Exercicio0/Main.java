package Aula5.Exercicio0;

public class Main {

    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Pao de queijo";

        Salgado salgado2 = new Salgado();
        salgado2.nome = "Pastel";

        Salgado salgado3 = new Salgado();
        salgado3.nome = "Enroladinho";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);

        cantina.mostraInfo();
    }
}
