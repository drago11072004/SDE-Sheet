import java.util.*;
public class p3_1 {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m=mat.size();int n=mat.get(0).size();
        for(int i=0;i<m-1;i++){
            if(target>=mat.get(i).get(0) && target< mat.get(i+1).get(0)){
                for(int j=0;j<n;j++){
                    if(target==mat.get(i).get(j)){return true;}
                }
                return false;                                         //not submitted there and not optimal
            }
        }
        for(int j=0;j<n;j++){
            if(target==mat.get(m-1).get(j)){return true;}
            }
        return false;
    }

    static boolean searchMatrix_optimal(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m=mat.size();int n=mat.get(0).size();
        int low=0; int high = (m*n)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int a=mid/n,b=mid%n;
            int x= mat.get(a).get(b);
            if(x==target){return true;}
            else if(x>target){high=mid-1;}
            else if(x<target){low=mid+1;}
            
        }
        return false;  
    }
}
