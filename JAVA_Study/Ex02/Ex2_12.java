import java.util.Scanner;

public class Ex2_12 {
  public static int rRotate(int x, int n) {
    n = n % 32; // n을 32로 나눈 나머지 제한
    return (x >>> n) | (x << (32 - n)); // 오른쪽 회전
  }

  public static int lRotate(int x, int n) {
    n = n % 32; // n을 32로 나눈 나머지 제한
    return (x << n) | (x >>> (32 - n)); // 왼쪽 회전
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("정수 x를 n비트 회전합니다.");
      System.out.print("x : ");
      int x = scanner.nextInt(); // 사용자로부터 x 입력 받기
      System.out.print("n : ");
      int n = scanner.nextInt(); // 사용자로부터 n 입력 받기

      System.out.println("회전 전");
      System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));

      int rightRotated = rRotate(x, n);
      System.out.println("오른쪽 회전 =");
      System.out.println(String.format("%32s", Integer.toBinaryString(rightRotated)).replace(' ', '0'));

      int leftRotated = lRotate(x, n);
      System.out.println("왼쪽 회전 =");
      System.out.println(String.format("%32s", Integer.toBinaryString(leftRotated)).replace(' ', '0'));
    }
  }
}
