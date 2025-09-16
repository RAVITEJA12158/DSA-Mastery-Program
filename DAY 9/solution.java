class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
    }
}
}