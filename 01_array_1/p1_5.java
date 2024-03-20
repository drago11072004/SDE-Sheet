public class p1_5 {
    public static int[] sort012(int[] arr)
    {
        //Write your code here
        int zeros=0; int ones=0; int twos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){zeros+=1;}
            else if(arr[i]==1){ones+=1;}
            else{twos+=1;}
        }
        for(int i=0;i<zeros;i++){arr[i]=0;}
        for(int i=zeros;i<zeros+ones;i++){arr[i]=1;}
        for(int i=zeros+ones;i<zeros+ones+twos;i++){arr[i]=2;}  
        return arr;
    }
    public static int[] sort012_1(int[] arr)
    {
        //Write your code here
        int n=arr.length;int low=0;int mid=0;int high=n-1;
        while(low!=high){
            if(arr[mid]==0){arr[low]=0;arr[mid]=1;low++;mid++;}
            else if(arr[mid]==1){mid++;}
            else{int x=arr[high];arr[high]=2;arr[mid]=x;mid++;high--;}
        }
        return arr;
    }
}
