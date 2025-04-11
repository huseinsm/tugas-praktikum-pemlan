/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class LimasPersegi extends BangunRuang {
    private double sisi;
    
    // contructor
    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }
    
    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3;
    }
    
    public double getTinggiSegitiga() {
        return Math.sqrt(Math.pow(getTinggi(),2) + Math.pow(sisi/2, 2));
    }
    
    public double getLuasSegitiga() {
        return getTinggiSegitiga() * sisi / 2;
    }
    
    public double getLuasAlas() {
        return sisi * sisi;
    }
    
}
