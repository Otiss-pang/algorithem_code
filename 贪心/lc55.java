

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int cover = 0;
        for(int i=0; i<=cover; i++){
            cover =Math.max(cover,i+nums[i]) ;
            if(cover>= nums.length-1) return true;
        }
        return false;
    }
}

public class lc55 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,4};
        boolean b = s.canJump(nums);
        System.out.println(b);
    }
}