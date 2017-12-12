/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import modelo.Carro;

/**
 *
 * @author elizeu
 */
public class Evento {

    public static boolean entrar(String login, String senha) {
        return login.equals("admin") && senha.equals("admin");
    }

    public static boolean cadastra_vaga(int marca, String modelo, String placa, String proprietario) {
//        Carro carro = new Carro(marca, modelo, placa, proprietario);
//        System.out.println(carro);
//        return Estacionamento.getInstance().addCarro(carro);
        return Estacionamento.getInstance().addCarro(new Carro(marca, modelo, placa, proprietario));
    }

    public static Object[][] getArrayEstacionamento() {
        return Estacionamento.getInstance().getArrayRepresentacao();
    }

    public static void baixa(String placa) {
        Estacionamento.getInstance().baixa(placa);
    }

    public static String nVagasRestantes() {
        return Estacionamento.getInstance().getNumVaga()+ "/20";
    }
}
