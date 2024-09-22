
import java.util.Scanner;

public class Ex2_31 {
  public static int absolute(int x) {
    x = Math.abs(x);
    return x;
  }

  public static long absolute(long x) {
    x = Math.abs(x);
    return x;
  }

  public static float absolute(float x) {
    x = Math.abs(x);
    return x;
  }

  public static double absolute(double x) {
    x = Math.abs(x);
    return x;
  }
  
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("int 형 정수 a의 값: ");
      int a = scanner.nextInt();

      System.out.print("long 형 정수 b의 값: ");
      long b = scanner.nextLong();

      System.out.print("float 형 실수 c의 값: ");
      float c = scanner.nextFloat();

      System.out.print("double 형 실수 d의 값: ");
      double d = scanner.nextDouble();

      System.out.println("a의 절댓값은: "+ absolute(a) + "입니다.");
      System.out.println("b의 절댓값은: "+ absolute(b) + "입니다.");
      System.out.println("c의 절댓값은: "+ absolute(c) + "입니다.");
      System.out.println("d의 절댓값은: "+ absolute(d) + "입니다.");
    }
  }
}