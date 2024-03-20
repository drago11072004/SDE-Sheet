import java.util.*;
public class p23_8_topo_sort_bfs {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){  
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            vis[i]=false;
        }
        int[] indegree = new int[v];
        for(int i=0;i<v;i++){
            indegree[i]=0;
        }
        for(int i=0;i<e;i++){
            indegree[edges.get(i).get(1)]++;
        }
        ArrayList<Integer> topo = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){q.add(i);}
        }
        while(!q.isEmpty()){
            int x= q.remove();
            topo.add(x);
            ArrayList<Integer> arr = adj.get(x);
            for(int it:arr){
                indegree[it]--;
                if(indegree[it]==0){q.add(it);}
            }
        }
        return topo;
    }
}
