package core;
import java.util.ArrayList;
public class ArrList {
    public static void main(String args[]){
        ArrayList<String> country = new ArrayList<String>(12);
        country.add("Italy");
        country.add("Norway");
        country.add("Luxemborg");
        country.add("Spaine");
        country.add("France");
        country.add("Malta");

        System.out.println(country.size());
        country.remove("Malta");
        System.out.println(country.size());
        country.set(0,"Ukraine");
        System.out.println( country.get(0));
        if (country.contains("Spaine")) System.out.println("yes");
        else
            System.out.println("no");
        for(String S:country){
            System.out.println(S);
            System.out.println("____________");
            Object[] cc= country.toArray();
            for(Object mas:cc){
                System.out.println(mas);
            }
        }
    }
}
