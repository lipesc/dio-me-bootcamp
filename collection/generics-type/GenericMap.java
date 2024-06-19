import java.util.HashMap;
import java.util.Map;

public class GenericMap {
  public static void main(String[] args) {

    // sem generics
    Map mapSemGenerics = new HashMap();
    mapSemGenerics.put("chave 1", 10);
    mapSemGenerics.put("chave 2", "valor");

    // com senerics
    Map<String, Integer> mapGenerics = new HashMap<>();
    mapGenerics.put("chave 3\n", 30);
    mapGenerics.put("chave 4\n", 40);

    // Iterando
    for (Map.Entry<String, Integer> entry : mapGenerics.entrySet()) {
      String chave = entry.getKey();
      int valor = entry.getValue();
      System.out.println(chave + valor);
    }
  }
}
