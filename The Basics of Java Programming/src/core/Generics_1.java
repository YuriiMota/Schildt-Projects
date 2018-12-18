package core;

class Account<T,P>{
    private T id;
    private P sum;
    Account(T id, P sum){
        this.id=id;
        this.sum=sum;
    }
    public T getId(){
        return id;
    }

    public P getSum() {
        return sum;
    }
    public P setSum(P sum){
        return this.sum=sum;
    }
}
public class Generics_1 {
    public static void main(String[]args){
        Account<String,Integer> a1=new Account("H232",23);
        System.out.println(a1.getId());
        System.out.println(a1.getSum());
        System.out.println(a1.setSum(324));
        Account<Integer,Double> a2=new Account(12,21.43);
    }
}
