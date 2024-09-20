import java.util.Scanner;

public class Ex3_10 {
  static Scanner scanner = new Scanner(System.in);
  static int[][] arr = new int[6][2];
  static int score1, score2;
  static double avg, avgsumKOR = 0, avgsumMATH = 0;

  public static void enterScore() {
    System.out.println("6명의 국어, 수학 점수를 입력하세요.");
    for (int i = 0; i < 6; i++) {
      System.out.print((i + 1) + "번 ");
      System.out.print("국어 : ");
      score1 = scanner.nextInt();
      arr[i][0] = score1;

      System.out.print("    수학 : ");
      score2 = scanner.nextInt();
      arr[i][1] = score2;
    }
  }

  public static void average() {
    System.out.println("No.  국어  수학  평균");
    for (int i = 0; i < 6; i++) {
      avg = (arr[i][0] + arr[i][1]) / 2.0;
      System.out.printf("%d   %d   %d   %.1f\n", (i + 1), arr[i][0], arr[i][1], avg);
      avgsumKOR += arr[i][0];
      avgsumMATH += arr[i][1];
    }
  }

  public static void display() {
    double korAverage = avgsumKOR / 6;
    double mathAverage = avgsumMATH / 6;
    System.out.printf("국어 평균: %.1f || 수학 평균: %.1f\n", korAverage, mathAverage);
  }

  public static void main(String[] args) {
    enterScore();
    average();
    display();
  }
}






