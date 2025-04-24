/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// bagian dari package berisi class-class bangun 2D dan 3D
package practic.geometry.shapes;

// Mewarisi Shape dan mengimplementasikan interface TwoDimensional.
import practic.geometry.baneteses.Shape;
import practic.geometry.interfaces.TwoDimensional;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// Berbeda dengan Circle, Square meng-extend Shape yang merupakan nenek moyang tertinggi. Interface TwoDimensional diimplementasikan untuk mengoperasikan luas dan keliling.
public class Square extends Shape implements TwoDimensional {
    
    // menerapkan enkapsulasi, side diinisiasi dan akan diberi nilai melalui setter.
    private double side;
    
    // Constructor kosong. Ini wajib dibuat karena dilakukan pembuatan constructor lain berparameter yang menunjukkan overloading.
    public Square() {
        
    }
    
    // Constructor yang memungkinkan pemberian input atribut side saat instansiasi.
    public Square(double side) {
        this.side = side;
    }
    
    // setter untuk side. Langkah yang digunakan untuk memberi nilai pada atribut set.
    public void setSide(double side) {
        this.side = side;
    }

    // Override kepada method di interface TwoDimensional. Didalamnya disesuaikan dengan bangun datarnya.
    @Override
    public double getArea() {
        double hasil = Math.pow(side, 2);
        return hasil;
    }

    // Override kepada method TwoDimensional untuk mencari keliling. Operasi didalamnya disesuaikan dengan bangun persegi untuk hasilnya akan diberikan.
    @Override
    public double getPerimeter() {
        double hasil = side * 4;
        return hasil;
    }
    
    // Sama dengan yang ada pada class Circle, method ini merupakan override dari interface Shape untuk memberi informasi terkait seluruh hasil operasi yang telah dilakukan.
    @Override
    public void printInfo() {
        System.out.println("Name\t\t: " + getName());
        System.out.println("Area\t\t: " + getArea());
        System.out.println("Perimeter\t: " + getPerimeter());
    }
    
}
