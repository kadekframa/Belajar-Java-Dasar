public class For_Each {
    public static void main(String[] args) {
        // For each di Java
        // Kadang kala kita biasa mengakses data array menggunakan perulangan.
        // Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat.
        // Namun untungnya, di java terdapat perulangan for each yang bisa digunakan untuk mengakses seluruh data di array secara otomatis.

        // Contoh penggunaan for each di Java.

        // Pemanggilan array dengan perulangan tanpa menggunakan for each.
        String[] array = {
                "Kadek", "Frama", "Danamastyana", "Programmer", "Zaman", "Now"
        };
        System.out.println("");
        System.out.println("perulangan array tanpa for each");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



        // Contoh penggunaan perulangan dengan for each.
        String[] arrayForEach = {
                "Kadek", "Frama", "Danamastyana", "Programmer", "Tetap", "Semangat"
        };

        System.out.println("");
        System.out.println("perulangan array dengan menggunakan for each");
        for (var value : arrayForEach){                                             // penggunaan perulangan for each. Digunakan untuk mengambil data array satu per satu.
            System.out.println(value);
        }




    }
}