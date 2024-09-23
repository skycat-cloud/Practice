import java.util.Scanner;

public class Ex3_09 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("행 수: ");
      int row = scanner.nextInt();

      int[][] arr1 = new int[row][];

      for (int i = 0; i < row; i++) {
        System.out.print(i + "행의 열 수: ");
        int col = scanner.nextInt();
        arr1[i] = new int[col];
      }

      System.out.println("각 요소의 값을 입력하세요.");
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < arr1[i].length; j++) {
          System.out.print("c[" + i + "][" + j + "]: ");
          arr1[i][j] = scanner.nextInt();
        }
      }

      System.out.println("\n배열 c의 요소 값은 다음과 같습니다:");
      for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr1[i].length; j++){
          System.out.print(arr1[i][j] + " ");
        }
        System.out.println("");
      }
    }
  }
}

