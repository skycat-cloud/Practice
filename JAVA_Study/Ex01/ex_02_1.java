import java.util.Scanner;

public class ex_02_1 {
  public static void main(String[] args) {
          int num1 = (int) (Math.random() * 89) +10; //num1은 2자리 랜덤 정수
    int num2, limit; // num2는 입력받은 값, limit는 제한 횟수
      
    System.out.println("숫자 맞추기 게임 시작!");
    System.out.println("10부터 99사이의 숫자를 맞추세요");

    try(Scanner scanner = new Scanner(System.in)){
      System.out.print("횟수를 설정하세요. 횟수 초과 시 정답이 표시되고 게임이 종료됩니다. 횟수: ");
      limit = scanner.nextInt();

      do { 
        System.out.print("어떤 숫자일까요?: ");
        num2 = scanner.nextInt();
  
        if(num1 < num2){
          System.out.println("더 작은 숫자입니다.");
        }
        else if(num1 > num2){
          System.out.println("더 큰 숫자입니다.");
        }
        if(limit==1)
        {
          System.out.println("정답은 " +num1+ "입니다. 게임을 종료합니다.");
        }
        limit--;
      } while (num1 != num2);
      System.out.println("정답입니다.");
    } catch (Exception  e1){
      System.out.println("문제가 발생하였습니다. 프로그램을 종료합니다.");
    }
  } 
}

