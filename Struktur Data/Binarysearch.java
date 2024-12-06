public class Binarysearch {
    public static void main(String[] args) {
        int[] data = {15, 22, 35, 40, 50}; // Data array 
        int n = 40; // Angka yang ingin dicari

        int low = 0;
        int high = data.length - 1;
        int mid;
        boolean found = false;

        // Binary search
        while (low <= high) {
            mid = (low + high) / 2;

            if (data[mid] == n) {
                System.out.println("Angka " + n + " ditemukan di indeks ke-" + mid);
                found = true;
                break;
            } else if (data[mid] < n) {
                low = mid + 1; // Cari di bagian kanan
            } else {
                high = mid - 1; // Cari di bagian kiri
            }
        }

        if (!found) {
            System.out.println("Angka " + n + " tidak ditemukan.");
        }
    }
}



