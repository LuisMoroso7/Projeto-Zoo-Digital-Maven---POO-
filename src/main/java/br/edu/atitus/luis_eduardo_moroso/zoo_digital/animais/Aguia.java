package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Voador;
import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Predador;

public class Aguia extends Animal implements Voador, Predador {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (águia) está gritando: Kreee!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo sua presa.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando alto sobre as montanhas.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando um pequeno roedor no campo.");
    }
}
