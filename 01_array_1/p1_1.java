import java.util.ArrayList;

public class p1_1{
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int[] row = new  int[m];
        int[] column = new  int[n];
        for(int i=0; i<m; i++){row[i]=0;}
        for(int i=0; i<n; i++){column[i]=0;}
        for (int i=0; i<n; i++){
            for (int j=0; j<m;j++){
                if(matrix.get(i).get(j)==0){row[j]=1;column[i]=1;}
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m;j++){
                if(row[j]==1 || column[i]==1){matrix.get(i).set(j, 0);}
            }
        }
        return matrix;
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix_1(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        // int[] row = new  int[m];
        // int[] column = new  int[n];
        int col0=1;
        for (int i=0; i<n; i++){
            for (int j=0; j<m;j++){
                if(matrix.get(i).get(j)==0){
                    if(j!=0){matrix.get(0).set(j, 0);}
                    else{col0=0;}
                    matrix.get(i).set(0, 0);}}
            }
        
        for (int i=1; i<n; i++){
            for (int j=1; j<m;j++){
                if(matrix.get(0).get(j)==0 || matrix.get(i).get(0)==0){matrix.get(i).set(j, 0);}
            }
        }
        
        if(matrix.get(0).get(0)==0){
            for(int i=0;i<m;i++){matrix.get(0).set(i,0);}
        }
        if(col0==0){
            for(int i=0;i<n;i++){matrix.get(i).set(0,0);}
        }
        return matrix;
    }
    
}