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

        System.out.println("Mengambil data di array dapat menggunakan array[index]. " + arrayInt[0]);   // Mengambil data di array.

        arrayInt[0] = 12;                                                                               // Mengubah data di array.
        System.out.println("Mengubah data di array dapat menggunakan array[index] = value. " + arrayInt[0]);
        System.out.println("Panjang array: " + arrayInt.length);                                        // Mengambil panjang array.

        // Di dalam Java, tidak ada istilah menghapus data array. Yang ada hanya mengubah isi dari value array. Apabila ingin mengahapus array,
        //maka cara yang dapat dilakukan adalah dengan mengosongkan index array tersebut menggunakan null.



        // Array di dalam array.
        // Contoh penggunaan array di dalam array.
        String[][] members ={
                {"Kadek", "Frama", "Danamastyana"},
                {"Budi", "Laksana"},
                {"Joko", "Anwar"},
        };


        System.out.println("");
        System.out.println("Array di dalam Array");

        String[] member1 = members[0];          // memanggil array di dalam array
        System.out.println(member1[0]);

        System.out.println(members[0][1]);      // memanggil array di dalam array


    }
}