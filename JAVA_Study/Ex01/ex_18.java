
import java.util.Scanner;

public class ex_18 {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    int num1;
    System.out.print("2이상의 정수값:");
    try (Scanner scanner = new Scanner(System.in)){
    num1 = scanner.nextInt();

    if(num1 == 2){
      System.out.print("소수입니다.");
    }
    else if(num1 <=1){
      System.out.print("2 이상의 정수값을 입력해주세요.");
    }
    if(num1>2){
      for(int i = 2; i<num1; i++){
        if(num1 % i == 0) {
          System.out.print("소수가 아닙니다");
          break;
          }
        else if(num1 % i != 0)
          System.out.print("소수입니다.");
          break;
        }
      }
    }
  }
}
