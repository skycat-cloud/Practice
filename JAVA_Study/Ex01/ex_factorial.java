
import java.util.Scanner;

public class ex_factorial {
  public static void main(String[] args) {
    System.out.println("n명의 학생들을 순서대로 세우는 경우의 수");

    int num1;
    int result = 1;

    System.out.print("학생 수를 입력하세요.");

    try(Scanner scanner = new Scanner(System.in)){
      num1 = scanner.nextInt();
      if(num1 > 0){
        for(; num1 >= 1; num1--){
          result = num1 * result;
        }
        System.out.printf("결과는 %d 입니다.", result);
      }
      else {
        System.out.print("1보다 큰 정수를 입력하세요.");
      }
    }
  }
}
