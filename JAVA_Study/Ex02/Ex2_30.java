
import java.util.Scanner;

public class Ex2_30 {
    static int min(int a, int b) {
      return (a < b) ? a : b;
    }

    static int min(int a, int b, int c) {
      int minAB = min(a, b);  // a와 b 중 작은 값
      return min(minAB, c);   // minAB와 c 중 작은 값
    }

    static int min(int[] a) {
      int minVal = a[0];
      for (int i = 1; i < a.length; i++) {
        if (a[i] < minVal) {
          minVal = a[i];
        }
      }
  return minVal;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x, y, z;
    System.out.print("x값: ");
    x = scanner.nextInt();
    System.out.print("y값: ");
    y = scanner.nextInt();
    System.out.print("z값: ");
    z = scanner.nextInt();

    min(x, y);
    min(x, y, z);

    System.out.print("배열 a의 요소 수: ");

    int length = scanner.nextInt();
    int[] arr = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.print("a[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }
    min(arr);

    System.out.println("x, y 의 최솟값은 " + min(x, y) + "입니다.");
    System.out.println("x, y, z 의 최솟값은 " + min(x, y, z) + "입니다.");
    System.out.println("배열의 최솟값은 " + min(arr) + "입니다.");
  }
}
