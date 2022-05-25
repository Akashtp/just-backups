public class InsertionSort {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args){
        int[] a = {1,7,4,37,2,4,532,22};
        sort(a);
        for(int i  = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
