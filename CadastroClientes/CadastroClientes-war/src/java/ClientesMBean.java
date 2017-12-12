/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.ClienteFachadaLocal;
import ejb.Clientes;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author aluno
 */
@Named(value = "clientesMBean")
@SessionScoped
public class ClientesMBean implements Serializable {
    @EJB
    private ClienteFachadaLocal clienteFachada;

    /**
     * Creates a new instance of ClientesMBean
     */
    public ClientesMBean() {
    }
    
    public List<Clientes> getListaClientes() {
        return clienteFachada.getListaClientes();
    }
}
