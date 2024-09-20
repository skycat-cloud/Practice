import java.util.Scanner;

public class ex_born {
  public static void main(String[] args) {
    // 띠 배열
    String[] zodiacSigns = {
      "원숭이", "닭", "개", "돼지", "쥐", "소", 
      "호랑이", "토끼", "용", "뱀", "말", "양"
    };

    // 사용자로부터 출생 연도 입력받기
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("출생 연도를 입력해 주세요: ");
      int birthYear = scanner.nextInt();

      // 띠 계산
      int index = birthYear % 12;
      String zodiac = zodiacSigns[index];

      // 결과 출력
      System.out.println("출생 년도 " + birthYear + "의 띠는 " + zodiac + "입니다.");
    } catch (Exception e) {
      System.out.println("유효하지 않은 입력입니다. 숫자를 입력해 주세요.");
    }
  }
}

