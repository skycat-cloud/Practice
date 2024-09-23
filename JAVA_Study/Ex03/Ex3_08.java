
import java.util.Scanner;

public class Ex3_08 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("학급 수: ");
      int numOfClasses = scanner.nextInt();

      int[][][] scores = new int[numOfClasses][][];

      inputScores(scanner, scores);
      printClassSumsAndAverages(scores);
    }
  }

  public static void inputScores(Scanner scanner, int[][][] scores) {
    for (int n = 0; n < scores.length; n++) {

      System.out.print("\n" + (n + 1) + "반의 학생 수: ");
      int row = scanner.nextInt();
      int col = 1;

      scores[n] = new int[row][col];

      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          System.out.print((n + 1) + "반 " + (i + 1) + "번의 점수: ");
          scores[n][i][j] = scanner.nextInt();
        }
      }
    }
  }

  public static void printClassSumsAndAverages(int[][][] scores) {
    int totalSum = 0;
    int totalStu = 0;

    System.out.println("\n반  |  합계  평균");
    System.out.println("---+-----------");

    for (int n = 0; n < scores.length; n++) {
      int sum = 0;
      int studentCount = scores[n].length;

      for (int i = 0; i < studentCount; i++) {
        sum += scores[n][i][0];
      }

      double average = (double) sum / studentCount;
      System.out.printf("%d반 | %d  %.2f%n", n + 1, sum, average);

      totalSum += sum;
      totalStu += studentCount;
    }

    double overallAverage = (double) totalSum / totalStu;

    System.out.println("---+-----------");
    System.out.printf("합 | %d  %.2f%n", totalSum, overallAverage);
  }
}


