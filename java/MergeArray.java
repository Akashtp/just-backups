public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j])
                nums1[k--] = nums2[j--];
            else
                nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        for (int p = 0; p < m + n; p++) {
            System.out.println(nums1[p]);
        }
    }

    /*public static void main(String[] args) {
        int[] nums1 = new int[20]{ 1, 3, 4, 6, 8, 12, 33 };
        int[] nums2 = { 2, 3, 4, 5, 6, 7, 8, 11, 22, 33 };
        int m = 7;
        int n = 10;
        merge(nums1, m, nums2, n);
    }*/
}