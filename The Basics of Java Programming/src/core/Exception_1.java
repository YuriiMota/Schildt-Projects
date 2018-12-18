package core;
class NumEx{

}
public class Exception_1 {
    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("The number is less than 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
    public static void main(String args[]) {
        int i = 5;
        try {

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}