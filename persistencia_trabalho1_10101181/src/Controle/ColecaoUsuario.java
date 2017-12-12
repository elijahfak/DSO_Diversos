/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Exception.ItemNaoEncontradoException;
import Modelo.Item;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author infotv
 */
public class ColecaoUsuario implements Serializable {

    private HashMap<String, ArrayList<Item>> colecao;
    private static ColecaoUsuario instancia;

    //retorna sempre a mesma instancioa da classe
    public static ColecaoUsuario getInstance() {
        if (instancia == null) {
            ColecaoUsuario p = (ColecaoUsuario) Serializacao.carregaColecaoUsuario();
            if (p != null) {
                instancia = p;
            } else {
                instancia = new ColecaoUsuario(new HashMap<String, ArrayList<Item>>());
            }
        }
        return instancia;
    }

    public ColecaoUsuario(HashMap<String, ArrayList<Item>> colecao) {
        this.colecao = colecao;
    }

    public boolean existe_usuario(String login) {
        return ColecaoUsuario.getInstance().getColecao().containsKey(login);
    }

    public boolean existe_usuario(String loginUsuario, Item item) {
        return this.getColecao().get(loginUsuario).contains(item);
    }

    public void adiciona_usuario(String loginUsuario, Item item) {
        this.getColecao().get(loginUsuario).add(item);
        Serializacao.salvaColecaoUsuario();
    }

    public void remove_usuario(String loginUsuario, Item item) {
        this.getColecao().get(loginUsuario).remove(this.getColecao().get(loginUsuario).indexOf(item));
        Serializacao.salvaColecaoUsuario();
    }

    public ArrayList<Item> getColecaoUsuario(String login) {
        HashMap<Integer, String> tipo = new HashMap<Integer, String>();
        tipo.put(1, "Livro");
        tipo.put(2, "Filme");
        tipo.put(3, "Música");

        return ColecaoUsuario.getInstance().getColecao().get(login);
    }

    public void insere_item_colecao_usuario(String login, int idItem) throws ItemNaoEncontradoException {
        if (!this.existe_usuario(login)) {
            ColecaoUsuario.getInstance().getColecao().put(login, new ArrayList<Item>());
        }

        ColecaoUsuario.getInstance().getColecao().get(login).add(Acervo.getInstance().get_item(idItem));
        Serializacao.salvaColecaoUsuario();
    }

    public HashMap<String, ArrayList<Item>> getColecao() {
        return colecao;
    }

    public void setColecao(HashMap<String, ArrayList<Item>> colecaoUsuario) {
        this.colecao = colecao;
    }

    public void remove_item_colecao_usuario(String login, int idItem) {
        if (!this.existe_usuario(login)) {
            ColecaoUsuario.getInstance().getColecao().put(login, new ArrayList<Item>());
        }

        ArrayList<Item> colecao_usu = ColecaoUsuario.getInstance().getColecao().get(login);

        colecao_usu.remove(colecao_usu.get(idItem));
        Serializacao.salvaColecaoUsuario();
    }

}
