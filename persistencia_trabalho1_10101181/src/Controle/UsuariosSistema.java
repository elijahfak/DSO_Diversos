/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Exception.UsuarioNaoEncontradoException;
import Modelo.Usuario;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author infotv
 */
public class UsuariosSistema implements Serializable {

    private HashMap<String, Usuario> usuariosSistema;
    private static UsuariosSistema instancia;

    //retorna sempre a mesma instancioa da classe
    public static UsuariosSistema getInstance() {
        if (instancia == null) {
            UsuariosSistema p = (UsuariosSistema) Serializacao.carregaUsuarioSistema();
            if (p != null) {
                instancia = p;
            } else {
                instancia = new UsuariosSistema(new HashMap<String, Usuario>());
            }
        }
        return instancia;
    }

    private UsuariosSistema(HashMap<String, Usuario> usuariosSistema) {
        this.usuariosSistema = usuariosSistema;
    }

    public boolean existe_usuario(String login) {
        return this.getUsuariosSistema().containsKey(login);
    }

    public void adiciona_usuario(Usuario usuario) {
        this.getUsuariosSistema().put(usuario.getLogin(), usuario);
        Serializacao.salvaUsuarioSistema();
    }

    public Usuario get_usuario(Usuario usuario) throws UsuarioNaoEncontradoException {
        return this.get_usuario(usuario.getLogin());
    }

    public Usuario get_usuario(String login) throws UsuarioNaoEncontradoException {
        if(!this.usuariosSistema.containsKey(login)){
            throw new UsuarioNaoEncontradoException("Usuario não encontrado");
        }
        return this.usuariosSistema.get(login);
    }

    public HashMap<String, Usuario> getUsuariosSistema() {
        return this.usuariosSistema;
    }

    public void setUsuariosSistema(HashMap<String, Usuario> usuariosSistema) {
        this.usuariosSistema = usuariosSistema;
    }

}
