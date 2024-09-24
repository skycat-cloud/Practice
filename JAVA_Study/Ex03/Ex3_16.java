import java.util.Random;
import java.util.Scanner;

public class Ex3_16 {
  static int num;

  public static void arrEnter() {
    System.out.print("요소 수: ");
    try (Scanner scanner = new Scanner(System.in)) {
      num = scanner.nextInt();
      int[] arr1 = new int[num];
      for (int i = 0; i < arr1.length; i++) {
        System.out.print("a[" + i + "] = ");
        arr1[i] = scanner.nextInt();
      }
      arrShuffle(arr1);
    }
  }

  public static void arrShuffle(int[] arr1) {
    Random random = new Random();
    for (int i = arr1.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      int temp = arr1[i];
      arr1[i] = arr1[j];
      arr1[j] = temp;
    }
    arrDisplay(arr1);
  }

  public static void arrDisplay(int[] arr1) {
    System.out.println("요소를 섞었습니다.");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("a[" + i + "] = " + arr1[i]);
    }
  }

  public static void main(String[] args) {
    arrEnter();
  }
}

