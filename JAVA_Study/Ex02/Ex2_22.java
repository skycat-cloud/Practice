import java.util.Scanner;

public class Ex2_22 {
  static Scanner scanner = new Scanner(System.in);

  public static void arrLength() {
    System.out.print("요소 수: ");
    int length = scanner.nextInt();
    int[] a = new int[length];

    for (int i = 0; i < a.length; i++) {
      System.out.printf("x[%d]: ", i);
      a[i] = scanner.nextInt();
    }

    int[] b = arrayClone(a);

    System.out.println("배열 x를 복사하여 배열 y를 생성했습니다.");
    printArray(b);
  }

  public static int[] arrayClone(int[] a) {
    int[] newArray = new int[a.length];
      System.arraycopy(a, 0, newArray, 0, a.length);
    return newArray;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("y[" + i + "] = " + arr[i]);
    }
  }

  public static void main(String[] args) {
    arrLength();
  }
}
