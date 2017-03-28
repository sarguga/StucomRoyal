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
public class TipoTropa extends Carta{
    
    int lvlataque;

    public TipoTropa(String nombre, int costelixir, int lvlvida,int lvlataque) {
        super(nombre, costelixir, lvlvida);
        this.lvlataque = lvlataque;
    }
    
    public int getLvlataque() {
        return lvlataque;
    }

    public void setLvlataque(int lvlataque) {
        this.lvlataque = lvlataque;
    }

    @Override
    public String toString() {
        return super.toString()
            + "TipoTropa{" + "lvlataque=" + lvlataque + System.lineSeparator();
    }
    
    
    
}
