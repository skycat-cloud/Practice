
import java.util.Scanner;

public class ex_08 {
  public static void main(String[] args) {
  int num1, sum, tem;
  sum = 1;

    System.out.print("양의 정숫값: ");

    try(Scanner scanner = new Scanner(System.in)){
      num1 = scanner.nextInt();
      tem = num1;
      
      while(num1>=1){
        sum = num1 * sum;
        num1--;
      }
      System.out.printf("1부터 %d 까지의 곱은 %d입니다.", tem, sum);
    }catch (Exception  e1){
      System.out.println("문제가 발생하였습니다. 프로그램을 종료합니다.");
    }
  }
}
