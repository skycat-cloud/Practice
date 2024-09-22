import java.util.Scanner;

public class Ex2_32 {
  static Scanner scanner = new Scanner(System.in);

  public static void printArray(int[] a){
    System.out.println("1차원 배열 x");
    for(int i = 0; i < a.length; i++){
      System.out.printf("%d ",a[i]);
    }
  }

  public static void printArray(int[][] a) {
    System.out.println("2차원 배열 y");
    int maxWidth = getMaxWidth(a);
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.printf("%-" + maxWidth + "d ", a[i][j]);
        }
        System.out.println();
    }
  }

  public static int getMaxWidth(int[][] a) {
    int maxWidth = 1;
    for (int[] row : a) {
        for (int num : row) {
            int width = String.valueOf(Math.abs(num)).length();
            if (num < 0) width++; // 음수 부호를 위한 추가 공간
            maxWidth = Math.max(maxWidth, width);
        }
    }
    return maxWidth;
  }

  public static int[] arr1LengthAndEnter() {
    System.out.print("1차원 행렬 x의 요소 수: ");
    int length = scanner.nextInt();
    int[] arr1 = new int[length];

    for(int i = 0; i < arr1.length; i++){
        System.out.print("x[" + i + "]: ");
        arr1[i] = scanner.nextInt();
    }
    return arr1;
  }

  public static int[][] arr2LengthAndEnter() {
    System.out.print("2차원 배열 y의 행 수: ");
    int rows = scanner.nextInt();
    int[][] arr2 = new int[rows][];

    for (int i = 0; i < rows; i++) {
        System.out.printf("%d행의 열 수: ", i);
        int cols = scanner.nextInt();
        arr2[i] = new int[cols];

        for (int j = 0; j < cols; j++) {
            System.out.printf("y[%d][%d]: ", i, j);
            arr2[i][j] = scanner.nextInt();
        }
    }
    return arr2;
  }

  public static void main(String[] args) {
    int[] x = arr1LengthAndEnter();
    int[][] y = arr2LengthAndEnter();
    
    System.out.println("\n입력된 배열 출력:");
    printArray(x);
    System.out.println();
    printArray(y);
  }
}
