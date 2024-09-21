
import java.util.Scanner;

public class Ex2_15 {
  static Scanner scanner = new Scanner(System.in);
  public static int sumOf(int[] a){
    int num1, sum;
    sum = 0;
    for(int i = 0; i < a.length; i++){
      System.out.printf("x[%d]: ", i);
      num1 = scanner.nextInt();
      a[i] = num1;
      sum += num1;
    }
    return sum;
  }
  public static void arrLength(){
    int i;
  
    System.out.print("요소 수: ");
    i = scanner.nextInt();
    int[] arr = new int[i];

    System.out.printf("요소의 모든 합은 %d 입니다.", sumOf(arr));
  }

  public static void main(String[] args) {
    arrLength();
  }
}
