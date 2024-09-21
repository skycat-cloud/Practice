import java.util.Scanner;

public class Ex2_13 {
  public static int set(int x, int pos) {
    return x | (1 << pos);
  }

  public static int reset(int x, int pos) {
    return x & ~(1 << pos);
  }

  public static int inverse(int x, int pos) {
    return x ^ (1 << pos);
  }
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("정수 x의 pos번째 비트를 변경합니다.");

      System.out.print("x: ");
      int x = scanner.nextInt();

      System.out.print("pos: ");
      int pos = scanner.nextInt();

      System.out.println("x = " + Integer.toBinaryString(x));
      System.out.println("set(x, pos) = " + Integer.toBinaryString(set(x, pos)));
      System.out.println("reset(x, pos) = " + Integer.toBinaryString(reset(x, pos)));
      System.out.println("inverse(x, pos) = " + Integer.toBinaryString(inverse(x, pos)));
      scanner.close();
    }
  }
}
