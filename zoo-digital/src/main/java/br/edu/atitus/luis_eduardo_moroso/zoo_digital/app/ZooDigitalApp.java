package br.edu.atitus.luis_eduardo_moroso.zoo_digital.app;

import java.util.*;
import br.edu.atitus.luis_eduardo.zoo_digital.animais.*;
import br.edu.atitus.luis_eduardo.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== ZOO DIGITAL ===");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos os Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAnimal(sc);
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> System.out.println("Total: " + Animal.getContador());
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAnimal(Scanner sc) {
        System.out.println("Digite o tipo (ex: cachorro, gato, leao...): ");
        String tipo = sc.nextLine().toLowerCase();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Animal novo = null;

        if (tipo.equals("cachorro")) novo = new Cachorro(nome, idade);
        else if (tipo.equals("gato")) novo = new Gato(nome, idade);
        else if (tipo.equals("leao")) novo = new Leao(nome, idade);
        else if (tipo.equals("aguia")) novo = new Aguia(nome, idade);
        else if (tipo.equals("pinguim")) novo = new Pinguim(nome, idade);
        else if (tipo.equals("tubarao")) novo = new Tubarao(nome, idade);
        else if (tipo.equals("peixe_palhaco")) novo = new PeixePalhaco(nome, idade);
        else if (tipo.equals("cobra")) novo = new Cobra(nome, idade);
        else if (tipo.equals("jacare")) novo = new Jacare(nome, idade);
        else if (tipo.equals("lagarto")) novo = new Lagarto(nome, idade);
        else if (tipo.equals("tartaruga")) novo = new Tartaruga(nome, idade);

        if (novo != null) {
            animais.add(novo);
            System.out.println("Animal cadastrado com sucesso!");
        } else {
            System.out.println("Tipo não reconhecido.");
        }
    }

    private static void listarTodos() {
        for (Animal a : animais) {
            System.out.println(a);
            a.emitirSom();
            a.comer();
        }
    }

    private static void listarCorredores() {
        for (Animal a : animais)
            if (a instanceof Corredor c)
                c.correr();
    }

    private static void listarNadadores() {
        for (Animal a : animais)
            if (a instanceof Nadador n)
                n.nadar();
    }

    private static void listarVoadores() {
        for (Animal a : animais)
            if (a instanceof Voador v)
                v.voar();
    }

    private static void listarPredadores() {
        for (Animal a : animais)
            if (a instanceof Predador p)
                p.cacar();
    }
}
