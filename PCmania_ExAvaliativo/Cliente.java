package PCmania_ExAvaliativo;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] compras;
    private int quantidade; // quantidade de promoçoes escolhidas

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[10];
        this.quantidade = 0;
    }

    public void compraComputador(Computador pc) {
        if (quantidade < compras.length) {
            compras[quantidade] = pc;
            quantidade++;
        }
    }

    public void totalCompras() {
        System.out.println("-- SUA COMPRA --");
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);

        float total = 0;
        for (int i = 0; i < quantidade; i++) {
            compras[i].mostraPCConfigs();
            total += compras[i].getPreco();
        }
        System.out.println("TOTAL DA COMPRA: R$" + total);
    }
}
