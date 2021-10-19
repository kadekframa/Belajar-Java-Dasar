public class Variable {
    public static void main(String[] args) {
        // Variable di Java
        // Variable adalah tempat untuk menyimpan data.
        // Java adalah bahasa static type (static languange) berbeda dengan javascript yang dinamyc type (dinamyc language), sehingga sebuah variable hanya bisa
        //digunakan untuk menyimpan data yang sama, tidak bisa berubah-ubah tipe data seperti pada bahasa pemrograman PHP atau JavaScript.
        // Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variablenya.
        // Nama variable tidak boleh mengandung whitespace (spasi, enter, tab) dan tidak boleh seluruhnya number.

        // Contoh penggunaan variable pada Java.
        String name;
        name = "Kadek Frama Danamastyana";

        int age = 21;
        String address = "Bali, Indonesia";

        System.out.println("Perkenalkan Nama saya " + name + ", umur Saya " + age + " tahun, Saya berasal dari " + address + ".");



        // Kata kunci var.
        // Sejak versi Java 10, Java mendukun pembuatan variabel dengan kata kunci var, sehinga kita tidak perlu menyebutkan tipe datanya.
        // Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisiasi value/nilai dari variable tersebut secara langsung.

        // Contoh penggunaan kata kunci var.
//        var names;    //error
//        names = "kadek frama";
        var umur = 21;
        var alamat = "Bali";

        System.out.println("Umur nya Kadek  : " + umur + " tahun.");
        System.out.println("Alamat          : " + alamat + ", Indonesia.");


        // Kata Kunci final.
        // secara default, variable di Java bisa diubah-ubah nilainya.
        // Jika kita ingin membuat sebuah variable yang datanya permanen atau tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci "final".
        // Istilah variabel seperti ini, banyak juga yang menyebutnya constan.

        // Contoh penggunaan kata kunci final (dalam bahasa pemrograman JavaScript disebut dengan tipe data constan).
        final String namaKadek = "Kadek Frama Danamastyana";    // Contoh penggunaan tipe data final pada Java.
        var umurKadek = 21;
        var alamatKadek = "Bali, Indonesia";

//        namaKadek = "Kadek Frama";   //error

        System.out.println("");
        System.out.println("Tipe data final pada Java");
        System.out.println(name);
        System.out.println(umurKadek);
        System.out.println(alamatKadek);

    }
}