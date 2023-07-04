package java_basics;

/*
        int[][] matrix = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0}
        };
        For above matrix cell at (0, 0), nearest 1 is at (0, 3).
        So distance = (0 – 0) + (3 – 0) = 3.
        For above matrix cell at (1, 1), nearest 1 is at (1, 2).
        So distance = (1 – 1) + (2 – 1) = 1.
        Expected Output is
        int[][] matrix = {
                {3, 2, 1, 0},
                {2, 1, 0, 0},
                {1, 0, 0, 1}
        };
         */

public class FindNearestOneForZero {
    int[][] getNearestDistance(int[][] matrix, int rows, int columns) {
        int[][] ans = new int[rows][columns];

        //Assign answer matrix with highest integer values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
//                if (matrix[i][j] == 1) {
                ans[i][j] = Integer.MAX_VALUE;
//                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Traversing whole matrix to find minimum distance
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < columns; l++) {
                        if (matrix[k][l] == 1) {
                            int path = Math.abs(i - k) + Math.abs(j - l);
                            int minPath = Math.min(ans[i][j], path);
                            ans[i][j] = minPath;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        //Input
        int[][] matrix = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0}
        };
        FindNearestOneForZero findNearestOneForZero = new FindNearestOneForZero();
        int[][] newMatrix = findNearestOneForZero.getNearestDistance(matrix, rows, columns);
        System.out.println("New matrix is ");
        //Rows
        for (int i = 0; i < rows; i++) {
            //Columns
            for (int j = 0; j < columns; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
