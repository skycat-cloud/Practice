
import java.util.Scanner;

public class ex_15_3 {
  public static void main(String[] args) {
    System.out.print("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는?:");
    int num1, count;

    try (Scanner scanner = new Scanner(System.in))
    {
      num1 = scanner.nextInt();
      count = 0;

      for(int i = 1; i <= num1; i++){
        for(int j=0; j < i; j++){
          System.out.print(" ");
        }
        count++;
        for(int k = num1; k>=count; k--){
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
