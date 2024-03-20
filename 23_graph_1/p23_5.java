import java.util.*;
public class p23_5 {
    public static String cycleDetection(int[][] edges, int n, int m) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis = new boolean[n+1];
        for(int i=0;i<n+1;i++){
           vis[i]=false;
        }
        for(int i=1;i<n+1;i++){
            if(!vis[i]){
                if(isCycle_dfs(i,-1,adj,vis)){return "Yes";}
            }
        }
        return "No";
    }
    public static boolean isCycle_dfs(int node,int parent, ArrayList<ArrayList<Integer>> adj,boolean[] vis) {
        // Write your code here.
        vis[node]=true;
        ArrayList<Integer> arr = adj.get(node);
        for(int it:arr){
            if(!vis[it]){
                if(isCycle_dfs(it,node,adj,vis)){return true;}
            }
            else if(parent!=it){return true;}
            
        }
        return false;
    }
}
