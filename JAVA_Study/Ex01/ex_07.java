import java.util.Scanner;

public class ex_07 {
  public static void main(String[] args) {
    long num1, num2;
    int count;

    System.out.println("양의 정숫값의 자릿수를 표시합니다.");

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("양의 정숫값: ");
      num1 = scanner.nextLong();
      num2 = num1;
        
      if (num2 < 0) {
        System.out.println("양의 정수를 입력해 주세요");
      }
      count = 0;
        
      if (num2 / 10 < 1) {
        System.out.println("입력한 숫자는 1자리입니다.");
      }
      else {
        while (num1 > 0) {
          num1 = num1 / 10;
          count++;
        }
        System.out.printf("입력한 숫자는 %d자리입니다.\n", count);
      }      
    } catch (Exception e) {
      System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
    }
  }
}
