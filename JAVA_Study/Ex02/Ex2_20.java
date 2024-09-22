import java.util.Scanner;

public class Ex2_20 {
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

    System.out.print("삽입할 요소의 인덱스: ");
    int insIdx = scanner.nextInt();

    System.out.print("삽입할 값: ");
    int x = scanner.nextInt();

    arrIns(arr, insIdx, x);
  }

  public static void arrIns(int[] a, int idx, int x) {
    if (idx < 0 || idx >= a.length) {
      System.out.println("인덱스 값이 잘못되었습니다.");
      return;
    }

    // 삽입할 위치부터 끝까지 요소들을 뒤로 이동
    for (int i = a.length - 1; i > idx; i--) {
      a[i] = a[i - 1];
    }
    
    // 지정된 위치에 x 삽입
    a[idx] = x;

    // 결과 출력
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
  }

  public static void main(String[] args) {
    arrLength();
  }
}