
import java.util.Scanner;

public class Ex2_03 {
  public static int med(int a, int b, int c) {
    int medNum;
    if ((a >= b && a <= c) || (a <= b && a >= c)) {
    medNum = a;
    }

    else if ((b >= a && b <= c) || (b <= a && b >= c)) {
    medNum = b;
    }

    else {
      medNum = c;
    }

    return medNum;
  }

  public static int enterNum() {
    int a, b, c;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("정수 a: ");
      a = scanner.nextInt();

      System.out.print("정수 b: ");
      b = scanner.nextInt();

      System.out.print("정수 c: ");
      c = scanner.nextInt();
    }
    return med(a, b, c);
  }

  public static void main(String[] args) {
    int medNum = enterNum();
    System.out.printf("중간값은 %d 입니다.%n", medNum);
  }
}
