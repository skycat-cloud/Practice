
import java.util.Scanner;

public class Ex2_02 {
  public static int min(int a, int b, int c) {
    int minNum = a;
    if (b < minNum) {
      minNum = b;
    }

    if (c < minNum) {
        minNum = c;
    }
    return minNum;
  }

  public static void enterNum() {
    int a, b, c;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("정수 a: ");
      a = scanner.nextInt();

      System.out.print("정수 b: ");
      b = scanner.nextInt();

      System.out.print("정수 c: ");
      c = scanner.nextInt();
    }

    int minReturn = min(a, b, c);
    System.out.printf("최솟값은 %d입니다.", minReturn);
  }

  public static void main(String[] args) {
    enterNum();
  }
}

