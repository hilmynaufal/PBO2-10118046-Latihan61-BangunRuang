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
public abstract class BangunRuang {
    protected int jariJari;
    protected int tinggi;

    public BangunRuang(int jariJari) {
        this.jariJari = jariJari;
    }

    public BangunRuang(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public int getJariJari() {
        return jariJari;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    
    
    public abstract double hitungVolume();
}
