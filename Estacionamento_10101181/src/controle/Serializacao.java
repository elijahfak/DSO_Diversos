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

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import visual.Alerta;

/**
 *
 * @author elizeu
 */
public class Serializacao {

    //nome dos arquivosd e de serialização
    private static final String estacionamento = "estacionamento.ser";

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
            Alerta.mostraString("Diretorio invalido.\n" + e.getMessage());
        } catch (IOException e) {
            Alerta.mostraString("Não foi possivel salvar o arquivo..\n" + e.getMessage());
            System.out.println("Não foi possivel salvar o arquivo.\n" + e.getMessage());
        } catch (Exception e) {
            Alerta.mostraString("Ocorreu um erro inesperado.\n" + e.getMessage());
        }
    }

    public static Estacionamento carregaEstacionamento() {
        return (Estacionamento) carrega(Serializacao.estacionamento);
    }

    public static void salvaEstacionamento() {
        Estacionamento e = Estacionamento.getInstance();
        salva(e, Serializacao.estacionamento);
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
