import java.util.*;
public class p24_3_bellman_ford{
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int[] dist= new int[V];
        for(int i=0;i<V;i++){
            dist[i]=100000000;
        }
        dist[S]=0;
        int n=edges.size();
        for(int j=0;j<V-1;j++){
            for(int i=0;i<n;i++){
                int u=edges.get(i).get(0);
                int v=edges.get(i).get(1);
                int w=edges.get(i).get(2);
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
        boolean neg_cycle=false;
        for(int i=0;i<n;i++){
                int u=edges.get(i).get(0);
                int v=edges.get(i).get(1);
                int w=edges.get(i).get(2);
                if(dist[u]+w<dist[v]){
                    neg_cycle=true;
                    return new int[] {-1};
                }
            }
        return dist;
        
    }
}