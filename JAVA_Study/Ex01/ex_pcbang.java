import java.time.LocalTime;
import java.util.Scanner;

public class ex_pcbang {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          Thread.sleep(1000);
          LocalTime now = LocalTime.now();
          int hour = now.getHour();
          int minute = now.getMinute();
          int second = now.getSecond();
          System.out.printf("현재 시간은 %d시 %d분 %d초 입니다.\n", hour, minute, second);
          
          int hour1 = 23; // 심야 시간대 테스트용으로 hour1 변수 생성함. 원래대

          if (hour1 < 22) {
            System.out.println("심야 시간대가 아닙니다. 청소년도 출입 가능합니다.");
          }
          
          else {
            int age;
            System.out.print("심야 시간대입니다. 청소년은 출입 불가합니다. 만 나이를 입력해주세요 (종료하려면 '999' 입력): ");
            age = scanner.nextInt();

            if (age == 999) {
              System.out.print("프로그램을 종료합니다.");
              System.exit(0);
            }

            try {
              if (age <= 0 || age >= 100) {
                System.out.println("올바른 나이를 입력해 주세요.");
              }
              else if (age > 19) {
                System.out.println("즐거운 시간 보내세요.^^");
                System.out.println("협조 감사합니다.");
              }
              else {
                System.out.println("청소년은 밤 10시 이후 출입을 할 수 없습니다.");
              }
            }
            catch (NumberFormatException e) {
              System.out.println("유효한 나이 입력이 아닙니다. 숫자를 입력해 주세요.");
            }
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
          System.out.println("문제가 발생했습니다."); // 예외 처리
        }
      }
    } catch (Exception e) {
      System.out.println("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}


