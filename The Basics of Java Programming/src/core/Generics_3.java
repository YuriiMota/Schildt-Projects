package core;
class Acount{
    private String id;
    private int sum;
    <T> Acount(T id, int sum){
       this.id=id.toString();
       this.sum=sum;
    }
    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

public class Generics_3 {
    public static void main(String[]args){
        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

    }
}
