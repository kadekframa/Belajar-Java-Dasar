public class Method_Return_Value {
    public static void main(String[] args) {
        // Method return value di Java.
        // Secara default, method itu tidak menghasilkan apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai.
        // Agar method bisa mengembalikan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan.
        // Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.
        // Di Java, kita hanya bisa menghasilkan 1 data di sebuat method, tidak lebih dari satu.

        // Contoh penggunaan method return value di Java.
        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println("Contoh penggunaan method return value di Java");
        System.out.println("Hasil penjumlahan method sum = " + sum(200, 340));              // memanggil method sum() dengan dua value parameter.

        System.out.println("");
        System.out.println("Hasil Perhitungan dari method hitung adalah : " + hitung(100, "/", 25));    // memanggil method hitung() yang berisikan tidak value parameter.

    }

    static int sum(int value1, int value2){                             // membuat method sum() yang berisikan dua parameter.
        var total = value1 + value2;
        return total;
    }

    static int hitung(int valueSatu, String operasi, int valueDua){     // membuat method hitung() yang berisikan tiga parameter.
        switch (operasi){
            case "+":
                return valueSatu + valueDua;
            case "-":
                return valueSatu - valueDua;
            case "*":
                return valueSatu * valueDua;
            case "/":
                return valueSatu / valueDua;
            case "%":
                return valueSatu % valueDua;
            default:
                return 0;
        }

    }

}