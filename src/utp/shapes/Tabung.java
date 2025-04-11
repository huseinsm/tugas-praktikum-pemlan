/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class Tabung extends BangunRuang {
    private double radius;
    final private double PEMBILANG = 22;
    final private double PENYEBUT = 7;
    
    // constructor
    public Tabung() {
        
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }
    
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
    
    public double getLuasAlas() {
        return Math.pow(radius, 2)* PEMBILANG/PENYEBUT ;
    }
    
    public double getKeliling() {
        return 2 * radius * (PEMBILANG/PENYEBUT);
    }
    
}
