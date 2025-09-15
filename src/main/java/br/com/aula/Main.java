package br.com.aula;

public class Main {

    public static void main(String[] args) {

        PilhaDePratos pilha = new PilhaDePratos(5);

        System.out.println("--- Cantina ---");


        System.out.println("\nAdicionando 5 pratos...");
        pilha.push("Prato de Cerâmica Branco");
        pilha.push("Prato de Vidro Transparente");
        pilha.push("Prato de Porcelana Azul");
        pilha.push("Prato Quadrado de Plástico");
        pilha.push("Prato Fundo para Sopa");

        System.out.println("\nPilha está cheia? " + pilha.isFull());


        System.out.println("\n Retirando 2 pratos para o almoço...");
        String pratoRetirado1 = pilha.pop();
        System.out.println("Aluno pegou o: '" + pratoRetirado1 + "'");

        String pratoRetirado2 = pilha.pop();
        System.out.println("Aluno pegou o: '" + pratoRetirado2 + "'");


        System.out.println("\n Verificando qual o próximo prato (peek)...");
        System.out.println("O prato no topo agora é: '" + pilha.peek() + "'");


        System.out.println("\n Exibindo o estado final da pilha...");
        pilha.exibirPilha();

        System.out.println("\n--- Fim ---");


        System.out.println("\n--- Desafio Extra ---");


        System.out.println("\nadicionando um prato com a pilha já cheia...");
        PilhaDePratos pilhaCheia = new PilhaDePratos(2);
        pilhaCheia.push("Prato A");
        pilhaCheia.push("Prato B");
        pilhaCheia.push("Prato C");

        System.out.println("\n Tentando retirar um prato de uma pilha já vazia...");
        PilhaDePratos pilhaVazia = new PilhaDePratos(2);
        pilhaVazia.pop();

        System.out.println("\n--- Fim ---");
    }
}