package calculator;

public class Arabian {
    public static int p = 0;
    private int s1;
    private int s2;
    int result;

    public Arabian(int s1, int s2) {
        this.s1 = s1;
        this.s2 = s2;
    }


    public int sum (int s1, int s2) {

            result = s1 + s2;
        return result;
    }

    public int raz (int s1, int s2) {
        result = s1 - s2;
        return result;
    }
    public int del (int s1, int s2) {
        result = s1/s2;
        return result;
    }
    public int umn (int s1, int s2) {
        result = s1*s2;
        return result;
    }

}
