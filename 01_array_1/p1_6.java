import java.util.*;
public class p1_6 {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min=prices.get(0);int profit=0;
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)-min>profit){profit=prices.get(i)-min;}
        }
        if(profit<0){return 0;}
        return profit;
    }
}
