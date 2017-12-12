/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Exception.ItemNaoEncontradoException;
import Modelo.*;
import Exception.UsuarioNaoEncontradoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author elizeu
 */
public class EventoPersistencia {

    public static boolean entrar(String login, String senha) {
        return login.equals("admin") && senha.equals("admin");
    }

    /*public static boolean cadastra_usuario(String login, String senha) {
     //        Carro carro = new Carro(marca, modelo, placa, proprietario);
     //        System.out.println(carro);
     //        return Estacionamento.getInstance().addCarro(carro);
     return Estacionamento.getInstance().addCarro(new Carro(marca, modelo, placa, proprietario, cpf, telefone));
     }

     public static Object[][] getArrayEstacionamento() {
     return Estacionamento.getInstance().getArrayRepresentacao();
     }

     public static void baixa(String placa) {
     Estacionamento.getInstance().baixa(placa);
     }

     public static String nVagasRestantes() {
     return Estacionamento.getInstance().getNumVaga() + "/20";
     }*/
    public static void populadados() {
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario("admin", "admin"));
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario("user", "senha"));
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario("user2", "senha"));
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario("user3", "senha"));
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario("user4", "senha"));

        EventoPersistencia.cadastra_item_acervo("O triste fim de Policarpo Quaresma", "Lima Barreto", 1);
        EventoPersistencia.cadastra_item_acervo("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1);
        EventoPersistencia.cadastra_item_acervo("Dom Casmurro", "Machado de Assis", 1);

        EventoPersistencia.cadastra_item_acervo("Vile", "Cannibal Corpse", 2);
        EventoPersistencia.cadastra_item_acervo("Paranoid", "Black Sabbath", 2);
        EventoPersistencia.cadastra_item_acervo("Heaven and Hell", "Black Sabbath", 2);

        EventoPersistencia.cadastra_item_acervo("O Exterminador do Futuro", "James Cameron", 3);
        EventoPersistencia.cadastra_item_acervo("ET - O Extra-Terrestre", "Steven Spielberg", 3);
    }

    public static boolean usuario_existe(String login) {
        return false;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Usuario get_usuario(String login) throws UsuarioNaoEncontradoException {
        return UsuariosSistema.getInstance().get_usuario(login);
    }

    public static ArrayList<Item> get_colecao_usuario(String login) {
        return ColecaoUsuario.getInstance().getColecaoUsuario(login);
    }

    public static HashMap<Integer, Item> get_colecao() {
        return Acervo.getInstance().getAcervo();
    }

    public static void cadastra_usuario(String login, String senha) {
        UsuariosSistema.getInstance().adiciona_usuario(new Usuario(login, senha));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void set_item_colecao_usuario(String login, int id_item) throws ItemNaoEncontradoException {
        ColecaoUsuario.getInstance().insere_item_colecao_usuario(login, id_item);
    }

    public static void remove_item_colecao_usuario(String login, int id_item) {
        ColecaoUsuario.getInstance().remove_item_colecao_usuario(login, id_item);
    }

    public static void cadastra_item_acervo(String nome, String autor, int tipoItem) {
        Iterator<Integer> chaves = Acervo.getInstance().getAcervo().keySet().iterator();

        int id = 0;
        while (chaves.hasNext()) {
            Integer chave = chaves.next();
            id = chave.intValue();
        }

        Acervo.getInstance().adiciona_item(new Item((id + 1), nome, autor, tipoItem));
    }

}
