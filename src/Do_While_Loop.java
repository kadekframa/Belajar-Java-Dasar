public class Do_While_Loop {
    public static void main(String[] args) {
        // Do while loop di Java
        // do while loop adalah perulangan yang mirip dengan while
        // perbedaannya hanya pada pengecekan kondisi.
        // Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan.
        // Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true.

        // Contoh penggunaan do while loop di Java.
        var test = 1;
        do {
            System.out.println("Berlatih perulangan do while: " + test);
            test++;
        }while (test <= 10);

    }
}
