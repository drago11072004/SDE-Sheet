import java.util.*;
public class p23_11_bipartite_bfs {
    public boolean check(int start, int[] color,int[][] graph){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        q.add(0);color[0]=0;
        while(!q.isEmpty()){
            int x=q.remove();
            int[] arr=graph[x];
            for(int it:arr){
                if(color[it]==-1){
                    q.add(it);
                    if(color[x]==1){color[it]=0;}
                    else{color[it]=1;}
                }
                else if(color[it]==color[x]){return false;}
            }
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
                if(check(i,color,graph)==false){return false;};
            }
        }
        return true;
    }
}
