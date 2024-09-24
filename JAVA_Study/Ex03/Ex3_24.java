
import java.util.Scanner;

public class Ex3_24 {
  public static int max(int x, int y){
    int result;

    if(x > y){
      result = x;
    }
    else{
      result = y;
    }
    return result;
  }
  public static void main(String[] args) {
    int x, y;
    System.out.println("크기를 비교할 두 수를 입력해 주세요: ");
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("x의 값: ");
      x = scanner.nextInt();
      System.out.print("y의 값: ");
      y = scanner.nextInt();
    }
    
    System.out.printf("%d(와)과 %d의 수 중 %d(이)가 큽니다.", x, y, max(x, y));
  }
}
