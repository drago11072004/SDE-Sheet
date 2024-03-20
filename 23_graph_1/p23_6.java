import java.util.*;
public class p23_6 {   //incomplete
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        boolean[] vis = new boolean[n+1];
        boolean[] dfsvis = new boolean[n+1];
        for(int i=0;i<n+1;i++){
           vis[i]=false;dfsvis[i]=false;
        }
        for(int i=1;i<n+1;i++){
            if(!vis[i]){
                if(isCycle_dfs(i,adj,vis,dfsvis)){return true;}
            }
        }
        return false;
  }
  
  public static boolean isCycle_dfs(int node, ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] dfsvis) {
        // Write your code here.
        vis[node]=true;dfsvis[node]=true;
        ArrayList<Integer> arr = adj.get(node);
        for(int it:arr){
            if(!vis[it]){
                if(isCycle_dfs(it,adj,vis,dfsvis)){return true;}
            }
            else if(dfsvis[it]==true){return true;}
            
        }
        dfsvis[node]=false;
        return false;
    }
}

