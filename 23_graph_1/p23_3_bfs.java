import java.util.*;
public class p23_3_bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);ans.add(0);vis[0]=true;
        while(!q.isEmpty()){
            int x= q.remove();
            ArrayList<Integer> arr=adj.get(x);
            for(int it:arr){
                if(!vis[it]){
                q.add(it); ans.add(it);vis[it]=true;
                }
            }
            
        }
        return ans;
    }
}
