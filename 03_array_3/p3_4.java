import java.util.*;
public class p3_4 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        if(n==0){ArrayList<Integer> ans=new ArrayList<>();
        return ans;}
        if(n==1){ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr.get(0));return ans;}
        if(n==2){ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr.get(0));ans.add(arr.get(1));return ans;}
        int element1=arr.get(0);int element2=arr.get(1);
        int count1=0;int count2=0;
        for(int i=0;i<n;i++){
            if(count1==0 && arr.get(i)!=element2){count1++;element1=arr.get(i);}
            else if(count2==0 && arr.get(i)!=element1){count2++;element2=arr.get(i);}
            else if(arr.get(i)==element1){count1++;}
            else if(arr.get(i)==element2){count2++;}
            else{count1--;count2--;}
        }
        count1=0;count2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==element1){count1++;}
            else if(arr.get(i)==element2){count2++;}
            }
        ArrayList<Integer> ans=new ArrayList<>();
        if(count1>n/3){ans.add(element1);}
        if(count2>n/3){ans.add(element2);}
        return ans;
}
}
