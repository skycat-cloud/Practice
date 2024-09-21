import java.util.Scanner;

public class Ex2_19 {
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

    System.out.print("삭제할 요소의 시작 인덱스: ");
    int delIdx = scanner.nextInt();

    System.out.print("삭제할 요소의 수: ");
    int n = scanner.nextInt();

    aryRmv(arr, delIdx, n);
  }

  public static void aryRmv(int[] a, int idx, int n) {
    if (idx < 0 || idx >= a.length || idx + n > a.length) {
      System.out.println("인덱스 값 또는 범위가 잘못되었습니다.");
      return;
    }

    // 삭제할 요소 이후의 요소들을 앞으로 이동
    for (int i = idx; i < a.length - n; i++) {
      a[i] = a[i + n];
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
  }

  public static void main(String[] args) {
    arrLength();
  }
}

