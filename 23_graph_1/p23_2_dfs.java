import java.util.*;
public class p23_2_dfs {
    public static void dfs(int node,boolean[] vis,ArrayList<Integer> temp,int v, int e, ArrayList<ArrayList<Integer>> adj) {
        vis[node]=true;
        temp.add(node);
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,temp,v,e,adj);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            vis[i]=false;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        for(int i=0;i<v;i++){
            if(!vis[i]){
                ArrayList<Integer> temp=new ArrayList<>();
                dfs(i,vis,temp,v,e,adj); 
                ans.add(temp);
            }
        }
        return ans;
    }
}
