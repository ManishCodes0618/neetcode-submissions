class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows= grid.length;
        int cols= grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int[][] dir= {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        int k=1;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-- >0){
                int[] pop=q.poll();
                int x= pop[0];
                int y=pop[1];
                for(int[] i: dir){
                    int nr=x+i[0];
                    int nc=y+i[1];
                    if(nr>=0 && nc>=0 && nr<rows && nc<cols){
                        if(grid[nr][nc]==-1 || grid[nr][nc]==0){
                            continue;
                        }
                        if(grid[nr][nc]>k){
                            grid[nr][nc]=k;
                            q.add(new int[]{nr,nc});
                        }
                    }
                }
            }
            k++;
        }
    }
}
