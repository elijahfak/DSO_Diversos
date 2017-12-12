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
import Modelo.*;
import Controle.*;
import Controle.UsuariosSistema;
import Exception.UsuarioNaoEncontradoException;

/**
 *
 * @author elizeu
 */
public class Evento {

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
        
    }

    public static boolean usuario_existe(String login) {
        return false;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Usuario get_usuario(String login) throws UsuarioNaoEncontradoException{
        return UsuariosSistema.getInstance().get_usuario(login);
    }

    public static void cadastra_usuario(String login, String senha) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
