package Shuffle;

public class Solution {
    public int[] shuffle(int[] nums, int n){
        int[] return_nums = new int[n * 2];

        for(int i = 0, x = 0, y = n; i < return_nums.length; i++){
            return_nums[i] = i % 2 == 0 ? nums[x++] : nums[y++];
        }

        return return_nums;
    }
}
