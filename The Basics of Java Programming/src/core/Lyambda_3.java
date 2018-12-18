package core;

public class Lyambda_3 {
    public static void main(String[] args) {

        Operationable_1<Integer> operation1 = (x, y)-> x + y;
        Operationable_1<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate("20", "10")); //2010
    }
}
interface Operationable_1<T>{
    T calculate(T x, T y);
}

