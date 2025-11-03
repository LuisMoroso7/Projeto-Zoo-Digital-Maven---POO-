package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.*;

public class Cobra extends Reptil implements Predador {

    public Cobra(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está sibiliando: ssssss!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está engolindo um rato inteiro.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando um pequeno roedor!");
    }
}