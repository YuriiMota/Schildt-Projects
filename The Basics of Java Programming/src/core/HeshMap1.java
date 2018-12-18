package core;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HeshMap1 {
    public static void main(String args[]){
    HashMap<Integer,String> hm = new HashMap<>();
    hm.put(1,"Germany");
        hm.put(2,"Lviv");
        hm.put(3,"TAllin");
        hm.put(4,"Riga");
        hm.put(5,"Oslo");
        System.out.println(hm.get(1));
        Set<Integer> keys = hm.keySet();
        System.out.println(keys);
        Collection<String>values = hm.values();
        System.out.println(values);
        hm.replace(3,"Stokholm");
        System.out.println(values);
        hm.remove(5);
        for (Map.Entry<Integer, String> item: hm.entrySet())
            System.out.printf("Key %d Value %s \n",item.getKey(),item.getValue());
    }
}
