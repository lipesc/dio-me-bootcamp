// public class Box {
//      private Object object;
//      public void set(Object object) {
//          this.object = object;
//      }
//      public Object get() {
//          return object;
//      }
// }

/**
 * Versão genérica da classe Box
 * 
 * @param <T> o tipo armazenado
 * 
 */

public class Box<T> {
    // T representa "type"
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

}