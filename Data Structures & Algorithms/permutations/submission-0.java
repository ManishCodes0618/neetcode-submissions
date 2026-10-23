class Solution {
    static List<List<Integer>> list;
    public List<List<Integer>> permute(int[] nums) {
        list= new ArrayList<>();
        boolean[] visited= new boolean[nums.length];
        List<Integer> li=new ArrayList<>();
        recur(0,nums,visited,li);
        return list;
    }
    public static void recur(int idx, int[] nums, boolean[] visited, List<Integer> li){
        if(idx==nums.length){
            list.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                li.add(nums[i]);
                visited[i]= true;
                recur(idx+1,nums,visited,li);
                visited[i]=false;
                li.remove(li.size()-1);
            }
        }
    }
}
