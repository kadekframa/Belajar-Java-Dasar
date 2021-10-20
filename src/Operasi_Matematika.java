public class Operasi_Matematika {
    public static void main(String[] args) {
        // Operasi Matematika di Java.

        //Contoh penggunaan Operasi Matematika di Java.
        int a = 100;
        int b = 10;
        int kurang = a - b;

        System.out.println("a + b = " + a + b);
        System.out.println("a - b = " + kurang);
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
        System.out.println("a % b = " + a % b);



        // Augmented assignments.
        // Contoh penggunaan augmented assignments.
        int aa = 10;

        System.out.println("");
        aa += 2;                // aa = aa + 2
        System.out.println(aa);
        aa -= 2;                // aa = aa -2
        System.out.println(aa);
        aa *= 2;                // aa = aa *2
        System.out.println(aa);
        aa /= 2;                // aa = aa / 2
        System.out.println(aa);
        aa %= 2;                // aa = aa % 2
        System.out.println(aa);

        System.out.println("");
        System.out.println(a);
    }
}
