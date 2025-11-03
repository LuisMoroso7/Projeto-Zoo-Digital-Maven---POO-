package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Predador;

public class Pinguim extends Animal implements Nadador, Predador {

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
