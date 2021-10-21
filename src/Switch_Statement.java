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

    }
}
