package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Cachorro extends Mamifero implements Corredor, Predador {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo atrás da bola!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando a meia que roubou!");
    }
}
