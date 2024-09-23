import java.util.Scanner;

public class Ex3_06_2 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("생성할 2차원 배열의 개수를 입력하세요: ");
      int numOfArrays = scanner.nextInt();

      int[][][] arrays = new int[numOfArrays][][];

      for (int n = 0; n < numOfArrays; n++) {
        System.out.println("\n" + (n + 1) + "번째 배열:");

        System.out.print("행 수 입력: ");
        int rows = scanner.nextInt();
        System.out.print("열 수 입력: ");
        int cols = scanner.nextInt();

        arrays[n] = new int[rows][cols];

        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
            System.out.print("array[" + i + "][" + j + "] = ");
            arrays[n][i][j] = scanner.nextInt();
          }
        }
      }

      System.out.println("\n출력 결과:");
      for (int n = 0; n < numOfArrays; n++) {
        System.out.println("\n" + (n + 1) + "번째 배열:");
        for (int i = 0; i < arrays[n].length; i++) {
          for (int j = 0; j < arrays[n][i].length; j++) {
            System.out.print(arrays[n][i][j] + " ");
          }
          System.out.println();
        }
      }
    }
  }
}


