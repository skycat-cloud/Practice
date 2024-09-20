import java.util.Scanner;

public class ex_02 {
  public static void main(String[] args) {

    int num1 = (int) (Math.random() * 89) +10; //num1은 2자리 랜덤 정수
    int num2;
      
    System.out.println("숫자 맞추기 게임 시작!");
    System.out.print("10부터 99사이의 숫자를 맞추세요");

    try(Scanner scanner = new Scanner(System.in)){
      do { 
        System.out.print("어떤 숫자일까?: ");
        num2 = scanner.nextInt();
  
        if(num1 < num2){
          System.out.println("더 작은 숫자입니다.");
        }
        else if(num1 > num2){
          System.out.println("더 큰 숫자입니다.");
        }
      } while (num1 != num2);
      System.out.println("정답입니다.");
    } catch (Exception  e1){
      System.out.println("문제가 발생하였습니다. 프로그램을 종료합니다.");
    }
  }
}
