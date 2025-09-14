package PCmania_ExAvaliativo;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] compras;
    private int TotalComprados; // quantidade de promoçoes escolhidas

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[10];
        this.TotalComprados = 0;
    }

    public void compraComputador(Computador pc) {
        if (TotalComprados < compras.length) {
            compras[TotalComprados] = pc;
            TotalComprados++;
        }
    }

    public float calculaTotalCompra() {
        System.out.println("-- SUA COMPRA --");
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);

        float total = 0;
        for (int i = 0; i < TotalComprados; i++) {
            compras[i].mostraPCConfigs();
            total += compras[i].getPreco();
        }
        System.out.println("TOTAL DA COMPRA: R$" + total);
        return total;
    }
}
