package latihan3;

import java.util.Scanner;

public class MainGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        GradeActivity ga = new GradeActivity(nama);

        System.out.println("===== PassFailExam =====");
        System.out.print("Masukkan jumlah pertanyaan : ");
        int jmlSoal = sc.nextInt();
        System.out.print("Masukkan jumlah pertanyaan yang salah : ");
        int miss = sc.nextInt();
        System.out.print("Berapa score minimal yang dibutuhkan untuk Lulus : ");
        int minPass = sc.nextInt();

        PassFailExam pfe = new PassFailExam(jmlSoal, miss, minPass);
        System.out.println("Nama peserta ujian = " + ga.name);
        System.out.println("Poin tiap pertanyaan = " + pfe.getPointsEach());
        System.out.println("Score ujian = " + pfe.getScore());
        System.out.println("Grade ujian = " + pfe.getGrade());

        System.out.println("===== FinalExam =====");
        System.out.print("Masukkan jumlah pertanyaan : ");
        int jmlSoal2 = sc.nextInt();
        System.out.print("Masukkan jumlah pertanyaan yang salah : ");
        int miss2 = sc.nextInt();
        FinalExam fe = new FinalExam(jmlSoal2, miss2);
        System.out.println("Nama peserta ujian = " + ga.name);
        System.out.println("Poin tiap pertanyaan = " + fe.getPointsPerQuestion());
        System.out.println("Score ujian = " + fe.getScore());
        System.out.println("Grade ujian = " + fe.getGrade());

        sc.close();

    }
}
