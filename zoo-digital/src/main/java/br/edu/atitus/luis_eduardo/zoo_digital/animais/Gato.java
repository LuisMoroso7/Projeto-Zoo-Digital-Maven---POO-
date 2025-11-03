package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Gato extends Mamifero implements Corredor, Predador {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando: miau!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração de peixe.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo atrás de um laser!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando um rato pela casa!");
    }
}