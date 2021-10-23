import jdk.jshell.EvalException;

import javax.print.attribute.standard.Finishings;

public class Recursive_Method {
    public static void main(String[] args) {
        // Recursive Method di Java.
        // Recursive Method adalah kemampuan method memanggil method dirinya sendiri.
        // Kadang memang ada banyak problem, yang lebih mudah diselesaiikan menggunakan recursive method, seperti contohnya kasus factorial.

        // Contoh penggunaan recursive method di Java.
        System.out.println(factorial(4));                    // memanggil method factorial().
        System.out.println("");
        System.out.println(factorialRecursiveMethod(5));    // memanggil method factoralRecursiveMethod().

    }

    static int factorial(int value){                                        // Membuat method dengan perulangan for.
        var result = 1;
        for(int i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }

    static int factorialRecursiveMethod(int values){                        // Membuat method dengan memanggil method nya sendiri (recursive method).
        if(values == 1){
            return 1;
        }else {
            return values * factorialRecursiveMethod(values - 1);
        }
    }


    // NB: Hati-hati dalam penggunaan recursive method ini, karena apabila terlalu banyak melakukan recursive akan menyebabkan error stackoverflow pada komputer. Tidak ada yang tau pasti berapa banyak recursive method dapat dilakukan, itu tergantung dari daya penyimpanan di komputer kita.

}
