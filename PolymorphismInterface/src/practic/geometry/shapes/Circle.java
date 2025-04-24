/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// bagian dari package berisi class-class bangun 2D dan 3D
package practic.geometry.shapes;

// Mewarisi CircularShape dan mengimplementasikan interface TwoDimensional.
import practic.geometry.baneteses.CircularShape;
import practic.geometry.interfaces.TwoDimensional;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// Nantinya akan mewarisi method dan atribut non-private CircularShape dan method-method di interface TwoDimensional.
public class Circle extends CircularShape implements TwoDimensional {
    
    // Constructor kosong, harus dibuat karena dilakukan method overloading di bawahnya.
    public Circle() {
        
    }
    
    // Method overloading, menerima argumen radius dan akan mengirimkannya ke atribut radius melalui setRadius. Memiliki akases ke setRadius karena merupakan turunan dari CircularShape.
    public Circle(double radius) {
        setRadius(radius);
    }

    // Melakukan override pada method yang dimiliki abstract class CircularShape, yaitu getArea. Di dalamnya diisikan rumus untuk luas lingkaran: phi * r^2. Method bertipe data double, menyesuakan radius untuk hasil desimal.
    @Override
    public double getArea() {
        double hasil = (double) PI_NUMERATOR/PI_DENOMINATOR * Math.pow(getRadius(), 2);
        return hasil;
    }

    // Melakukan override pada method yang dimiliki abstract class CircularShape, yaitu getPerimeter. Di dalamnya diisikan rumus untuk keliling lingkaran: phi * 2 * r. Method bertipe data double, menyesuakan radius untuk hasil desimal.
    @Override
    public double getPerimeter() {
        double hasil = (double) PI_NUMERATOR/PI_DENOMINATOR * (2 * getRadius());
        return hasil;
    }
    
    // Juga merupakan override, tetapi kepada interface Shape. Isinya disesuaikan dengan jenisnya, yaitu bangun 2D.
    @Override
    public void printInfo() {
        System.out.println("Name\t\t: " + getName());
        System.out.println("Area\t\t: " + getArea());
        System.out.println("Perimeter\t: " + getPerimeter());
    }
    
}
