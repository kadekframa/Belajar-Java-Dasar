public class Break_Dan_Continue {
    public static void main(String[] args) {
        // Break dan Continue di Java.
        // Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch.
        // Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
        // Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.

        // Contoh penggunaan break di Java.
        var counter = 1;

        while (true){
            System.out.println("Perulangan: " + counter);
            counter++;

            if (counter > 10){
                break;              // break yang digunakan untuk menghentikan perulangan.
            }


        }
    }
}
