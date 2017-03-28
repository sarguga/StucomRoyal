/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyale;

/**
 *
 * @author Sara
 */
public class Carta {
    
    String nombre;
    int costelixir;
    int lvlvida;

    public Carta() {
    }

    public Carta(String nombre, int costelixir, int lvlvida) {
        this.nombre = nombre;
        this.costelixir = costelixir;
        this.lvlvida = lvlvida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCostelixir() {
        return costelixir;
    }

    public void setCostelixir(int costelixir) {
        this.costelixir = costelixir;
    }
    
    public int getLvlvida() {
        return lvlvida;
    }

    public void setLvlvida(int lvlvida) {
        this.lvlvida = lvlvida;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", costelixir=" + costelixir + ", lvlvida=" + lvlvida + '}';
    }
    
    
}
