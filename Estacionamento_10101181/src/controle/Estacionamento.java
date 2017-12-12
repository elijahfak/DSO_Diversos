/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import modelo.Carro;
import visual.Alerta;

/**
 *
 * @author infotv
 */
public class Estacionamento implements Serializable {

    private HashMap<String, Carro> ocupantes;
    private int numVaga;
    private static Estacionamento instancia;

    //retorna sempre a mesma instancioa da classe
    public static Estacionamento getInstance() {
        if (instancia == null) {
            Estacionamento p = (Estacionamento) Serializacao.carregaEstacionamento();
            if (p != null) {
                instancia = p;
            } else {
                instancia = new Estacionamento(new HashMap<String, Carro>());
            }
        }
        return instancia;
    }

    public Estacionamento(HashMap<String, Carro> ocupantes) {
        this.ocupantes = ocupantes;
        this.numVaga = 20;
    }

    public HashMap<String, Carro> getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(HashMap<String, Carro> ocupantes) {
        this.ocupantes = ocupantes;
    }

    public int getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(int numVaga) {
        this.numVaga = numVaga;
    }

    public void diminuiNumVaga() {
        this.numVaga = Math.max((this.numVaga - 1), 0);
    }

    public void aumentaNumVaga() {
        this.numVaga = Math.min((this.numVaga + 1), 20);
    }

    public void in(Carro carro) {
        if (this.getNumVaga() > 0) {
            if (!this.getOcupantes().containsKey(carro.getPlaca())) {
                Alerta.mostraString("Carro nao existe. Cadastre-o primeiro");
            } else {
                if (this.getOcupantes().get(carro.getPlaca()).getEstado()) {
                    Alerta.mostraString("Carro ja estacionado");
                } else {
                    this.getOcupantes().get(carro.getPlaca()).setEstado(true);
                    this.diminuiNumVaga();
                }
            }
        } else {
            Alerta.mostraString("Limite atingido. Volte outro dia");
        }
    }

    public void out(Carro carro) {
        this.getOcupantes().get(carro.getPlaca()).setEstado(false);
        this.aumentaNumVaga();
    }

    public boolean addCarro(Carro carro) {
        if (!this.getOcupantes().containsKey(carro.getPlaca())) {
            this.getOcupantes().put(carro.getPlaca(), carro);
        } else {
            Alerta.mostraString("Carro ja existe");
            return false;
        }

        Serializacao.salvaEstacionamento();
        return true;
    }

    public void baixa(String placa) {
        if (!this.getOcupantes().containsKey(placa)) {
            Alerta.mostraString("Carro nao existe. Cadastre-o primeiro");
        } else {
            if (!this.getOcupantes().get(placa).getEstado()) {
                this.in(this.getOcupantes().get(placa));
            } else {
                this.out(this.getOcupantes().get(placa));
            }

            Serializacao.salvaEstacionamento();
        }
    }

    public Object[][] getArrayRepresentacao() {
        HashMap<Integer, String> marca = new HashMap<Integer, String>();
        marca.put(0, "Ford");
        marca.put(1, "Fiat");
        marca.put(2, "GM");
        marca.put(3, "Volkswagen");

        Estacionamento e = Estacionamento.getInstance();

        Object[][] retorno = new Object[e.getOcupantes().size()][5];

        int i = -1;
        Set<String> chaves = e.getOcupantes().keySet();
        for (String chave : chaves) {
            i++;
            if (chave != null) {
                retorno[i][0] = e.getOcupantes().get(chave).getEstado() ? "In" : "Off";
                retorno[i][1] = e.getOcupantes().get(chave).getPlaca();
                retorno[i][2] = marca.get(e.getOcupantes().get(chave).getMarca());
                retorno[i][3] = e.getOcupantes().get(chave).getModelo();
                retorno[i][4] = e.getOcupantes().get(chave).getProprietario();
            }
        }

        return retorno;
    }
}
