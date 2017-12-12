/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Exception.ItemNaoEncontradoException;
import Modelo.Item;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author infotv
 */
public class Acervo implements Serializable {

    private HashMap<Integer, Item> acervo;
    private static Acervo instancia;

    //retorna sempre a mesma instancioa da classe
    public static Acervo getInstance() {
        if (instancia == null) {
            Acervo p = (Acervo) Serializacao.carregaAcervo();
            if (p != null) {
                instancia = p;
            } else {
                instancia = new Acervo(new HashMap<Integer, Item>());
            }
        }
        return instancia;
    }

    private Acervo(HashMap<Integer, Item> acervo) {
        this.acervo = acervo;
    }

    public boolean existe_item(int id) {
        return this.getAcervo().containsKey(id);
    }

    public void adiciona_item(Item item) {
        this.getAcervo().put(item.getId(), item);
        Serializacao.salvaAcervo();
    }

    public void remover_item(Item item) {
        this.getAcervo().remove(item.getId());
        Serializacao.salvaAcervo();
    }

    public Item get_item(Item item) throws ItemNaoEncontradoException {
        return this.get_item(item.id);
    }

    public Item get_item(int id) throws ItemNaoEncontradoException {
        if (!this.existe_item(id)) {
            throw new ItemNaoEncontradoException("Item não existe");
        }
        return getAcervo().get(id);

    }

    public HashMap<Integer, Item> getAcervo() {
        return acervo;
    }

    public void setAcervo(HashMap<Integer, Item> acervo) {
        this.acervo = acervo;
    }

}
