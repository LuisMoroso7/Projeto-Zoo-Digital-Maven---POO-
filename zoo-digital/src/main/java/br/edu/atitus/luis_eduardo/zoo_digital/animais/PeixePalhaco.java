package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class PeixePalhaco extends Peixe implements Nadador {

    public PeixePalhaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está fazendo bolhas na água.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo algas e pequenos crustáceos.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando entre os corais!");
    }
}