import java.util.Scanner;

public class Ex2_25 {
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

    System.out.print("삭제를 시작할 인덱스: ");
    int delIdx = scanner.nextInt();

    System.out.print("삭제할 요소의 개수: ");
    int n = scanner.nextInt();

    int[] result = arrayRmvOfN(arr, delIdx, n);
    
    //결과 출력
    for (int i = 0; i < result.length; i++) {
      System.out.println("a[" + i + "] = " + result[i]);
    }
  }

  public static int[] arrayRmvOfN(int[] a, int idx, int n) {
    if (idx < 0 || idx >= a.length || idx + n > a.length) {
      System.out.println("인덱스 값 또는 삭제 범위가 잘못되었습니다.");
      return a;
    }

    //새로운 배열의 크기 계산
    int newLength = a.length - n;
    int[] newArray = new int[newLength];

    //idx 이전 배열 복사
    System.arraycopy(a, 0, newArray, 0, idx);

    //idx + n 이후의 배열 복사
    System.arraycopy(a, idx + n, newArray, idx, newLength - idx);

    return newArray;
  }

  public static void main(String[] args) {
    arrLength();
  }
}
