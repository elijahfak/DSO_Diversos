/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author aluno
 */
@Stateless
public class ClienteFachada implements ClienteFachadaLocal {
    @PersistenceContext(unitName = "CadastroClientes-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

     public List<ejb.Clientes> getListaClientes() {
        Query query = em.createNamedQuery("Clientes.findAll");
        return query.getResultList();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
