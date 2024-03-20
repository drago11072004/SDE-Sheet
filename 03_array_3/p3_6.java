public class p3_6 {
    public static int merge(int[] arr,int low,int mid,int high){
        int cnt=0;int k=mid+1;
        for(int i = low;i<=mid;i++) {
            while(k<=high && arr[i] > (2 * (long) arr[k])) {
                k++;
            }
            cnt += (k - (mid+1));
        }
        int[] temp=new int[high-low+1];
        int ptr1=low;int ptr2=mid+1;int i=0;
        while(ptr1<=mid && ptr2<=high){
            if(arr[ptr1]>=arr[ptr2]){temp[i]=arr[ptr2];ptr2++;}
            else if(arr[ptr2]>arr[ptr1]){temp[i]=arr[ptr1];ptr1++;}
            i++;                                                 //for merging two sorted arrays,we can use shell sort algo
        }
        while(ptr1<=mid){temp[i]=arr[ptr1];ptr1++;i++;}
        while(ptr2<=high){temp[i]=arr[ptr2];ptr2++;i++;}
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
        return cnt;
    }
    public static int merge_sort(int[] arr,int low,int high){
        if(low>=high){return 0;}
        int mid=(low+high)/2;
        int inv =merge_sort(arr, low, mid);
        inv+=merge_sort(arr, mid+1, high);
        inv+=merge(arr,low,mid,high);
        return inv;
    }
    public int reversePairs(int[] nums) {
        int ans=merge_sort(nums,0,nums.length-1);
        return ans;
    }
}
