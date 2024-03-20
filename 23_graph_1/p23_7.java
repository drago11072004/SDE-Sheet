import java.util.*;
public class p23_7 {     //incmplete
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
    ArrayList <ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<n+1;i++){
      adj.add(new ArrayList<>());
    }
    for(int i=0;i<edges.size();i++){
      adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
    }
    boolean[] vis = new boolean[n+1];
    int[] parent = new int[n+1];
    for(int i=0;i<n+1;i++){
      vis[i]=false;
      parent[i]=-1;
    }
    for(int i=1;i<n;i++){
      if(!vis[i]){
        if(bfs_use(i,vis,parent,adj)){return true;}
        }
    }
    return false;
  }
  public static boolean bfs_use(int node, boolean[] vis, int[] parent, ArrayList <ArrayList<Integer>> adj) {
    Queue<Integer> q = new LinkedList<>();
    q.add(node);parent[node]=-1;vis[node]=true;
    while(!q.isEmpty()){
      int x = q.remove();
      ArrayList<Integer> arr = adj.get(x);
      for(int it:arr){
        if(!vis[it]){
          q.add(it);parent[it]=x;vis[it]=true;
        }
        else{
          if(parent[x]!=it){return true;}
        }
      }
    }
    return false;
  }
}
