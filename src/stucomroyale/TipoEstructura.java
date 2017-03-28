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
public class TipoEstructura extends Carta{
    
    int lvldefensa;

    public TipoEstructura(String nombre, int costelixir, int lvlvida,int lvldefensa) {
        super(nombre, costelixir, lvlvida);
        this.lvldefensa = lvldefensa;
    }

    public int getLvldefensa() {
        return lvldefensa;
    }

    public void setLvldefensa(int lvldefensa) {
        this.lvldefensa = lvldefensa;
    }

    @Override
    public String toString() {
        return super.toString()
            + "TipoEstructura{" + "lvldefensa=" + lvldefensa + System.lineSeparator();
    }

    
    
    
}
