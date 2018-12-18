package core;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSet_1 {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("German");
        ts.add("Spain");
        ts.add("Alemania");
        ts.add("Greece");
        ts.add("UK");
        ts.remove("UK");
        //for(String s:ts) System.out.println(s);
        System.out.println(ts);
        SortedSet<String> setGreater=ts.tailSet("Germany");
        System.out.println(setGreater);
    }
}
