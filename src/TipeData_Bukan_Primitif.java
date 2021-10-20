public class TipeData_Bukan_Primitif {
        public static void main(String[] args) {
                // Tipe Data Bukan Primitif.
                // Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
                // Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
                // Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value dan bisa bernilai.
                // Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti).
                // Di Java, semua tipe data primitif memiliki representasi tipe data  bukan primitifnya.


                // Contoh penggunaan tipe data bukan primitif.
                Integer iniInteger = 100;       // Tipe data bukan primitif atau object.
                Long iniLong = 10000L;
                Short iniShort = 10;

                Byte iniByte = null;            // Tipe data bukan primitif atau object.
                System.out.println(iniByte);

                iniByte = 100;                  // Tipe data primitif.
                System.out.println(iniByte);


                // Konversi tipe data primitif ke tipe data bukan primitif.
                int iniInt = 240;
                Integer iniInteger2 = iniInt;   // contoh cara konversi dari tipe data primitif ke bukan primitif.

                System.out.println(iniInteger2);


                // Konversi tipe data bukan primitif (object) ke tipe data primitif.
                // contoh 1
                Integer ageObject = 21;
                int ageprimitf = ageObject;     // konversi tipe data bukan primitif ke tipe data primitif.

                System.out.println("");
                System.out.println("Ini adalah contoh cara konversi dari tipe data bukan primitif ke tipe data primitif. " + ageprimitf);

                // contoh 2
                Integer ageObjectAgain = 21;
                short shortAge = ageObjectAgain.shortValue();        // cara konversi tipe data bukan primitif ke tipe data primitf namun berbeda tipe data (dalam hal ini dikonversi dari Integer ke short).
                byte byteAge = ageObjectAgain.byteValue();           // cara konversi tipe data bukan primitif ke tipe data primitf namun berbeda tipe data (dalam hal ini dikonversi dari Integer ke byte).
                System.out.println("");
                System.out.println("Ini adalah contoh cara konversi dari tipe data bukan primitif ke tipe data primitif yang tidak compatible (dalam artian dari Integer dikonversi ke short). " + shortAge);
                System.out.println("Ini adalah contoh cara konversi dari tipe data bukan primitif (Integer) ke tipe data primitif (byte) (dalam hal ini dari Integer dikonversi ke byte). " + byteAge);
        }
}