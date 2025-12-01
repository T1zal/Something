public class Main2 {

    public static int reverse(int number) {
        int result = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        for (int n = number; n > 0; n /= 10) {
            result = result * 10 + n % 10;
        }

        return result * sign;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;

        int count = 0;
        for (int n = number; n > 0; n /= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int originalCount = getDigitCount(number);
        int reversedCount = getDigitCount(reversed);

        for (int n = reversed; n > 0; n /= 10) {
            int digit = n % 10;
            if (digit == 0) System.out.print("Zero ");
            else if (digit == 1) System.out.print("One ");
            else if (digit == 2) System.out.print("Two ");
            else if (digit == 3) System.out.print("Three ");
            else if (digit == 4) System.out.print("Four ");
            else if (digit == 5) System.out.print("Five ");
            else if (digit == 6) System.out.print("Six ");
            else if (digit == 7) System.out.print("Seven ");
            else if (digit == 8) System.out.print("Eight ");
            else if (digit == 9) System.out.print("Nine ");
        }

        for (int i = 0; i < originalCount - reversedCount; i++) {
            System.out.print("Zero ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}