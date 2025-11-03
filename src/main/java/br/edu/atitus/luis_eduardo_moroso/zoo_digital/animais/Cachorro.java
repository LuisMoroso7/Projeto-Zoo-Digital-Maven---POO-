package br.edu.atitus.luis_eduardo_moroso.zoo_digital.animais;

import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.luis_eduardo_moroso.zoo_digital.comportamentos.Predador;

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
        System.out.println(nome + " está correndo no parque.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando a meia que roubou.");
    }
}
