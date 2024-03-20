import java.util.*;     //using bfs
public class p23_4 {
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
        int[] parent=new int[n+1];
        for(int i=0;i<n+1;i++){
           parent[i]=-2;
        }
        for(int i=1;i<n+1;i++){
            if(!vis[i]){
                String s= isCycle(i,adj,vis,parent);
                if(s.equals("Yes")){return "Yes";}
            }
        }
        return "No";
    }
    public static String isCycle(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int[] parent) {
        // Write your code here.
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node]=true;
        parent[node]=-1;
        while(!q.isEmpty()){
            int x=q.remove();
            int par=parent[x];
            ArrayList<Integer> arr = adj.get(x);
            for(int it:arr){
                if(!vis[it]){
                q.add(it);vis[it]=true;parent[it]=x;
                }
                else{
                    if(par!=it){return "Yes";}
                }
            }
        }
        return "No";
    }
}
