import java.util.Arrays;

public class Tipe_Data_Array {
    public static void main(String[] args) {
        // Tipe Data Array Java.
        // Array adalah tipe data yang berisikan kumpulan tipe data yang sama.
        // Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.

        // Contoh penggunaan Array.
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Kadek";
        arrayString[1] = "Frama";
        arrayString[2] = "Danamastyana";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);


        arrayString[0] = "Kadek Frama";     // merubah data array.

        System.out.println("");
        System.out.println(arrayString[0]);


        // Array Initializer. Ada beberapa cara untuk menginisialisasi kode array di Java.
        // Contoh 1.
        String[] arrayStringSepertiContohDiatas = new String[3];
        arrayStringSepertiContohDiatas[0] = "Kadek";
        arrayStringSepertiContohDiatas[1] = "Frama";
        arrayStringSepertiContohDiatas[2] = "Danamastyana";

        // Contoh 2.
        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50, 60
        };

        // Contoh 3.
        long[] arrayLong = {
                24, 34, 44, 54, 64, 74, 84, 94, 104
        };

        System.out.println(arrayInt.length);

    }
}