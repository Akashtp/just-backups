public class BinarySearch {
    public static int search(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 31, 43, 56, 78 };
        int key = 31;
        System.out.println(search(a, key));
    }

}
