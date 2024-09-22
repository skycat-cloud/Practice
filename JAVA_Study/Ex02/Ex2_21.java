import java.util.Scanner;

public class Ex2_21 {
  static Scanner scanner = new Scanner(System.in);

  public static void arrLength() {
    System.out.print("배열 a의 요소 수: ");
    int lengthA = scanner.nextInt();
    int[] a = new int[lengthA];

    for (int i = 0; i < a.length; i++) {
      System.out.printf("a[%d]: ", i);
      a[i] = scanner.nextInt();
    }

    System.out.print("배열 b의 요소 수: ");
    int lengthB = scanner.nextInt();
    int[] b = new int[lengthB];

    for (int i = 0; i < b.length; i++) {
      System.out.printf("b[%d]: ", i);
      b[i] = scanner.nextInt();
    }

    aryExchange(a, b);
  }

  public static void aryExchange(int[] a, int[] b) {
    int minLength = Math.min(a.length, b.length);

    for (int i = 0; i < minLength; i++) {
      int temp = a[i];
      a[i] = b[i];
      b[i] = temp;
    }

    System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      System.out.println("b[" + i + "] = " + b[i]);
    }
  }

  public static void main(String[] args) {
    arrLength();
  }
}
