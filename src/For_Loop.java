public class For_Loop {
    public static void main(String[] args) {
        // For loop di Java.
        // For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan.
        // Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi.

        // Sintak perulangan for
//        for(initial statement; kondisi; post statement){
//            //block perulangan
//        };

        /*
            - Init statement akan dieksekusi hanya sekali diawal sebelum perulangan.
            - Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, namun jika false perulangan akan berhenti.
            - Post stetement akan dieksekusi setiap kali diakhir perulangan.
            - Init statement, Kondisi dan Post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true.
        */


        // Contoh penggunaan perulangan for di Java.
        for (var i = -1; i <= 24; i++){
            i = i + 1;
            System.out.println(i);
        }


    }
}
