public class CombinationExample {

    public static long factorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        return result;
    }

    public static long combination(int r, int n) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {

        int r = 2;
        int n = 5;

        long result = combination(r, n);

        System.out.println("Combination = " + result);
 
    }
}

