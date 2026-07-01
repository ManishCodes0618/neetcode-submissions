class Solution {
    public int longestOnes(int[] nums, int k) {
        int p=0;
        int q=0;
        int max = 0;
        while(p<nums.length && q<nums.length){
            if(nums[q]==1){
                q++;
            }
            else{
                if(k>0){
                    k--;
                    q++;
                }
                else{
                    if(nums[p]==1){
                        p++;
                    }
                    else{
                        k++;
                        p++;
                    }
                }
            }
            max = Math.max(max,q-p);
        }
        return max;
    }
}