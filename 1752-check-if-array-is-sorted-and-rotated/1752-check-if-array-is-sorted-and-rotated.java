class Solution {
    public boolean check(int[] nums) {
         int check = 0;
        if (nums[0] < nums[nums.length -1]) check++;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1]){
                check++;
            }
        }
        return check <= 1;
    }
}