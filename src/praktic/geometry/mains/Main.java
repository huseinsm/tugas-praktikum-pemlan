/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// package relatif mulai folder src
package praktic.geometry.mains;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// file saling import karena berbeda package
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;
import java.util.Scanner;
// agar standar penulisan ikut internasional
import java.util.Locale;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    // deklarasi method dan atribut static yang menandakan bahwa mereka dapat diakses oleh kelas lain tanpa instansiasi object. static tanpa access modifier berarti private, sehingga perlu dibuat public agar class lain berbeda package dapat mengakses
    // method dan atribut static diinisiasi diluar method main, di dalam class mains.
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String RESET = "\u001B[0m";
    public static void printGaris() {
        System.out.println("======================");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // menstandarkan bahasa ke internasional (desimal pakai titik, bukan koma)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        // instansiasi class circle dan rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(2, 5.4, 3.5);
       
         // mulai pembuatan output sesuai dengan deskripsi soal
         // pemanggilan method di class yang sama dapat dilakukan secara langsung
         printGaris();
         
         // agar tata letak teks rapi, tambahkan \t yang berarti tab. NOTE: pengaturan warna bisa dilakukan di dalam print().
         System.out.print(GREEN + "Nama\t: ");
         String nama = scan.nextLine();
         
         // untuk input, bisa memanfaatkan method next atau nextLine (untuk String).
         System.out.print(YELLOW + "NIM\t: ");
         String NIM = scan.nextLine();
         
         printGaris(); // jeda
         
         // --------------- CIRCLE
         
         System.out.println(GREEN + "CIRCLE");
         
         printGaris();  // jeda
         
         System.out.print(YELLOW + "Isikan ID\t: ");
         // input int dapat memanfaatkan nextInt(). input ditampung dalam sebuah variabel untuk nantinya dimasukkan ke method setId().
         int idCirc = scan.nextInt();
         circle.setId(idCirc);
         
         System.out.print(GREEN + "Isikan Radius\t: ");
         // input double dapat memanfaatkan nextDouble(). input ditampung dalam sebuah variabel untuk nantinya dimasukkan ke method setRad().
         double radius = scan.nextDouble();
         circle.setRad(radius);
         
         printGaris();  // jeda
         
         
         circle.printDeskripsi();
         
         printGaris(); // jeda
          
         // --------------- RECTANGLE
         
         System.out.println(YELLOW + "RECTANGLE");
         
         printGaris();  // jeda
         
         System.out.print(GREEN + "Isikan ID (isikan 0 untuk nilai sesuai instansiasi)\t: ");
         // membuat pengkondisian untuk menentukan nilai dari atribut apakah ada perubahan
         int idRect = scan.nextInt();
         if(idRect != 0) {
             rectangle.setId(idRect);
         }
         
         System.out.print(YELLOW + "Isikan panjang (isikan 0 untuk nilai sesuai instansiasi)\t: ");
         double panjang = scan.nextDouble();
         if(panjang != 0) {
            rectangle.setPanjang(panjang);
         }
         
         System.out.print(GREEN + "Isikan lebar (isikan 0 untuk nilai sesuai instansiasi)\t: ");
         double lebar = scan.nextDouble();
         if(lebar != 0) {
             rectangle.setLebar(lebar);
         }
         
         printGaris();  // jeda
         
         rectangle.printDeskripsi();
         
         printGaris();  // jeda
         
         // cek cetakan teks rapi, sesuai soal, dan aestetik dengan pengaturan warna
    }
    
}