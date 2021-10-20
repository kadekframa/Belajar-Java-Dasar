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
        }
}
