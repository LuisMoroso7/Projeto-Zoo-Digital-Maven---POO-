package br.edu.atitus.luis_eduardo.zoo_digital.animais;

import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está gritando alto pelos céus!");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está se alimentando de um peixe.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está planando majestosamente no ar!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando um coelho!");
    }
}
