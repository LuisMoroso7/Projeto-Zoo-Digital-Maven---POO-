package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.*;

public class Tartaruga extends Reptil implements Nadador, Corredor {

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está fazendo um som baixo e rouco.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo folhas aquáticas.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando calmamente no lago.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está caminhando lentamente pela areia.");
    }
}