import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menentukan sebuah bilangan itu ganjil, genap, atau NOL
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        String hasilGanjilGenap = cekGanjilGenap(bilangan);
        System.out.println("Bilangan " + bilangan + " adalah " + hasilGanjilGenap);

        // Menentukan sebuah bilangan itu positif, negative, atau NOL
        String hasilPositifNegatif = cekPositifNegatif(bilangan);
        System.out.println("Bilangan " + bilangan + " adalah " + hasilPositifNegatif);

        // Membaca pilihan alat keperluan sekolah berdasarkan angka yang dipilih
        System.out.println("Pilih alat keperluan sekolah:");
        System.out.println("1. Pensil");
        System.out.println("2. Buku");
        System.out.println("3. Penghapus");
        System.out.println("4. Rautan");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();
        String hasilPilihan = cekPilihan(pilihan);
        System.out.println("Anda memilih " + hasilPilihan);
    }

    public static String cekGanjilGenap(int bilangan) {
        if (bilangan == 0) {
            return "NOL";
        } else if (bilangan % 2 == 0) {
            return "GENAP";
        } else {
            return "GANJIL";
        }
    }

    public static String cekPositifNegatif(int bilangan) {
        if (bilangan > 0) {
            return "POSITIF";
        } else if (bilangan < 0) {
            return "NEGATIF";
        } else {
            return "NOL";
        }
    }

    public static String cekPilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Pensil";
            case 2:
                return "Buku";
            case 3:
                return "Penghapus";
            case 4:
                return "Rautan";
            default:
                return "Pilihan tidak valid";
        }
    }
}