import java.util.Scanner;

public class Ex3_20 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    getScores();
  }

  public static void getScores() {
    System.out.print("사람 수: ");
    int stu = scanner.nextInt();
    int[] scores = new int[stu];

    for (int i = 0; i < stu; i++) {
      System.out.print((i + 1) + "번의 점수: ");
      scores[i] = scanner.nextInt();
    }
    calculateScores(scores);
  }

  public static void calculateScores(int[] scores) {
    int sum = 0;
    int maxScore = scores[0];
    int minScore = scores[0];

    for (int score : scores) {
      sum += score;
      if (score > maxScore) {
        maxScore = score;
      }
      if (score < minScore) {
        minScore = score;
      }
    }
    double average = (double) sum / scores.length;
    displayResults(sum, maxScore, minScore, average);
  }

  public static void displayResults(int sum, int maxScore, int minScore, double  average) {
    System.out.println("점수 합계는 " + sum + "점입니다.");
    System.out.println("점수 평균은 " + average + "점입니다.");
    System.out.println("최고점은 " + maxScore + "점입니다.");
    System.out.println("최저점은 " + minScore + "점입니다.");
  }
}



