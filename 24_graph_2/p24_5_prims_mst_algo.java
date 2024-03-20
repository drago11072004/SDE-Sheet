import java.util.*;

class pair {
    int node, weight;

    public pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class p24_5_prims_mst_algo {
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> mst = new ArrayList<>();
        int[] vis = new int[n + 1];
        int[] parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            vis[i] = -1;
            parent[i] = -1;
        }
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<pair>());
        }
        for (int i = 0; i < m; i++) {
            int u = g.get(i).get(0);
            int v = g.get(i).get(1);
            int w = g.get(i).get(2);
            adj.get(u).add(new pair(v, w));
            adj.get(v).add(new pair(u, w));
        }
        // System.out.println(adj.get(2).get(0).weight+" kk");
        PriorityQueue<pair> pq = new PriorityQueue<pair>((x, y) -> x.weight - y.weight);
        pq.add(new pair(1, 0));
        while (!pq.isEmpty()) {
            int nd = pq.peek().node;
            int pt = parent[nd];
            int wt = pq.peek().weight;
            pq.remove();
            if (vis[nd] == 1) {;
                continue;
            }
            vis[nd] = 1;
            if(pt!=-1){
            mst.add(new ArrayList<Integer>(Arrays.asList(pt, nd, wt)));
            }
            for (int i = 0; i < adj.get(nd).size(); i++) {
                int adj_nd = adj.get(nd).get(i).node;
                int adj_wt = adj.get(nd).get(i).weight;
                if (vis[adj_nd] == -1) {
                    pq.add(new pair(adj_nd, adj_wt));
                    parent[adj_nd] = nd;
                }
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        g.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));
        g.add(new ArrayList<Integer>(Arrays.asList(1, 3, 8)));
        g.add(new ArrayList<Integer>(Arrays.asList(2, 3, 10)));
        g.add(new ArrayList<Integer>(Arrays.asList(2, 4, 15)));
        g.add(new ArrayList<Integer>(Arrays.asList(3, 4, 20)));
        // g.add(new ArrayList<Integer>(Arrays.asList(0,1,5)));
        // g.add(new ArrayList<Integer>(Arrays.asList(0,1,5)));
        ArrayList<ArrayList<Integer>> ans = calculatePrimsMST(4, 5, g);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println("");
            
        }
    }
}
