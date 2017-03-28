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
public class TipoHechizo extends Carta{
    
    int lvlalcance;
    String modo;

    public TipoHechizo(String nombre, int costelixir, int lvlvida,int lvlalcance, String modo) {
        super(nombre, costelixir, lvlvida);
        this.lvlalcance = lvlalcance;
        this.modo = modo;
    }
    
    public int getLvlalcance() {
        return lvlalcance;
    }

    public void setLvlalcance(int lvlalcance) {
        this.lvlalcance = lvlalcance;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    @Override
    public String toString() {
        return super.toString()
            + "TipoHechizo{" + "lvlalcance=" + lvlalcance + ", modo=" + modo + System.lineSeparator();
    }
    
    
    
    
}
