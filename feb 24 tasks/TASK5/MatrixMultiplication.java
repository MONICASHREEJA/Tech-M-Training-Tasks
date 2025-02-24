import java.util.Random;

class MatrixMultiplierThread extends Thread {
    private int[][] A, B, result;
    private int row, col, size;

    public MatrixMultiplierThread(int[][] A, int[][] B, int[][] result, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += A[row][i] * B[i][col];
        }
        result[row][col] = sum;
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        int size = 3; 
        int[][] A = generateMatrix(size);
        int[][] B = generateMatrix(size);
        int[][] result = new int[size][size];

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        Thread[][] threads = new Thread[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j] = new MatrixMultiplierThread(A, B, result, i, j, size);
                threads[i][j].start();
            }
        }

     
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }

  
    private static int[][] generateMatrix(int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }

   
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
