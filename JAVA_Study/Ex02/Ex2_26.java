import java.util.Scanner;

public class Ex2_26 {
  static Scanner scanner = new Scanner(System.in);

  public static void arrLength() {
    System.out.print("요소 수: ");
    int length = scanner.nextInt();
    int[] arr = new int[length];

    arrEnter(arr);
  }

  public static void arrEnter(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("a[%d]: ", i);
      arr[i] = scanner.nextInt();
    }

    System.out.print("삽입할 인덱스: ");
    int insIdx = scanner.nextInt();

    System.out.print("삽입할 값: ");
    int x = scanner.nextInt();

    int[] result = arrayInsOf(arr, insIdx, x);

    for (int i = 0; i < result.length; i++) {
      System.out.println("a[" + i + "] = " + result[i]);
    }
  }

  public static int[] arrayInsOf(int[] a, int idx, int x) {
    if (idx < 0 || idx > a.length) {
      System.out.println("인덱스 값이 잘못되었습니다.");
      return a;
    }

    // 새로운 배열의 크기 계산
    int newLength = a.length + 1;
    int[] newArray = new int[newLength];

    // idx 이전 배열 복사
    System.arraycopy(a, 0, newArray, 0, idx);

    // x 삽입
    newArray[idx] = x;

    // idx 이후의 배열 복사
    System.arraycopy(a, idx, newArray, idx + 1, a.length - idx);

    return newArray;
  }
  
  public static void main(String[] args) {
    arrLength();
  }
}