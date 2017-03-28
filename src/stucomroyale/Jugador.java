/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyale;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sara
 */
public class Jugador implements Comparable<Jugador>{
    
    String user;
    String pass;
    int numtrofeos;
    List<Carta> mazocartas = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(String user, String pass, int numtrofeos) {
        this.user = user;
        this.pass = pass;
        this.numtrofeos = numtrofeos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNumtrofeos() {
        return numtrofeos;
    }

    public void setNumtrofeos(int numtrofeos) {
        this.numtrofeos = numtrofeos;
    }

    public List<Carta> getMazocartas() {
        return mazocartas;
    }

    public void setMazocartas(List<Carta> mazocartas) {
        this.mazocartas = mazocartas;
    }

    @Override
    public int compareTo(Jugador j) {
        if(numtrofeos > j.getNumtrofeos()){
            return -1;
        }else if(numtrofeos < j.getNumtrofeos()){
            return 1;
        }else {
            return 0;
        }
    }   
}
