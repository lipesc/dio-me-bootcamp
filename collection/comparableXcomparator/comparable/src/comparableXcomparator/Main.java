package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    System.out.println("**********************************************");
    ArrayList<Livro> livros = new ArrayList<Livro>() {
      {
        add(new Livro("Aprendendo Java: Fundamentos e Práticas de Programação", "Alexandre Garcia", 2022));
        add(new Livro("Java Avançado: Técnicas de Desenvolvimento", "Mariana Silva", 2022));
        add(new Livro("Arquitetura de Microsserviços em Java: Guia Prático", "Carlos Eduardo", 2019));
        add(new Livro("Algoritmos em Java: Conceitos e Aplicações", "Fernando Castor", 2019));
        add(new Livro("Programação Kotlin: Do Básico ao Avançado", "Ana Beatriz", 2019));
        ;
      }
    };

    System.out.println("Livros após a ordenação natural (Título): ");
    Collections.sort(livros);
    for (Livro livro : livros) {
      System.out.println(livro.getTitulo() + " - " +
          livro.getAutor() + " - " +
          livro.getAno());
    }

    System.out.println("**********************************************");

    System.out.println("Livros após a ordenação por ano: ");
    Collections.sort(livros, new CompararAno());
    for (Livro livro : livros) {
      System.out.println(livro.getAno() + " - " +
          livro.getTitulo() + " - " +
          livro.getAutor());
    }

    System.out.println("**********************************************");

    System.out.println("Livros após a ordenação por autor: ");
    Collections.sort(livros, new CompararAutor());
    for (Livro livro : livros) {
      System.out.println(livro.getAutor() + " - " +
          livro.getTitulo() + " - " +
          livro.getAno());
    }

    System.out.println("**********************************************");

    System.out.println("Livros após a ordenação por ano, autor e título: ");
    Collections.sort(livros, new CompararAnoAutorTitulo());
    for (Livro livro : livros) {
      System.out.println(livro.getAno() + " - " +
          livro.getAutor() + " - " +
          livro.getTitulo());
    }
  }
}