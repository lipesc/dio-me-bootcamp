import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class GenericSet {
  public static void main(String[] args) {

    // não usando o generics, hashSet permite add qualquer tipo de objeto
    Set conjuntoSemGenerics = new HashSet();
    conjuntoSemGenerics.add("Task - 1");
    conjuntoSemGenerics.add("2024");

    // com genericis
    Set<String> conjuntoGenerics = new HashSet<>();
    conjuntoGenerics.add("Task - 2");
    conjuntoGenerics.add("Task - 3");

    // Iterando sobre a lista com Generics
    for (String elemento : conjuntoGenerics) {
      System.out.println(elemento);
    }

    System.out.println("Iterando lista sem Generics é necessário fazer casting");
    for (Object element : conjuntoSemGenerics) {
      String str = (String) element;
      System.out.println(str);
    }
  }
}
