
import java.util.Random;
import java.util.Scanner;

public class ex_quiz {
  public static void main(String[] args) {
    int comnum1, usernum1;
    int count = 1;
    Random random = new Random();

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        comnum1 = random.nextInt(5) + 1;
        boolean correctGuess = false;

        while (!correctGuess) {
          System.out.printf("게임 %d회, 컴퓨터가 생각한 숫자는? : ", count);
          usernum1 = scanner.nextInt();
          
          if (usernum1 != comnum1) {
            System.out.printf("아까워요. %d이었습니다. 다시 해보세요\n", comnum1);
          }
          else {
            System.out.println("맞혔네요. 축하합니다!!");
            correctGuess = true;
          }
          count++;
        }
        System.out.print("게임을 마칩니다.");
        break;
      }
    } catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}

