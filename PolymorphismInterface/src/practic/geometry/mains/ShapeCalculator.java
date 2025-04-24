/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practic.geometry.mains;

/*

Husein Sidharta Muhammad - 245150707111040

H  H U   U  SSS  EEEE III N   N 
H  H U   U S     E     I  NN  N 
HHHH U   U  SSS  EEE   I  N N N 
H  H U   U     S E     I  N  NN 
H  H  UUU  SSSS  EEEE III N   N 

*/

// karena main, yang artinya akan memanggil hampir seluruh class, abstract class, dan interface, import dilakukan dengan *.
import java.util.Scanner;
import practic.geometry.baneteses.*;
import practic.geometry.interfaces.*;
import practic.geometry.shapes.*;

public class ShapeCalculator {

    /**
     * @param args the command line arguments
     */
    
    // method untuk print jeda. Bertipe static karena main static.
    public static void lineSpace() {
        System.out.println  ("============================");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Untuk menerima input dari user, dilakukan instansiasi untuk Scanner.
        Scanner scan = new Scanner(System.in);
        
        // pemberian warna di prompt.
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        
        // Instansiasi dibawah menerapkan polymorphism dimana referensinya dari interface (CircularShape untuk circle, Shape untuk square, dst), sementara object aktualnya berupa class seperti Circle, Square, dll. Hal tsb berarti, object-object  hanya akan memiliki hak akses ke method-method yang ada di referensi (ruas kiri). pemanggilan constructor akan memungkinkan penginputan argumen.
        
        // 2D
        // A. Circle
        // circle memiliki hak akses ke method yang ada di CircularShape, bukan Circle.
        CircularShape circle = new Circle(7);
        circle.setName("Circle");
        
        // B. Square
        // circle memiliki hak akses ke method yang ada di Shape, bukan Square.
        Shape square = new Square(10);
        square.setName("Square");
        
        // 3D
        // circle memiliki hak akses ke method yang ada di Shape, bukan Cube.
        // A. Cube
        Shape cube = new Cube(10, 10);
        cube.setName("Cube");
        
        // B. Sphere
        // Sphere memiliki hak akses ke method yang ada di CircularShape, bukan Sphere.

        CircularShape sphere = new Sphere(21, 10);
        sphere.setName("Sphere");
        
        // Double 3D
        // Berlaku hal yang sama. Terjadi variasi.
        ThreeDimensional cubePoli = new Cube(10, 10);
        Weightable spherePoli = new Sphere(21, 10);
                
        lineSpace();
        
        System.out.println(GREEN + "Shape Calculator");
        System.out.println(YELLOW + "Husein Sidharta Muhammad");
        System.out.println(GREEN + "245150707111040");
        
        lineSpace();
        
        System.out.println(YELLOW + "2D Circle");
        
        lineSpace();
        
        // Sistem pengolahan input, awalnya berupa string. Setelah dicek bukan merupakan - (dash), input akan diubah ke tipe data double. Akhirnya, input tersebut menjadi argumen untuk pemanggilan fungsi setter.
        
        System.out.print(GREEN + "Enter radius (fill \"-\" for default value): ");
        String inputRadius = scan.nextLine();
        double radius = 0;
        if(!inputRadius.equals("-")) { // NOTE kedepan: harusnya ada exception handling untuk input bukan angka atau bahkan tanpa input.
            radius = Double.parseDouble(inputRadius);
            circle.setRadius(radius);
        }
        
        lineSpace();
        
        // dilakukan pencetakan informasi melalui pemanggilan method printInfo yang berasal dari interface Shape dan telah disesuaikan di tiap-tiap class package shapes.
        circle.printInfo();
        
        lineSpace();
        
        System.out.println(YELLOW + "2D Square");
        
        lineSpace();
        
        // Mekanisme yang sama dalam pengolahan data input, sebelum dikirim sebagai argumen.
        System.out.print(GREEN + "Enter side (fill \"-\" for default value): ");
        String inputSide = scan.nextLine();
        double side = 0;
        if(!inputRadius.equals("-")) {
            side = Double.parseDouble(inputRadius);
            ((Square) square).setSide(side);
        }
        
        lineSpace();
        
        // Langkah yang sama untuk pencetakan informasi, yaitu melalui method yang berasal dari Shape.
        square.printInfo();
        
        lineSpace();
        
        System.out.println(YELLOW + "3D Weightable Cube");
        
        lineSpace();
        
        // Mekanisme yang sama dalam pengolahan data input, sebelum dikirim sebagai argumen.
        System.out.print(GREEN + "Enter edge (fill \"-\" for default value): ");
        String inputCbEdge = scan.nextLine();
        double edge = 0;
        if(!inputCbEdge.equals("-")) {
            edge = Double.parseDouble(inputCbEdge);
            ((Cube) cube).setEdge(edge);
        }
        
        // Mekanisme yang sama dalam pengolahan data input, sebelum dikirim sebagai argumen.
        System.out.print(YELLOW + "Enter mass (fill \"-\" for default value): ");
        String inputCbMass = scan.nextLine();
        double cbMass = 0;
        if(!inputCbMass.equals("-")) {
            cbMass = Double.parseDouble(inputCbMass);
            ((Cube)cube).setMass(cbMass);
        }
        
        lineSpace();
        
        // Langkah yang sama untuk pencetakan informasi, yaitu melalui method yang berasal dari Shape.
        cube.printInfo();
        
        lineSpace();
        
        System.out.println(GREEN + "3D Weightable Sphere");
        
        lineSpace();
        
        // Mekanisme yang sama dalam pengolahan data input, sebelum dikirim sebagai argumen.
        System.out.print(GREEN + "Enter radius (fill \"-\" for default value): ");
        String inputSpRadius = scan.nextLine();
        double spRadius = 0;
        if(!inputSpRadius.equals("-")) {
            spRadius = Double.parseDouble(inputSpRadius);
            sphere.setRadius(spRadius);
        }
        
        // Mekanisme yang sama dalam pengolahan data input, sebelum dikirim sebagai argumen.
        System.out.print(YELLOW + "Enter mass (fill \"-\" for default value): ");
        String inputSpMass = scan.nextLine();
        double spMass = 0;
        if(!inputSpMass.equals("-")) {
            spMass = Double.parseDouble(inputSpMass);
            ((Sphere) sphere).setMass(spMass);
        }
        
        lineSpace();
        
        // Langkah yang sama untuk pencetakan informasi, yaitu melalui method yang berasal dari Shape.
        sphere.printInfo();
        
        lineSpace();
        
        
        // Disini, mekanisme sedikit berbeda. Akan dilakukan casting objek untuk pengisian input oleh user dapat diproses.
        System.out.println(GREEN + "Volume of Cube and Sphere");
        System.out.println(YELLOW + "POLIMORPHISM: INTERFACE");
        
        lineSpace();
        
        // Terdapat perbedaan. objek di casting ke tipe class Cube untuk bisa melakukan setter. Hal tersebut karena hak akses objek terbatas (hanya ke method yang menjadi referensi yaitu ThreeDimensional)
        System.out.print(GREEN + "Enter edge (fill \"-\" for default value): ");
        String inputCbPoliEdge = scan.nextLine();
        double cbPoliEdge = 0;
        if(!inputCbPoliEdge.equals("-")) {
            cbPoliEdge = Double.parseDouble(inputCbPoliEdge);
            ((Cube) cubePoli).setEdge(cbPoliEdge);
        }
        
        // Hal serupa terjadi. Untuk setRadius tidak bisa karena method tersebut tidak ada di interface referensi. Sehingga, di casting ke class yang menyediakan method tsb.
        System.out.print(YELLOW + "Enter radius (fill \"-\" for default value): ");
        String inputSpPoliRadius = scan.nextLine();
        double spPoliRadius = 0;
        if(!inputSpPoliRadius.equals("-")) {
            spPoliRadius = Double.parseDouble(inputSpPoliRadius);
            ((Sphere) spherePoli).setRadius(spPoliRadius);
        }
        
        // Di sini, penginputan nilai akan dilakukan sekaligus ke bangun ruang kubus dan bola. Input oleh user akan dimasukkan ke massa dari kedua bangun.
        System.out.print(GREEN + "Enter mass (fill \"-\" for default value): ");
        String inputCbSpPoliMass = scan.nextLine();
        double cbSpPoliMass = 0;
        if(!inputCbSpPoliMass.equals("-")) {
            cbSpPoliMass = Double.parseDouble(inputCbSpPoliMass);
            ((Cube) cubePoli).setMass(cbSpPoliMass);
            ((Sphere) spherePoli).setMass(cbSpPoliMass);
        }
        
        lineSpace();
        
        // Print dilakukan secara manual (tidak melalui method) karena merupakan campuran dari beberapa bangun (tidak dalam satu class).-
        System.out.println(YELLOW + "Cube's volume\t: " + cubePoli.getVolume());
        System.out.println(GREEN + "Sphere's volume\t: " + ((Sphere) spherePoli).getVolume());
        System.out.println(YELLOW + "Weight\t\t: " + spherePoli.getWeight());
        
    }
    
}
