class Solution {
    public void moveZeroes(int[] nums) {

        int Pos= 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[Pos] = nums[i];
                Pos++;
            }
        }
        while(Pos<nums.length) {
            nums[Pos]= 0;
            Pos++;
          }
        
    }
}