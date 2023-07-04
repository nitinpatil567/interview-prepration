package java_basics;

public class PrintPatternProblems {
    void printRectangle(int n, int m) {
        System.out.println("1. In method printRectangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printHallowRectangle(int n, int m) {
        System.out.println("2. In method printHallowRectangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (m - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void printHalfPyramid(int n) {
        System.out.println("3. In method printHalfPyramid");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printInvertedHalfPyramid(int n) {
        System.out.println("4. In method printInvertedHalfPyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    void printHalfPyramidFromRight(int n) {
        System.out.println("5. In method printHalfPyramidFromRight");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printFloydsTriangle(int n) {
        System.out.println("6. In method printFloydsTriangle");
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    void printZeroOneTriangle(int n) {
        System.out.println("6. In method printZeroOneTriangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintPatternProblems printPatternProblems = new PrintPatternProblems();
        printPatternProblems.printRectangle(5, 45);
        printPatternProblems.printHallowRectangle(5, 45);
        printPatternProblems.printHalfPyramid(5);
        printPatternProblems.printInvertedHalfPyramid(5);
        printPatternProblems.printHalfPyramidFromRight(5);
        printPatternProblems.printFloydsTriangle(5);
        printPatternProblems.printZeroOneTriangle(5);
    }
}
