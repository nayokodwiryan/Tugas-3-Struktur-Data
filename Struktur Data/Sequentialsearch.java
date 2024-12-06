public class Sequentialsearch {
    public static void main(String[] args) {
        int[] data = {15, 22, 35, 40, 50}; // Data array
        int n = 35; // Angka yang ingin di cari

        boolean found = false;
        int index = -1;

        // Sequential search
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                found = true;
                index = i;
                break;
            }
        }

        // Output hasil pencarian
        if (found) {
            System.out.println("Angka " + n + " ditemukan di indeks ke- " + index);
        } else {
            System.out.println("Angka " + n + " tidak ditemukan.");
        }
    }
}








