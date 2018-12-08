package Thread;

public class Thread_1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t);
    }
}
