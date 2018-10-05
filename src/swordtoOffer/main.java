package swordtoOffer;

public class main {
    public static double Power(int exp, double base) {
        int n = Math.abs(exp);
        if (n == 1) {
            return base;
        }
        if (n == 0) {
            return 1;
        }
        double result =Power(exp / 2, base);
        if (exp % 2 == 0) {
            result = result * result;
        } else {
            result = result * base;
        }
        return exp > 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(Power(4, 4));
    }
}
