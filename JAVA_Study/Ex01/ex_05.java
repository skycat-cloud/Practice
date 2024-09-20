
import java.util.Scanner;

public class ex_05 {
  public static void main(String[] args) {
    int count;
      System.out.print("몇 개의 *을 표시할까요? ");

      try (Scanner scanner = new Scanner(System.in)){
        count = scanner.nextInt();
        if(count != 1){
          for(int i = count; i>=1; i--){
          System.out.print("*");
          if(i == 1){
            System.out.print("\n줄바꿈 문자 출력.");
          }
        }
      }
      else if(count == 1){
        System.out.print("*");
      }
      else{
        System.out.println("오류가 발생했습니다.");
      }
    }
  }
}
