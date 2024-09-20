import java.util.Scanner;

public class ex_17 {
  public static void main(String[] args) {
      int num1, pyn;

    System.out.println("피라미드를 표시합니다.");
    System.out.print("단수는?:");
    try (Scanner scanner = new Scanner(System.in)){
      num1 = scanner.nextInt();

      for(int i = 1; i <= num1; i++){
        for(int k = num1; k >= i; k--){
          System.out.print(" ");
        }

        pyn = i%10;

        for(int j=0; j < (i-1)*2 +1; j++){
          System.out.printf("%d", pyn);
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
