
import java.util.Scanner;

public class ex_09 {
  public static void main(String[] args) {
    int num1, num2;

    System.out.println("카운트업 합니다.");
    System.out.print("양의 정숫값:");
    try(Scanner scanner = new Scanner(System.in)){
      num1 = scanner.nextInt();

        if(num1<0){
          System.out.println("양의 정수를 입력해 주세요");
        }

      for(int i = 0; i<=num1; i++)
      {
        num2 = i-1;

        if(num2>=0){
          System.out.printf("%d\n", num2);
            if(num2+1 == num1) //마지막 카운트는 띄어쓰기가 없으므로 if문을 추가함.
            {
              System.out.printf("%d", num1);
            }
        }
        else if(num1 == 0)
        {
          System.out.printf("0");
        }
      }
    }catch (Exception e) {
      System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
    }
  }
}
