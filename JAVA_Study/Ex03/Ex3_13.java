import java.util.Random;
import java.util.Scanner;

public class Ex3_13 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String[] dayEnglish = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
    String[] dayKorean = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
    Random random = new Random();
    
    System.out.println("요일명을 영어 소문자로 입력하시오.");

    int i = random.nextInt(7);

    while (true) {
      System.out.print(dayKorean[i] + ": ");
      String week = scanner.nextLine();

      if(week.equals(dayEnglish[i])){
        System.out.print("정답입니다.");
        break;
      }
      
      System.out.print("다시 한번? 1...재입력/0...정답 보기: ");
      int rt = scanner.nextInt();
      scanner.nextLine();

      if (rt == 0) {
        System.out.println(dayKorean[i] + "은 '" + dayEnglish[i] + "'입니다.");
        System.out.print("다시 한번? 1...Yes/0...No: ");
        if (scanner.nextInt() == 0) {
          break;
        }
        scanner.nextLine();
      }
    }
  }
}
