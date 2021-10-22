public class Method_Parameter {
    public static void main(String[] args) {
        // Method Parameter
        // Kita bisa mengirimkan informasi ke method yang kita panggil.
        // Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat.
        // Cara membua parameter sama seperti cara membuat variabel.
        // Parameter ditempatkan di dalam kurung () di deklarasi method.
        // Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma.

        // Contoh penggunaan method parameter di Java.
        sayHelloWorld("Kadek", "Frama");                // Memanggil method dengan berisikan value dari parameternya. Tetap Semangat Berlatih Java!!!
    }

    static void sayHelloWorld(String firstName, String middleName){         // Membuat method atau function sayHelloWorld() berisikan parameter firstName dan middleName.
        System.out.println("Hello " + firstName + " " + middleName);
    }

}
