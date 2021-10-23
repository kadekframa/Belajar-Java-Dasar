public class Method_Variable_Argument {
    public static void main(String[] args) {
        // Method variable argument.
        // Kadang kita butuh mengirim data ke method dengan sejumlah data yang tidak pasti.
        // Biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut,
        // Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah yak tentu, bisa nol atau lebih.
        // Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter. Di JavaScript argument ini juga disebut rest parameter.

        // Contoh pennggunaan method variable argument.

        int[] arrayNilai = {80, 80, 94, 84};
        sayCongrats("Kadek Frama", arrayNilai);                                 // memanggil method sayCongrats() yang berisikan parameter String dan array. (tanpa variable argument).

        System.out.println("");
        sayCongratsWithArgument("Kadek Frama", 86, 92, 94,84,94); // memanggil method sayCongratsWithArgument() yang berisikan parameter String dan variable argument. Dengan menggunakan variable argument, kita dapat langsung menginputkan nilai ke dapat parameter tanpa harus menyimpannya terlebih dahulu di variable.


    }

    static void sayCongrats(String name, int[] values){                             // Membuat method parameter yang menggunakan array.
        int total = 0;
        for (var value : values){                                                   // for each di java, digunakan untuk mengambil nilai array satu per satu.
            total += value;                                                         // menjumlahkan seluruh nilai yang tersimpan di parameter values.
        }

        int finalValue = total / values.length;                                     // membagi atau mencari rata-rata nilai keseluruhan.

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus. Semangat !!!");
        }else {
            System.out.println("Maaf" + name + "Anda Belum Lulus, Tetap Semangat!");
        }
    }


    static void sayCongratsWithArgument(String nama, int... valuesArgument){        // Membuat method parameter yang menggunakan variable argument.
        int totalNilai = 0;
        for (var nilai : valuesArgument){                                           // for each di java, yang digunakan untuk mengambil nilai satu persatu dari parameter. dalam hal ini variable argument.
            totalNilai += nilai;                                                    // menjumlahkan seluruh nilai yang tersimpan di dalam variable argument.
        }

        int finalScoreWithArgument = totalNilai / valuesArgument.length;            // mencari rata-rata nilai yang tersimpan di dalam variable argument.

        if (finalScoreWithArgument >= 75){
            System.out.println("Selamat yaa " + nama + ", Anda Lulus.. :). \nDengan Rata-rata Nilai Sebesar: " + finalScoreWithArgument);
        }else {
            System.out.println("Mohon maaf " + nama + ", Terus Mencoba, Pantang Menyerah !!!. \nDengan perolehan rata-rata nilai sebesar: " + finalScoreWithArgument );
        }
    }


}
