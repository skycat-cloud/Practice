import java.util.Scanner;

public class Ex3_02 {
  static double[] arr = new double[10];
  static double score;
  static double sum = 0;
  static double avg;


  public static void enterArr(){
    System.out.println("10과목 점수를 각각 입력해 주세요");
    try (Scanner scanner = new Scanner(System.in)) {
      for(int i = 0; i < 10; i++) {
        while (true) {
          System.out.print((i + 1) + "번째 점수: ");

          if (scanner.hasNextDouble()) {
            score = scanner.nextDouble();
            arr[i] = score;
            sum = sum + arr[i];
            break;
          }
          
          else {
            System.out.println("유효한 숫자를 입력해 주세요.");
            scanner.next();
          }
        }
      }
    }
  }

  public static void displayArr(){
    avg = sum / 10;
    System.out.printf("합계: %.1f\n", sum);
    System.out.printf("평균: %.2f", avg);
  }

  public static void main(String[] args) {
    enterArr();
    displayArr();
  }
}

