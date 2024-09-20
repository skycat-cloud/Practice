import java.util.Scanner;

public class ex_while {
  public static void main(String[] args) {
    int hours, minutes, seconds;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("시 입력: ");
      hours = scanner.nextInt();
      System.out.print("분 입력: ");
      minutes = scanner.nextInt();
      System.out.print("초 입력: ");
      seconds = scanner.nextInt();
    }

    if (hours >= 24 || hours < 0) {
      System.out.println("시간을 잘못 입력하셨습니다.");
      if (minutes >= 60 || minutes < 0) {
        System.out.println("분을 잘못 입력하셨습니다.");
        if (seconds >= 60 || seconds < 0) {
          System.out.println("초를 잘못 입력하셨습니다.");
          System.exit(0);
        }
      }
    }

    // 시계 동작
    while (hours < 24) {
      while (minutes < 60) {
        while (seconds < 60) {
          System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
            try {
            Thread.sleep(1000); // 1초 지연
          } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("문제가 발생했습니다."); // 예외 처리
          }
          // 초 증가
          seconds++;
        }
        // 초가 60이 되면 분을 증가시키고, 초를 0으로 초기화
        seconds = 0;
        minutes++;
      }
        // 분이 60이 되면 시간을 증가시키고, 분을 0으로 초기화
      minutes = 0;
      hours++;
    }
  }
}

