public class p23_12_bipartite_dfs {
    public boolean dfs(int node, int[] color,int[][] graph, int col){
        color[node]=col;
        for(int it:graph[node]){
            if(color[it]==-1){
                if(dfs(it,color,graph,(col-1)*(-1))==false){return false;};
            }
            else if(color[it]==col){return false;}
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int[] color=new int[v];
        for(int i=0;i<v;i++){
            color[i]=-1;
        }
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(dfs(i,color,graph,1)==false){return false;};
            }
        }
        return true;
    }
}
