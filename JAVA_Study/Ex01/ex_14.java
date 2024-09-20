
import java.util.Scanner;

public class ex_14 {
  public static void main(String[] args) {
    int num1, j;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("정방형을 표시합니다.");
      System.out.print("단수는:");
      num1 = scanner.nextInt();

      j = 1;

      do {
        for(int i = 1; i <= num1; i++){
          System.out.print("*");
        }
        j++;
        System.out.println("");
      } while (j<=num1);
      
    } catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
