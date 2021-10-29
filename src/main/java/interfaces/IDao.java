
package interfaces;

import java.util.List;

public interface IDao<T> {
    
   public List<T> listar();
   public T encontrar(T t);
   public int insertar (T t);
   public int modificar (T t);
   public void eliminar (T t);
    
}
