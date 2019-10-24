/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan61.bangunruang;


/**
 *
 * @author ASUS
 */
public class Bola extends BangunRuang{

    public Bola(int jariJari) {
        super(jariJari);
    }

    @Override
    public double hitungVolume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return 4*(Math.PI*jariJari*jariJari*jariJari)/3;
    }
    
}
