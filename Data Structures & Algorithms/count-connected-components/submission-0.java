class Solution {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int[] i: edges){
            int a = i[0];
            int b = i[1];
            map.putIfAbsent(a,new ArrayList<>());
            map.putIfAbsent(b,new ArrayList<>());
            map.get(a).add(b);
            map.get(b).add(a);
        }
        boolean[] visited = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                traverse(i,map,visited);
                count++;
            }
        }
        return count;
    }
    public static void traverse(int src,  HashMap<Integer,List<Integer>> map, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while(!q.isEmpty()){
            int curr = q.poll();
            visited[curr] = true;
            if(map.get(curr)==null){
                continue;
            }
            for(int i: map.get(curr)){
                if(!visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
