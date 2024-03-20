import java.util.*;
public class p4_5 {
    public static int uniqueSubstrings(String input){
		//write your code here
		Set<Character> hashset = new HashSet<>();
		int n=input.length();
		int max=0;
		int left=0,right=0;
		while(right<n){
			if(!hashset.contains(input.charAt(right))){
				hashset.add(input.charAt(right));
				if(max<right-left+1){max=right-left+1;}
                right++;
			}
			else{
				hashset.remove(input.charAt(left));
				left++;
			}
		}
		return max;
    }


    public static int uniqueSubstrings_1(String input){
		//write your code here
		Map<Character,Integer> hashmap = new HashMap<>();
		int n=input.length();
		int max=0;
		int left=0,right=0;
		while(right<n){
			if(!hashmap.containsKey(input.charAt(right))){
				hashmap.put(input.charAt(right),right);
				if(max<right-left+1){max=right-left+1;}
                right++;
			}
			else{
				left=Math.max(hashmap.get(input.charAt(right)) + 1, left);
			}
		}
		return max;
    }
    
}
