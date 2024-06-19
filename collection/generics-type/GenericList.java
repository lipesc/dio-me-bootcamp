import java.util.ArrayList;
import java.util.List;

public class GenericList {
  public static void main(String[] args) {
    // exemplo sem Generics
    List listaSemGeneric = new ArrayList();
    listaSemGeneric.add("Seasonº 1 - The Boys");
    listaSemGeneric.add("2019");

    // com Generics
    List<String> listaGeneric = new ArrayList<>();
    listaGeneric.add("first");
    listaGeneric.add("second");
    listaGeneric.add("third");

    // Iterando sobre a lista com Generics
    for (String elemento : listaGeneric) {
      System.out.println(elemento);
    }

    // Iterando lista sem Generics é necessário fazer casting
    for (Object element : listaSemGeneric) {
      String str = (String) element;
      System.out.println(str);

    }

  }
}
