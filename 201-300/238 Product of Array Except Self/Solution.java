class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            temp[i] = temp[i - 1] * nums[i - 1];
        }

        int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp[i] = temp[i] * R;
            R *= nums[i];
        }
        return temp;
    }
}
