class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(Math.abs(a-x)==Math.abs(b-x)){
                return b-a;
            }
            return Math.abs(b-x)-Math.abs(a-x);
        });
        for(int i : arr){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}