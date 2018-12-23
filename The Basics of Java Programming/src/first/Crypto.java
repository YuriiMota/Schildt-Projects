package first;

public class Crypto {
    public static void main(String args[]) {
        String S = "okko";
        int n =S.length();
        String Mas[]=new String[n];
        String S1=S;
        for(int i=0;i<S.length();i++) {

            Mas[i]=S1.substring(i, S1.length())+S1.substring(0,i);
            System.out.println(Mas[i]);

        }
        String buf;

        for(int k=n-1;k>0;k--){
            for(int i=0;i<k;i++ ) {
                if (Mas[i].compareTo(Mas[i+1])>0) {
                    buf=Mas[i];
                    Mas[i]=Mas[i+1];
                    Mas[i+1]=buf;

                }
            }
        }
        System.out.println("Sorted");
        System.out.println();
        for(int i=0;i<S.length();i++) {
            if (Mas[i].equals(S)) n=i;
            System.out.println(Mas[i]);

        }
        System.out.println(n+1);
        System.out.println("last letters");
        for(int i=0;i<S.length();i++) {
            System.out.print(Mas[i].charAt(S.length()-1));

        }

    }

}
