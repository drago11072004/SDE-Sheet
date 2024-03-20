public class p24_4_floyd_warshall {
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        int INF=99999999;
        int n=matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = INF;
                }
            }
        }
        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][via]+matrix[via][j]<matrix[i][j] ){
                        matrix[i][j]=matrix[i][via]+matrix[via][j];
                    }
                }
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(matrix[i][j] == INF){
                    matrix[i][j] = -1;
                }
            }
        }

    //to check negative cycle
    for(int i=0; i<n;i++){
        if(matrix[i][i]<0){System.out.println("there is negative cycle");}
    }
}
}
