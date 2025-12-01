public class Main {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        for (int n = number; n > 0; n /= 10) {   // уменьшаем число через for
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789)); // → 20 (2+4+6+8)
        System.out.println(getEvenDigitSum(252));        // → 4  (2+2)
        System.out.println(getEvenDigitSum(-22));        // → -1
    }
}