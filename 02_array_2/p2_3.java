public class p2_3 {

    //SHELL SORT ALGORITHM
    public static void swap_if_greater(int[] arr1, int[] arr2, int ind1, int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int x=arr1[ind1];arr1[ind1]=arr2[ind2];arr2[ind2]=x;
        }
    }
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int gap=(m+n)/2 + (m+n)%2;
        while(gap>0){
            int left=0;int right =left+gap;
            while(right<m+n){
                if(left<m && right<m){swap_if_greater(arr1,arr1,left,right);}
                else if(left<m && right>=m){swap_if_greater(arr1,arr2,left,right-m);}
                else{swap_if_greater(arr2,arr2,left-m,right-m);}
                left++;right++;
                }
            if(gap==1){break;}
            gap=gap/2 + gap%2;
        }
        for(int i=m;i<m+n;i++){
            arr1[i]=arr2[i-m];
        }
        return arr1;
    }

    public int[] solution(int arr1[], int arr2[], int m, int n){
        int left=m-1;int right =0;
        while(left>0 && right<n){
            if(arr1[left]<arr2[right]){
                int x=arr1[left];arr1[left]=arr2[right];arr2[right]=x;
            }
            else{break;}
            left--;right++;
        }
        //sort the arr1 & arr2 and then merge them
        return arr1;
    }
}
