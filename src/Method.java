public class Method {
    public static void main(String[] args) {
        // Method atau Function.
        // Method adalah block kode program yang akan berjalan saat kita panggil.
        // Sebelumnya kita sudah menggunaakan method println() untuk menampilkan tulisan di console.
        // Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block.
        // Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ().
        // Di bahasa pemrograman lain, method juga disebut dengan function.

        // Contoh penggunaan method
        sayHelloWorld();

    }

    static void sayHelloWorld(){                                // Membuat method bernama sayHelloWorld();
        System.out.println("Hello World 1, Tetap Semangat!");
        System.out.println("Hello World 2, Tetap Semangat!");
        System.out.println("Hello World 3, Tetap Semangat!");
    }

}
