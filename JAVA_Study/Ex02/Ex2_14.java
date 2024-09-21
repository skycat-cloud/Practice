import java.util.Scanner;

public class Ex2_14 {
  
  // pos번째 비트부터 n개의 비트를 1로 설정
  public static int setN(int x, int pos, int n) {
    return x | (((1 << n) - 1) << pos);
  }

  // pos번째 비트부터 n개의 비트를 0으로 리셋
  public static int resetN(int x, int pos, int n) {
    return x & ~(((1 << n) - 1) << pos);
  }

  // pos번째 비트부터 n개의 비트를 반전
  public static int inverseN(int x, int pos, int n) {
    return x ^ (((1 << n) - 1) << pos);
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("정수 x의 pos번째 비트부터 n개의 비트를 변경합니다.");

      System.out.print("x: ");
      int x = scanner.nextInt();

      System.out.print("pos: ");
      int pos = scanner.nextInt();

      System.out.print("n: ");
      int n = scanner.nextInt();

      System.out.println("x = " + Integer.toBinaryString(x));
      System.out.println("setN(x, pos, n) = " + Integer.toBinaryString(setN(x, pos, n)));
      System.out.println("resetN(x, pos, n) = " + Integer.toBinaryString(resetN(x, pos, n)));
      System.out.println("inverseN(x, pos, n) = " + Integer.toBinaryString(inverseN(x, pos, n)));
    }
  }
}
