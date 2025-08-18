public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Zumbi1";
        z1.vida = 100;

        z2.nome = "Zumbi2";
        z2.vida = 50;

        System.out.println("Vida inicial:");
        System.out.println(z1.nome + ": " + z1.mostraVida());
        System.out.println(z2.nome + ": " + z2.mostraVida());

        z1.transfereVida(z2, 30);

        System.out.println("Depois da transferência:");
        System.out.println(z1.nome + ": " + z1.mostraVida());
        System.out.println(z2.nome + ": " + z2.mostraVida());
    }
}
