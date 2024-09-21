import java.util.Scanner;

public class Ex2_18 {
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
    System.out.print("삭제할 요소의 인덱스: ");
    int delIdx = scanner.nextInt();

    aryRmv(arr, delIdx);
  }

  public static void aryRmv(int[] a, int idx) {
    if (idx < 0 || idx >= a.length) {
      System.out.println("인덱스 값이 범위를 벗어났습니다. 다시 시도해 주세요.");
      System.exit(0);
    }

    // 인덱스 뒤의 요소를 앞으로 이동
    for (int i = idx; i < a.length - 1; i++) { //마지막 요소는 그대로 남아있음
      a[i] = a[i + 1];
    }

    // 배열 출력
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
  }

  public static void main(String[] args) {
    arrLength();
  }
}

