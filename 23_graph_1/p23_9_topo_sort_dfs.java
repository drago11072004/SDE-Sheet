import java.util.*;

public class p23_9_topo_sort_dfs {
    public static void topo_dfs(int node,Stack<Integer> st,boolean[] vis,ArrayList<ArrayList<Integer>> adj) {
       vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
            topo_dfs(it,st,vis,adj);
            }
        }
        st.push(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){  
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            vis[i]=false;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<v;i++){
            if(!vis[i]){topo_dfs(i,st,vis,adj);}
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(!st.isEmpty()){
            topo.add(st.pop());
        }
        return topo;
    }
}
