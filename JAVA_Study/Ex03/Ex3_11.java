
import java.util.Scanner;

public class Ex3_11 {
  public static void ArrAB(){
    try (Scanner scanner = new Scanner(System.in)) {
      int[][] arr4x3 = new int [4][3];
      int[][] arr3x4 = new int [3][4];

      int tmp;
      
      System.out.println("행렬 a의 요소를 입력하세요.");
      for(int i = 0; i < arr4x3.length; i++){
        for(int j = 0; j < arr4x3[i].length; j++){
          System.out.printf("arr4x3[%d][%d]: ", i, j);
          tmp = scanner.nextInt();
          arr4x3[i][j] = tmp;
        }
      }

      System.out.println("행렬 b의 요소를 입력하세요.");
      for(int i = 0; i < arr3x4.length; i++){
        for(int j = 0; j < arr3x4[i].length; j++){
          System.out.printf("arr3x4[%d][%d]: ", i, j);
          tmp = scanner.nextInt();
          arr3x4[i][j] = tmp;
        }
      }
      matrixMUP(arr4x3, arr3x4);
    }
  }

  public static void matrixMUP(int[][] arr4x3, int[][] arr3x4){
    int[][] arr4x4 = new int [4][4];
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 4; j++){
        for(int k = 0; k < 3; k++){
        arr4x4[i][j] += arr4x3[i][k] * arr3x4[k][j];
        }
      }
    }

    System.out.println("행렬 a와 b의 곱");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(arr4x4[i][j] + " ");
        }
        System.out.println();
    }
  }

  public static void main(String[] args) {
      ArrAB();
  }
}
