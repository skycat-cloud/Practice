import java.util.Scanner;

public class Ex2_23 {
  static Scanner scanner = new Scanner(System.in);

  public static void arrLength() {
    System.out.print("요소 수: ");
    int length = scanner.nextInt();
    int[] a = new int[length];

    for (int i = 0; i < a.length; i++) {
      System.out.printf("x[%d]: ", i);
      a[i] = scanner.nextInt();
    }

    System.out.print("삭제할 요소의 인덱스: ");
    int idx = scanner.nextInt();

    int[] result = arrayRmv(a, idx);

    for (int i = 0; i < result.length; i++) {
      System.out.println("y[" + i + "] = " + result[i]);
    }
  }

  public static int[] arrayRmv(int[] a, int idx) {
    if (idx < 0 || idx >= a.length) {
      System.out.println("잘못된 인덱스입니다.");
      return a;
    }
    
    int[] result = new int[a.length - 1];
    
    for (int i = 0, j = 0; i < a.length; i++) {
      if (i != idx) {
        result[j++] = a[i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    arrLength();
  }
}
