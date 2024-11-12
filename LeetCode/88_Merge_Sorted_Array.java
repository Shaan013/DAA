class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2

        for (int p = n + m - 1; p >= 0; p--) {
            if (p2 < 0) {
                break; // No more elements in nums2 to merge
            }

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--; // Move pointer in nums1
            } else {
                nums1[p] = nums2[p2];
                p2--; // Move pointer in nums2
            }
        }
    }
}
