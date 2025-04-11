/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class BangunRuang {
    // atribut
    private String nama;
    private double tinggi;
    
    // constructor
    public BangunRuang() {
        
    }
    
    // method
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    // cek lagi
    public double getLuasPermukaan() {
        return 1;
    }
    
    public double getVolume() {
        return 1;
    }
    
    public void printInfo() {
        System.out.println("Nama\t\t: " + nama + "\n");
        System.out.println("Luas Permukaan\t: " + getLuasPermukaan() + "\n");
        System.out.println("Volume\t\t: " + getVolume());
    }
    
}
