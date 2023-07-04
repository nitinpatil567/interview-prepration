package java_basics;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    float getAverage(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum/3;
    }

    public static void main(String[] args) {
        AverageOfThreeNumbers averageOfThreeNumbers = new AverageOfThreeNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers each at new line");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float avg = averageOfThreeNumbers.getAverage(num1, num2, num3);
        System.out.println("Average of three numbers is " + avg);
    }
}
