/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author infotv
 */
public class ItemNaoEncontradoException extends Exception {

    public ItemNaoEncontradoException(String item_nao_existe) {
        super(item_nao_existe);
    }

}
