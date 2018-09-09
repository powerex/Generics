package test;

public class Gray {

    private static final int N = 5;
    private static final int I = 1 << N;


    public static String toBinary(int n) {
        StringBuilder s = new StringBuilder(Integer.toBinaryString(n));
        int i = N - s.toString().length();
        for (int j=0; j<i; j++)
            s.insert(0, "0");
        return s.toString();
    }

    public static void showCodes() {
        int n = 0;
        for (int i=0; i<I; i++) {
            n = i ^ (i >> 1);
            System.out.println(toBinary(n) + " " + n);;
        }
    }

    public static void main(String[] args) {
        Gray.showCodes();
    }

}
