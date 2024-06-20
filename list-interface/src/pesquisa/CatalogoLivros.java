package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int ano) {
    livroList.add(new Livro(titulo, autor, ano));

  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }

    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livrosPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getNome().equalsIgnoreCase(titulo)) {
          livrosPorTitulo = l;
          break;
        }
      }

    }
    return livrosPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("livro 1", "autor 1", 2028);
    catalogoLivros.adicionarLivro("livro 2", "autor 2", 2021);
    catalogoLivros.adicionarLivro("livro 1", "autor 2", 2022);
    catalogoLivros.adicionarLivro("livro 1", "autor 3", 2023);
    catalogoLivros.adicionarLivro("livro 1", "autor 4", 2095);

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2024));
    System.out.println();

    System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
    System.out.println();

    System.out.println(catalogoLivros.pesquisarPorTitulo("livro 2"));
  }
}
