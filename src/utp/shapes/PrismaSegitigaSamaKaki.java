/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas;
    private double kaki;
    
    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi); // perlu super?
    }
    
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public void setKaki(double kaki) {
        this.kaki = kaki;
    }
    
    public double getLuasPermukaan() {
        return (2 * getLuasAlas()) + (getKeliling() * getTinggi());
    }
    
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
    
    public double getTinggiAlas() {
        return Math.sqrt(Math.pow(kaki,2)-Math.pow(alas/2, 2));
    }
    
    public double getLuasAlas() {
        return alas * getTinggiAlas() / 2;
    }
    
    public double getKeliling() {
        return 2 * kaki + alas;
    }
    
}
