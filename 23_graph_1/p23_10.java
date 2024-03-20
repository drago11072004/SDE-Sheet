import java.util.*;

public class p23_10 {
    
    public static ArrayList<ArrayList<Integer>> adj_helper(int[][] mat,int p, int q,int n,int m){
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        // we can use loop here
        if(p-1>-1 && q-1>-1 && mat[p-1][q-1]==1){temp.add(new ArrayList<>(Arrays.asList(p-1,q-1)));}
        if(q-1>-1 && mat[p][q-1]==1){temp.add(new ArrayList<>(Arrays.asList(p,q-1)));}
        if(p+1<n && q-1>-1 && mat[p+1][q-1]==1){temp.add(new ArrayList<>(Arrays.asList(p+1,q-1)));}
        if(p-1>-1 && mat[p-1][q]==1){temp.add(new ArrayList<>(Arrays.asList(p-1,q)));}
        if(p-1>-1 && q+1<m && mat[p-1][q+1]==1){temp.add(new ArrayList<>(Arrays.asList(p-1,q+1)));}
        if(q+1<m && mat[p][q+1]==1){temp.add(new ArrayList<>(Arrays.asList(p,q+1)));}
        if(p+1<n && q+1<m && mat[p+1][q+1]==1){temp.add(new ArrayList<>(Arrays.asList(p+1,q+1)));}
        if(p+1<n && mat[p+1][q]==1){temp.add(new ArrayList<>(Arrays.asList(p+1,q)));}
        return temp;
    }

    public static int getTotalIslands(int[][] mat){
        int n=mat.length, m=mat[0].length;
        int ans=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                vis[i][j]=false;
            }
        }       
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(!vis[i][j]){
                    // vis[i][j]=true;
                    if(mat[i][j]==1){
                    ans++;
                    // ArrayList<ArrayList<Integer>> adj = adj_helper(mat, i, j, n, m);
                    dfs(mat,adj_helper(mat, i, j, n, m),vis,i,j,n,m);}
                }
            }
        }
        return ans;
    }
    
    public static void dfs(int[][] mat,ArrayList<ArrayList<Integer>> ad, boolean[][] vis, int x,int y,int n,int m){
        vis[x][y]=true;
        for(int i=0;i<ad.size();i++){
            if(!vis[ad.get(i).get(0)][ad.get(i).get(1)]){
                dfs(mat,adj_helper(mat, ad.get(i).get(0), ad.get(i).get(1), n, m) ,vis,ad.get(i).get(0),ad.get(i).get(1),n,m);
            }
        }
    }

    public static void main(String[] args) {
        int[][] df ={{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},
                     };
        // ArrayList<ArrayList<Integer>> adj = adj_helper(df, 1, 2, 4, 4);
        // for(int i=0;i<adj.size();i++){
        //     System.out.println(adj.get(i).get(0)+" "+adj.get(i).get(1));
        // }
        int a= getTotalIslands(df);
        System.out.println(a);
    }
}