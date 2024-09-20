import java.util.Random;
import java.util.Scanner;

public class ex_rps {
  public static void main(String[] args) {
    int comrps;
    String myrps;

    Random random = new Random();
    try (Scanner scanner = new Scanner(System.in)) {
      comrps = random.nextInt(3) + 1; // 1~3출력, 1:가위 2:바위 3:보

      System.out.print("나의 rock/paper/scissors (영어로 입력해 주세요) ==> "); //한글로 입력받으니 에러가 발생해 영어로 입력받게 함
      myrps = scanner.nextLine();

      switch (myrps) {
        case "scissors":
          switch (comrps) {
            case 1 ->  System.out.print("컴퓨터는 가위를 냈습니다. 비겼습니다.");
            case 2 -> System.out.print("컴퓨터는 바위를 냈습니다. 졌습니다.");
            case 3 -> System.out.print("컴퓨터는 보를 냈습니다.");
            default -> System.out.print("잘못된 입력입니다.");
          }
          break;
        case "rock":
          switch (comrps) {
            case 1 -> System.out.print("컴퓨터는 가위를 냈습니다. 이겼습니다.");
            case 2 -> System.out.print("컴퓨터는 주먹을 냈습니다. 비겼습니다.");
            case 3 -> System.out.print("컴퓨터는 보를 냈습니다. 졌습니다.");
            default -> System.out.print("잘못된 입력입니다.");
          }
          break;
        case "paper":
          switch (comrps) {
            case 1 -> System.out.print("컴퓨터는 가위를 냈습니다. 졌습니다.");
            case 2 -> System.out.print("컴퓨터는 주먹을 냈습니다. 이겼습니다.");
            case 3 -> System.out.print("컴퓨터는 보를 냈습니다. 비겼습니다.");
            default -> System.out.print("잘못된 입력입니다.");
          }
          break;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}


