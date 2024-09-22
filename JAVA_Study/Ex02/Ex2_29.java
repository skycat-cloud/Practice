import java.util.Scanner;

public class Ex2_29 {
  public static int[][] arrayClone2(int[][] a) {
    if (a == null || a.length == 0) return null;
    
    int[][] clone = new int[a.length][];
    
    for (int i = 0; i < a.length; i++) {
      clone[i] = new int[a[i].length];
      System.arraycopy(a[i], 0, clone[i], 0, a[i].length);
    }
    
    return clone;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("행렬의 행 수: ");
    int rows = scanner.nextInt();
    System.out.print("행렬의 열 수: ");
    int cols = scanner.nextInt();

    int[][] a = new int[rows][cols];

    System.out.println("행렬a");
    inputMatrix(scanner, a);

    int[][] clonedArray = arrayClone2(a);

    System.out.println("\n행렬a:");
    printMatrix(a);

    System.out.println("복사된 행렬:");
    printMatrix(clonedArray);

    scanner.close();
  }

  public static void inputMatrix(Scanner scanner, int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.printf("a[%d][%d]: ", i, j);
        matrix[i][j] = scanner.nextInt();
      }
    }
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}