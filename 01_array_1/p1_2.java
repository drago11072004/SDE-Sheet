import java.util.ArrayList;

public class p1_2 {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> l = new ArrayList<ArrayList<Long>>();
        long a =1;
        for(int i=0; i<n; i++){
            if(i==0){
                ArrayList<Long> l1 = new ArrayList<>();
                l1.add((Long)a);
                l.add(0,l1);
                continue;
                 }
            if(i==1){
                ArrayList<Long> l1 = new ArrayList<>();
                l1.add((Long)a);l1.add((Long)a);
                l.add(l1);
                continue;
                 }
            ArrayList<Long> l1 = new ArrayList<>();
            l1.add((Long)a);
            for(int j=1; j<i;j++){
                long p=l.get(i-1).get(j-1)+l.get(i-1).get(j);
                l1.add((Long)p);
                 }
            l1.add((Long)a);
            l.add(l1);
             }
        return l;
        }
}
