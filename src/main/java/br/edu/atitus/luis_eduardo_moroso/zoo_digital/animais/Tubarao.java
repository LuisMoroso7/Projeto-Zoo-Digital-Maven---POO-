package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.*;

public class Tubarao extends Peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " nada silenciosamente (peixes não emitem som audível).");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está devorando um cardume de peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando velozmente pelo oceano!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando uma foca!");
    }
}