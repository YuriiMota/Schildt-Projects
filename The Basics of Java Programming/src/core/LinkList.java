package core;

import java.util.LinkedList;

public class LinkList {
    public static void main(String args[]){
        LinkedList<String> stat=new LinkedList<>();
        stat.add("uran");
        stat.addFirst("lilo");
        stat.addLast("pepe");
        stat.add(1,"dfdf");
        System.out.println(stat.size());
        for(String S:stat) System.out.println(S);
        if (stat.contains("dfdf")) stat.remove("dfdf");
        for(String S:stat) System.out.println(S);
        stat.removeFirst();
        stat.removeLast();
        LinkedList<Pers> P1=new LinkedList<Pers>();
        P1.addFirst(new Pers("Lolo"));
        P1.add(new Pers("Pepe"));
        P1.addLast(new Pers("lalalalal"));
        for(Pers p:P1) System.out.println(p.getName());
    }
}
class Pers{
    private String name;
    public Pers(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
