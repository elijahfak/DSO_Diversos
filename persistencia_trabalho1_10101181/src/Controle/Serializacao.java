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

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Visual.Alerta;

/**
 *
 * @author elizeu
 */
public class Serializacao {

    //nome dos arquivosd e de serialização
    private static final String usuarios_sistema = "C:\\usuarios_sistema.ser";
    private static final String acervo = "C:\\acervo.ser";
    private static final String colecao = "C:\\colecao.ser";

    public static void salva(Object objeto, String arquivo) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(arquivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objeto);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            //Alerta.mostraString("Diretorio invalido.\n" + e.getMessage());
            System.out.println("Diretorio invalido.\n" + e.getMessage());
        } catch (IOException e) {
            //Alerta.mostraString("Não foi possivel salvar o arquivo..\n" + e.getMessage());
            System.out.println("Não foi possivel salvar o arquivo..\n" + e.getMessage());
        } catch (Exception e) {
            //Alerta.mostraString("Ocorreu um erro inesperado.\n" + e.getMessage());
            System.out.println("Ocorreu um erro inesperado.\n" + e.getMessage());
        }
    }
    /*
     public static Usuario carregaEstacionamento() {
     return (Usuario) carrega(Serializacao.usuario);
     }

     public static void salvaEstacionamento() {
     Estacionamento e = Estacionamento.getInstance();
     salva(e, Serializacao.estacionamento);
     }
     */

    public static Acervo carregaAcervo() {
        return (Acervo) carrega(Serializacao.acervo);
    }

    public static void salvaAcervo() {
        Acervo e = Acervo.getInstance();
        salva(e, Serializacao.acervo);
    }

    public static ColecaoUsuario carregaColecaoUsuario() {
        return (ColecaoUsuario) carrega(Serializacao.colecao);
    }

    public static void salvaColecaoUsuario() {
        ColecaoUsuario e = ColecaoUsuario.getInstance();
        salva(e, Serializacao.colecao);
    }

    public static UsuariosSistema carregaUsuarioSistema() {
        return (UsuariosSistema) carrega(Serializacao.usuarios_sistema);
    }

    public static void salvaUsuarioSistema() {
        UsuariosSistema e = UsuariosSistema.getInstance();
        salva(e, Serializacao.usuarios_sistema);
    }

    //Carrega os arquivos de inicializacao
    public static Object carrega(String arquivo) {
        Object objeto = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(arquivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objeto = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            inicializa(arquivo);
        } catch (Exception e) {
            Alerta.mostraString("Erro ->> " + e.getMessage());
        } finally {
            return objeto;
        }
    }

    private static void inicializa(String arquivo) {
        try {
            new ObjectOutputStream(new FileOutputStream(arquivo));
        } catch (IOException ex) {
            Logger.getLogger(Serializacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
