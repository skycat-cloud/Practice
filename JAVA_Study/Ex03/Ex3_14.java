import java.util.Random;
import java.util.Scanner;

public class Ex3_14 {
  static Scanner scanner = new Scanner(System.in);

  public static void monthGame() {
    String[][] months = { 
      {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
      {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"} 
    };
    randMonth(months);
  }

  public static void randMonth(String[][] months) {
    Random random = new Random();
    String month;
    int lastIndex = -1;
    System.out.println("해당 월의 영어 단어를 입력하시오.");
    System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

    while (true) {
      int i;
      do {
        i = random.nextInt(12);
      } while (i == lastIndex);

      System.out.print(months[1][i] + ": ");
      month = scanner.nextLine();

      if (month.equals(months[0][i])) {
        System.out.print("정답입니다. 다시 한번? 1...Yes/0...No: ");
      } else {
        System.out.print("틀렸습니다. 다시 한번? 1...Yes/0...No: ");
      }

      int yn = scanner.nextInt();
      scanner.nextLine();

      if (yn == 0) {
        break;
      }
      lastIndex = i;
    }
  }

  public static void main(String[] args) {
    monthGame();
  }
}
