package core;

public class Lyambda_1 {
    public static void main(String[]args) {
        Operationable operation ;
        operation=(x,y)->x+y;
        int result = operation.calculate(12,14);
        System.out.println(result);
    }
}
interface Operationable{
    int calculate(int x, int y);
}
