import java.util.Date;

public class Expression_Statement_Block {
    public static void main(String[] args) {
        // Expression di Java.
        // Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value.
        // Exppression adalah core component dari statement.

        //Contoh Expression.
        int value;      // expression
        value = 10;     // expression

        System.out.println(value = 100);    //statement.



        // Statement di Java.
        // Statement bisa dibilang adalah kalimat legkap dalam bahasa.
        // Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma.
        // Ada beberapa jenis statement:
        /*
            - assignment expression
            - penggunaan ++ dan --
            - Method invocation
            - Object creation expression.
        */
        // Contoh statement.
        double aValue = 8933.234;   // assignment statement.

        aValue++;                   // increment statement.

        System.out.println("Hello World!, Tetap Semangat!");    // method invocation statement.

        Date date = new Date();     // onject creation statement.



        // Block di Java.
        // Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
        // Block diawali dan diakhiri dengan kurung kurawal {}.

        // Contoh penggunaan block di Java.
        {
        System.out.println("");
        System.out.println("Block biasanya digunakan untuk grouping kode agar lebih rapi.");
        }


    }
}
