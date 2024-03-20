import java.util.*;
public class p4_3 {
    public static void merge(int[] arr,int low, int mid, int high){
        int[] temp=new int[high-low+1];
        int left=low, right =mid+1; int j=0;
        while(left<mid+1 && right<=high){
            if(arr[left]>=arr[right]){
                temp[j]=(arr[right]);
                right++;j++;
            }
            else{
                temp[j]=(arr[left]);
                left++;j++;
            }
        }
        while(left<mid+1){temp[j]=(arr[left]);left++;j++;}
        while(right<=high){temp[j]=(arr[right]);right++;j++;}
        for(int i=low;i<high+1;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void merge_sort(int[] arr,int low,int high){
        if(low>=high){return;}
        int mid=(low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        merge_sort(arr,0,N-1);
        int num=0;int max=0;
        for(int i=0;i<N-1;i++){
            if(arr[i]+1==arr[i+1]){
                num++;
                if(max<num){max=num;}
            }
            else if(arr[i]==arr[i+1]){continue;}
            else{
                num=0;}
        }
        return max+1;

    }

    public static int lengthOfLongestConsecutiveSequence_1(int[] arr, int N) {
        // Write your code here.
        Set<Integer> haset= new HashSet<>();
        for(int num:arr){haset.add(num);}
        int max=0;
        for(int num:arr){
            if(!haset.contains(num-1)){
                int i=num;
                int itr=1;
                while(haset.contains(i+1)){
                    i++;itr++;
                }
                if(max<itr){max=itr;}
            }
        }
        return max;
    }
}
