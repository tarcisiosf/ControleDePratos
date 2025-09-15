package br.com.aula;

public class PilhaDePratos {

    private String[] pratos;
    private int topo;
    private int capacidade;


    public PilhaDePratos(int capacidade) {
        this.capacidade = capacidade;
        this.pratos = new String[capacidade];
        this.topo = -1;
    }


    public void push(String prato) {
        if (isFull()) {
            System.out.println("ERRO: A pilha de pratos está cheia! Não é possível adicionar mais.");
        } else {
            topo++;
            pratos[topo] = prato;
            System.out.println("'" + prato + "' foi colocado na pilha.");
        }
    }


    public String pop() {
        if (isEmpty()) {
            System.out.println("ERRO: A pilha de pratos está vazia! Não há pratos para retirar.");
            return null;
        } else {
            String pratoRemovido = pratos[topo];
            pratos[topo] = null;
            topo--;
            return pratoRemovido;
        }
    }


    public String peek() {
        if (isEmpty()) {
            return "A pilha está vazia.";
        } else {
            return pratos[topo];
        }
    }


    public boolean isEmpty() {
        return topo == -1;
    }


    public boolean isFull() {
        return topo == capacidade - 1;
    }


    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("Estado da Pilha: [VAZIA]");
        } else {
            System.out.println("Estado Final da Pilha (Topo -> Base):");
            for (int i = topo; i >= 0; i--) {
                System.out.println(" -> " + pratos[i]);
            }
        }
    }
}
