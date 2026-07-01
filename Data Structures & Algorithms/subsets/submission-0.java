class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        recur(0,nums,list,li);
        return list;
    }
    public static void recur(int idx,int[] nums, List<List<Integer>> list, List<Integer> li){
        if(idx==nums.length){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        recur(idx+1,nums,list,li);
        li.remove(li.size()-1);
        recur(idx+1,nums,list,li);
    }
}
