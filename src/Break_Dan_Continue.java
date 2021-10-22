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
                break;                                                                  // break yang digunakan untuk menghentikan perulangan.
            }
        }
        System.out.println("Perulangan berhenti oleh break.");
        System.out.println("");



        // Contoh penggunaan continue di Java.
        for (int counterContinue = 1; counterContinue <= 34; counterContinue++){
            if (counterContinue % 2 == 0){
                continue;                                                                // continue artinya kode yang dibawahnya tidak akan dieksekusi, dan akan dilanjutkan ke perulangan selanjutnya.
            }
            System.out.println("Perulangan ganjil kurang dari 34, yaitu: " + counterContinue);
        }


    }
}