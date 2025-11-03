package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Lagarto extends Reptil implements Corredor {

    public Lagarto(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " não faz sons audíveis.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo sobre as pedras!");
    }
}