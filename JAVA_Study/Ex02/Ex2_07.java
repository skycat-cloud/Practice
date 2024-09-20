
import java.util.Scanner;

public class Ex2_07 {

  public static void putChar(char c, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(c);
    }
    System.out.println();
  }

  public static void putStart(int n) {
    putChar('*', n);
  }

  public static void printTriangle(int height) {
    for (int i = 1; i <= height; i++) {
      putStart(i);
    }
    System.out.print("");
  }

  public static void enterNum(){
    int num1;
    System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는: ");
    try (Scanner scanner = new Scanner(System.in)) {
      num1 = scanner.nextInt();
    }
    printTriangle(num1);
  }

  public static void main(String[] args) {
    enterNum();
  }
}
