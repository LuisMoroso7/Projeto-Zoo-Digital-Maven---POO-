package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está rugindo poderosamente!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está devorando sua presa.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo pela savana!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando uma zebra!");
    }
}
