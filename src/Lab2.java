import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array.length);

        array[0] = 1;
        System.out.println(array[0]);
//        System.out.println(array[3]);

        int[][] matrix = new int [2][3];
        matrix[1][1] = 2;
        System.out.println(matrix[1][1]);

        int[][] matrix2 = {
                {1, 2},
                {4, 5, 6}
        };
//        matrix2[2][0] = 1;

        for (int[] row : matrix2) {
            for (int j = 0; j < row.length; j++) {
                System.out.println();
            }
        }
//        int[][]
        /*Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println(
                    scanner.nextLine());
        }*/
    }
}
