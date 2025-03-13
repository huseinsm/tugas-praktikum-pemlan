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
import praktic.geometry.shapes.circle;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        
        // instansiasi class circle
        circle circle = new circle();
       
         // mulai pembuatan output sesuai dengan deskripsi soal
         
         // pemanggilan method di class yang sama dapat dilakukan secara langsung
         printGaris();
         
         // agar tata letak teks rapi, tambahkan \t yang berarti tab. NOTE: pengaturan warna bisa dilakukan di dalam print().
         System.out.print(GREEN + "Nama\t: ");
         String nama = scan.nextLine();
         
         // untuk input, bisa memanfaatkan method next atau nextLine (untuk String).
         System.out.print(YELLOW + "NIM\t: ");
         String NIM = scan.nextLine();
         
         printGaris();
         
         System.out.println(GREEN + "CIRCLE");
         
         printGaris();
         
         System.out.print(YELLOW + "Isikan ID\t: ");
         // input int dapat memanfaatkan nextInt(). input ditampung dalam sebuah variabel untuk nantinya dimasukkan ke method setId().
         int id = scan.nextInt();
         circle.setId(id);
         
         System.out.print(GREEN + "Isikan Radius\t: ");
         // input double dapat memanfaatkan nextDouble(). input ditampung dalam sebuah variabel untuk nantinya dimasukkan ke method setRad().
         double radius = scan.nextDouble();
         circle.setRad(radius);
         
         printGaris();
         
         circle.printDeskripsi();
         
         printGaris();
         
         // cek cetakan teks rapi, sesuai soal, dan aestetik dengan pengaturan warna
    }
    
}
