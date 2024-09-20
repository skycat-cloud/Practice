
import java.util.Scanner;

public class Ex3_03 {
  static int[][] arr = new int[2][2];
  static int score1, score2;
  static double avg;

  public static void enterScore(){
    try (Scanner scanner = new Scanner(System.in)) {
      for(int i = 0; i < 2; i++){
        arr[i][0] = (i + 1);
        System.out.println("학생번호"+arr[i][0]);
          for(int j = 0; j < 1; j++){
            System.out.print("국어점수 : ");
            score1 = scanner.nextInt();
            arr[i][j] = score1;

            System.out.print("수학점수 : ");
            score2 = scanner.nextInt();
            arr[i][j+1] = score2;
        }
      }
    }
  }

  public static void displayScore(){
    for(int i = 0; i < 2; i++){
      System.out.printf("학생번호 %d\n", i+1);
      for(int j = 0; j < 1; j++){
        avg = (arr[i][j] + arr[i][j+1]) / 2;
        System.out.printf("국어:%d 수학:%d 평균:%.1f\n", arr[i][j], arr[i][j+1], avg);
      }
    }
  }

  public static void main(String[] args) {
    enterScore();
    displayScore();
  }
}
