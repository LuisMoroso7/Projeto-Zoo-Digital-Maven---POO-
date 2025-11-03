package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.*;

public class Jacare extends Reptil implements Nadador, Predador {

    public Jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está rugindo baixo perto da água.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está mastigando lentamente sua presa.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está deslizando silenciosamente na água!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando uma ave na beira do rio!");
    }
}