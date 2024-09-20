import java.util.Scanner;

public class ex_05_1 {
  public static void main(String[] args) {
    int count;
      System.out.print("몇 개의 *을 표시할까요? ");
      
      try (Scanner scanner = new Scanner(System.in)){
        count = scanner.nextInt();
        if(count != 1){
          int i;
          i = count;
          while(i>=1){
          System.out.print("*");
          if(i == 1){
            System.out.print("\n줄바꿈 문자 출력.");
          }
          i--;
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
