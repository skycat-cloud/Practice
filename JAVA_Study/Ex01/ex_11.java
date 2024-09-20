
import java.util.Scanner;

public class ex_11 {
  public static void main(String[] args) {
    int start, end, increase, subtrack, i, j, height;
    double weight;

    try (Scanner scanner = new Scanner(System.in)){
      System.out.printf("몇 cm 부터:");
      start = scanner.nextInt();

      System.out.printf("몇 cm 까지:");
      end = scanner.nextInt();

      System.out.printf("몇 cm 단위:");
      increase = scanner.nextInt();

      subtrack = end - start; 
      
      System.out.printf("신장 표준체중\n");
      System.out.printf("---------\n");

      if (start >= end) {
        System.out.println("시작 cm는 끝 cm보다 작아야 합니다.");
      }

      if (increase == 0) {
        System.out.println("증가폭은 0이 될 수 없습니다.");
      }

      i = subtrack / increase; //반복횟수

      for(j = 0; j<=i; j++){ //낮은 숫자 부터 출력하기 위해 j=0으로 선언하고 j의 값을 증감
        height = start + (j* increase);
        weight = (height - 100) * 0.9;
        System.out.printf("%dcm %.1fkg\n", height, weight);
      }
    }catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
