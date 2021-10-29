
package egg.estancias;

import entidades.Familia;
import persistencia.FamiliaDAO;


public class EstanciasMain {


    public static void main(String[] args) {
        
        FamiliaDAO fdao = new FamiliaDAO();
        
        fdao.listar().forEach(aux -> System.out.println(aux));
        
        Familia f = new Familia();
   
        
        System.out.println(fdao.encontrar(f));

    }
    
}
