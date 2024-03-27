import java.util.HashMap;
import java.util.Scanner;

public class ContohHashMapKeyboard {

    public static void main(String[] args) {
        // Buat objek HashMap dan Scanner
        HashMap<String, String> data = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Masukkan jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();

        // Masukkan data ke HashMap
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan key ke-" + (i + 1) + ": ");
            String key = scanner.next();
            System.out.print("Masukkan value ke-" + (i + 1) + ": ");
            String value = scanner.next();
            data.put(key, value);
        }

        // Tampilkan data HashMap
        System.out.println("Data HashMap:");
        for (String key : data.keySet()) {
            System.out.println("Key: " + key + ", Value: " + data.get(key));
        }
    }
}
