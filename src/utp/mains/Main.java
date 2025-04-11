/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.mains;

/**
 *
 * @author HUSEIN SIDHARTA
 */

/*

Husein Sidharta Muhammad - 245150707111040

H  H U   U  SSS  EEEE III N   N 
H  H U   U S     E     I  NN  N 
HHHH U   U  SSS  EEE   I  N N N 
H  H U   U     S E     I  N  NN 
H  H  UUU  SSSS  EEEE III N   N 

*/

import java.util.Scanner;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void printJeda() {
        System.out.println("=============================");
    }
    
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String RESET = "\u001B[0m";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrismaSegitigaSamaKaki pssk = new PrismaSegitigaSamaKaki(10, 13, 12);
        LimasPersegi limasPersegi = new LimasPersegi(10, 12);
        Tabung tabung = new Tabung();
        
        pssk.setNama("Prisma Segitiga Sama Kaki");
        limasPersegi.setNama("Limas Persegi");
        tabung.setNama("Tabung");
        
        // TODO code application logic here
        printJeda();
        
        System.out.println(GREEN + "Kalkulator Bangun Ruang");
        System.out.print(YELLOW + "Nama Lengkap\t: ");
        String nama = scan.nextLine();
        
        System.out.print(GREEN + "NIM\t: ");
        String NIM = scan.nextLine();
        
        printJeda();
        
        System.out.println(pssk.getNama());
        
        printJeda();
        
        System.out.print(YELLOW + "Isikan alas\t: ");
        double inputAlasPSSK = scan.nextDouble();
        pssk.setAlas(inputAlasPSSK);
        System.out.print(GREEN + "Isikan kaki\t: ");
        double inputKakiPSSK = scan.nextDouble();
        pssk.setKaki(inputKakiPSSK);
        System.out.print(YELLOW + "Isikan tinggi\t: ");
        double inputTinggiPSSK = scan.nextDouble();
        pssk.setTinggi(inputTinggiPSSK);
        
        printJeda();
        
        pssk.printInfo();
        
        printJeda();
        
        System.out.println(limasPersegi.getNama());
        
        printJeda();
        
        System.out.print(GREEN + "Isikan sisi\t: ");
        double inputSisiLimasPersegi = scan.nextDouble();
        limasPersegi.setSisi(inputSisiLimasPersegi);
        System.out.print(YELLOW + "Isikan tinggi\t: ");
        double inputTinggiLimasPersegi = scan.nextDouble();
        pssk.setTinggi(inputTinggiLimasPersegi);
        
        printJeda();
        
        limasPersegi.printInfo();
        
        printJeda();
        
        System.out.println(tabung.getNama());
        
        printJeda();
        
        System.out.print(GREEN + "Isikan radius\t: ");
        double inputRadiusTabung = scan.nextDouble();
        tabung.setRadius(inputRadiusTabung);
        System.out.print(YELLOW + "Isikan tinggi\t: ");
        double inputTinggiTabung = scan.nextDouble();
        tabung.setTinggi(inputTinggiTabung);
        
        printJeda();
        
        tabung.printInfo();
        
    }
    
}
