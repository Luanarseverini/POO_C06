package Aula4_1.Exercicio2;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }
    }
}
