

import java.util.Scanner;

public class TestNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];

        // Menampilkan menu pilihan
        System.out.println("Pilihan: ");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();

        HitungRata hitung = new HitungRata(input);

        // Memilih opsi dengan switch-case
        switch (pilihan) {
            case 1:
                hitung.inputNilai(nilai);
                System.out.println("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : " + hitung.rataNilai(banyakData));
                break;
            case 2:
                hitung.inputNilaiBaru(banyakData);
                System.out.println("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}

class HitungRata {

    private Scanner input;
    private int[] nilai;

    public HitungRata(Scanner input) {
        this.input = input;
    }

    public void inputNilai(int[] nilai) {
        this.nilai = nilai;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai : ");
            nilai[i] = input.nextInt();
        }
    }

    public void cetakNilai(int[] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
    }

    public double rataNilai(int banyakData) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total / banyakData;
    }

    public void inputNilaiBaru(int banyakData) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Baru : ");
            nilai[i] = input.nextInt();
        }
    }

    public void cetakNilaiBaru() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
    }
}
