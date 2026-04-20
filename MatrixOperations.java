import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int sum[][] = new int[r][c];
        int sub[][] = new int[r][c];
        int mul[][] = new int[r][c];

        
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

    
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        System.out.println("\nMatrix Addition:");
        display(sum, r, c);

        
        System.out.println("\nMatrix Subtraction:");
        display(sub, r, c);

        
        System.out.println("\nMatrix Multiplication:");
        display(mul, r, c);

        
        System.out.println("\nTranspose of Matrix A:");
        transpose(A, r, c);

        sc.close();
    }

    
    static void display(int M[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int M[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(M[j][i] + " ");
            }
            System.out.println();
        }
    }
}