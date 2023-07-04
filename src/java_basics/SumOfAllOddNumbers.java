package java_basics;

public class SumOfAllOddNumbers {
    int sumOfAllNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 > 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfAllOddNumbers sumOfAllOddNumbers = new SumOfAllOddNumbers();
        int sum = sumOfAllOddNumbers.sumOfAllNumbers(10);
        System.out.println("Sum of all odd numbers is " + sum);
    }
}
