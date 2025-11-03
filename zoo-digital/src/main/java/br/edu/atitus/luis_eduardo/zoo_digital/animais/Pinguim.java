package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está fazendo barulhos engraçados!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo peixe fresco.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando entre os blocos de gelo!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando krill no gelo!");
    }
}