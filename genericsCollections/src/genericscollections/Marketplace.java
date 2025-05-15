/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericscollections;

import java.util.*;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// Product.java
class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    // encapsulasi, memastikan proteksi
    private int id;
    private String name;
    private T category; // category akan implement Comparable<T>
    private double price;

    // Constructor
    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter, untuk pengambilan value, sebagai manifestasi encapsulation.
    // Tipe data menyesuaikan atributnya.
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public T getCategory() {
        return category;
    }
    
    public double getPrice() {
        return price;
    }

    // override method yang dimiliki interface Comparable, disesuaikan dengan project.
    // Membandingkan 2 Produk berdasarkan kategori.
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }

    // Menampilkan info produk
    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Category: " + category + ", Price: Rp" + price;
    }
}


class ProductManager {
    // encapsulation
    private List<Product<?>> products = new ArrayList<>();
    private Set<String> categories = new HashSet<>();
    private Queue<Product<?>> processedQueue = new LinkedList<>();

    // Menambah produk ke list, sementara kategori ke Set
    // category sebuah produk ditambah toString() agar dapat masuk ke set categories yang bertipe String
    public void addProduct(Product<?> product) {
        products.add(product);
        categories.add(product.getCategory().toString());
    }

    // Menghapus produk berdasarkan ID
    // cara efektif remove anggota sebuah list
    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Mencari produk berdasarkan nama dan kategori.
    public List<Product<?>> search(String name, String category) {
        // untuk menampung hasil search.
        List<Product<?>> result = new ArrayList<>();
        // pengulangan, untuk mencari produk dengan for each untuk anggota2 di list products
        for (Product<?> p : products) {
            if (p.getName().equalsIgnoreCase(name) &&
                p.getCategory().toString().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }
        return result;
    }

    // Menampilkan semua produk, dimana diurutkan berdasarkan kategori. menggunakan fungsi yang sudah disediakan oleh list collection.
    public void displayProducts() {
        // p1 dan p2 merepresentasikan elemen di dalam produk, selanjutnya akan dibuat rumus sort.
        products.sort((p1, p2) -> p1.getCategory().toString().compareTo(p2.getCategory().toString()));
        for (Product<?> p : products) {
            System.out.println(p);
        }
    }

    // Menampilkan semua kategori.
    public void displayCategories() {
        for (String c : categories) {
            System.out.println(c);
        }
    }

    // masuk ke pemrosesan produk.
    // Tambah ke antrian proses.
    public void addToProcessedQueue(Product<?> product) {
        processedQueue.add(product);
    }

    // Tampilkan produk yang telah diproses
    public void displayProcessedQueue() {
        for (Product<?> p : processedQueue) {
            System.out.println(p);
        }
    }
}


public class Marketplace {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Mulai Buat objek Product.
        Product<String> p1 = new Product<>(1, "Jacket", "Fashion", 325000);
        Product<String> p2 = new Product<>(2, "Shoe", "Fashion", 175000);
        Product<String> p3 = new Product<>(3, "Desk", "Furniture", 400000);
        Product<String> p4 = new Product<>(4, "Chair", "Furniture", 300000);

        // Menambahkan produk-produk di atas ke bagian list (nantinya masuk ke products dan categories).
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);

        // Tampilkan semua produk.
        System.out.println("All Products:");
        manager.displayProducts();

        // Implementasi menghapus produk, kemudian menampilkan kembali daftar produk.
        System.out.println("\nRemoving product by Id:");
        manager.removeProduct(2);
        manager.displayProducts();

        // Menampilkan kategori apa saja yang ada.
        System.out.println("\nCategories available:");
        manager.displayCategories();

        // Cari produk.
        System.out.println("\nSearching for Chair in Furniture:");
        for (Product<?> p : manager.search("Chair", "Furniture")) {
            System.out.println(p);
        }

        // Menambahkan beberapa produk untuk diproses (ke queue).
        System.out.println("\nAdding some products to processed queue:");
        manager.addToProcessedQueue(p1);
        manager.addToProcessedQueue(p3);
        manager.displayProcessedQueue();
        
    }
}



