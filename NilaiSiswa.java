import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] siswa = {"Ali", "Budi", "Citra"};
        String[] mapel = {"Matematika", "Bahasa Indonesia", "IPA"};
        int[][] nilai = new int[siswa.length][mapel.length];

        // Input nilai
        System.out.println("Input Nilai Siswa:");
        for (int i = 0; i < siswa.length; i++) {
            System.out.println("Siswa: " + siswa[i]);
            for (int j = 0; j < mapel.length; j++) {
                System.out.print("  Nilai " + mapel[j] + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        // Output nilai
        System.out.println("\nDaftar Nilai Siswa:");
        System.out.printf("%-10s", "Siswa");
        for (String m : mapel) {
            System.out.printf("%-20s", m);
        }
        System.out.println();

        for (int i = 0; i < siswa.length; i++) {
            System.out.printf("%-10s", siswa[i]);
            for (int j = 0; j < mapel.length; j++) {
                System.out.printf("%-20d", nilai[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
