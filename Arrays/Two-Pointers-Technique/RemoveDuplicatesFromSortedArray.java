public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.print("Updated array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
