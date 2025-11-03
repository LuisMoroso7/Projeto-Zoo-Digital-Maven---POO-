package br.edu.atitus.luis_eduardo.zoo_digital.animais;

public abstract class Animal {
    private static int contador = 0;
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();
    public abstract void comer();

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - Nome: " + nome + ", Idade: " + idade;
    }
}