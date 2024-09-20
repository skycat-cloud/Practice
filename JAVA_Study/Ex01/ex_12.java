
import java.util.Scanner;

public class ex_12 {
  public static void main(String[] args) {
    int num1, mup;
    try (Scanner scanner = new Scanner(System.in)){
      System.out.print("정숫값:");
      num1 = scanner.nextInt();
      for(int i = 1; i <= num1; i++){
        mup = i * i;
        System.out.printf("%d의 제곱은 %d입니다.\n", i, mup);
      }
    }catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
