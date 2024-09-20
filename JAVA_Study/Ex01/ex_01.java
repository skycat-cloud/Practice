import java.util.Scanner;

public class ex_01{
  public static void main(String[] args) {
    int num1;

      try(Scanner scanner = new Scanner(System.in)){
        do {
          System.out.print("세 자리의 정숫값: ");
            num1 = scanner.nextInt();
        } while (num1<100 || num1>999);
        System.out.println("입력한 값은 " + num1 + " 입니다.");
      }catch (Exception e) {
        System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
    }
  }
}