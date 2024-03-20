import java.util.*;
public class p2_1{

        public static void rotateMatrix_incomplete_n(ArrayList<ArrayList<Integer>> mat, int start,  int endrow, int endcolumn ) {
            // Write your code here.
            if(endrow==start || start==endcolumn){return;}
            int top_right_next=mat.get(start).get(endcolumn-1);
            int top_right=mat.get(start).get(endcolumn);
            int bottom_left=mat.get(endrow).get(start);
            int bottom_right_next=mat.get(endrow-1).get(endcolumn);
            for(int i=start+1;i<=endcolumn;i++){                    
                mat.get(start).set(endcolumn+1-i,mat.get(start).get(endcolumn-i));       // endrow=n-1 endcolumn=m-1
                mat.get(endrow).set(i-1,mat.get(endrow).get(i));
            }
            for(int i=start+1;i<=endrow;i++){
                mat.get(endrow+1-i).set(endcolumn,mat.get(endrow-i).get(endcolumn));
                mat.get(i-1).set(start,mat.get(i).get(start));
            }
            mat.get(start+1).set(endcolumn,top_right);
            mat.get(endrow-1).set(start,bottom_left);
            mat.get(start).set(endcolumn,top_right_next);
            mat.get(endrow).set(endcolumn,bottom_right_next);
        }
        public static void rotateMatrix_incomplete(ArrayList<ArrayList<Integer>> mat, int n, int m) {
            // Write your code here.
            if(m==1 || n==1){return;}
            // int top_left=mat.get(0).get(0);
            int top_right=mat.get(0).get(m-1);
            int bottom_left=mat.get(n-1).get(0);
            // int bottom_right=mat.get(n-1).get(m-1);
            for(int i=1;i<m;i++){
                mat.get(0).set(m-i,mat.get(0).get(m-i-1));
                mat.get(n-1).set(i-1,mat.get(n-1).get(i));
            }
            for(int i=1;i<n;i++){
                mat.get(n-i).set(m-1,mat.get(n-i-1).get(m-1));
                mat.get(i-1).set(0,mat.get(i).get(0));
            }
            mat.get(1).set(m-1,top_right);
            mat.get(n-2).set(0,bottom_left);
        }
        public static void main(String[] args) {
            ArrayList<Integer> l1= new ArrayList<>(List.of(1,2,3,4,5));
            ArrayList<Integer> l2= new ArrayList<>(List.of(16,17,18,19,6));
            ArrayList<Integer> l3= new ArrayList<>(List.of(15,24,25,20,7));
            ArrayList<Integer> l4= new ArrayList<>(List.of(14,23,22,21,8));
            ArrayList<Integer> l5= new ArrayList<>(List.of(13,12,11,10,9));
            ArrayList<ArrayList<Integer>> mat = new ArrayList<>(List.of(l1,l2,l3,l4,l5));
            int n=5;int m=5;
            int x=Math.min(m, n);
            for(int p=0;p<x/2;p++){
                rotateMatrix_incomplete_n(mat, p, n-1-p, m-p-1);
            }
            // for(int i=0; i<n; i++){
            //     for(int j=0;j<m;j++){
            //         System.out.print(mat.get(i).get(j)+" ");
            //     }
            //     System.out.println(" ");
            // }
            
            // int p=1; int q=11;
            // int[][] a = new int[p][q];
            // System.out.println(a.length+" "+a[0].length);
        }
    }
