
import java.util.Scanner;

public class ex_15_2 {
  public static void main(String[] args) {
    System.out.print("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는?:");
    int num1, j;

    try (Scanner scanner = new Scanner(System.in)){
      num1 = scanner.nextInt();

      for(int i = 1; i <= num1; i++){
        for(j=num1; j > i; j--){
          System.out.print(" ");
        }
        for(int k = 1; k <= j; k++){
          System.out.print("*");
        }
        if(i==num1){
          break; //마지막줄 줄바꿈 방지
        }
        System.out.println();
      }

    }catch (Exception E){
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
