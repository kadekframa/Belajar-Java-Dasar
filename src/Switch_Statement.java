public class Switch_Statement {
    public static void main(String[] args) {
        // Switch Statement
        // Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==.
        // Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya,
        // Kondisi di swirch statement hanya untuk perbandingan "==".

        // Contoh Penggunaan Switch Statemennt
        var nilai = "A";
        switch (nilai){
            case "A":
                System.out.println("Wow Anda lulus dengan baik, Tetap Semangat!");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus dengan cukup baik yaa, Tetap Semangat!");
                break;
            case "D":
                System.out.println("Tetap Semangat!, Lebih giat lagi belajar yaa!");
                break;
            default:
                System.out.println("Tetap Semangat Meraih Impian !!!, Pantang Menyerah !!!");
        }



        // Switch Lambda.
        // Di Java versi 14, diperkenalkan switch expression dengan lambda.
        // Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break.

        // Contoh Penggunaan switch lambda.
        var nilaiNya = "E";

        switch (nilaiNya){
            case "A" -> System.out.println("Wow, Tetap Semangat!, Anda Lulus dengan baik.");        // penggunaan switch lambda lebih simple dan mudah digunakan.
            case "B", "C" -> System.out.println("Tetap Semangat!, Anda Lulus dengan cukup baik.");  // switch lambda ini hanya ada di Java versi 14 keatas.
            case "D" -> System.out.println("Tetap Semangat!, Pantang Menyerah");                    // Tetap Semangat berlatih Java !!!.
            default -> System.out.println("Pantang Menyerah, Tetap Semangat menggapai impian!!!");
        }

    }
}
