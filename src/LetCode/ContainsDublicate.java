package LetCode;

public class ContainsDublicate {
    public static void main(String[] args) {


        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
