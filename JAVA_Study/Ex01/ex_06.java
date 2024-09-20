import java.util.Scanner;

public class ex_06 {
  public static void main(String[] args) {
    int count;
      System.out.print("몇 개의 *을 표시할까요? ");
      try (Scanner scanner = new Scanner(System.in)){
        count = scanner.nextInt();
        if(count != 1){
          for(int i = count; i>=1; i--){
            if(i%2 == 0){
              System.out.print("*");
            }
            else if(i%2 != 0){
              System.out.print("+");
            }  
          if(i == 1){
            System.out.print("\n줄바꿈 문자 출력.");
          }
        }
      }
      else if(count == 1){
        System.out.print("*");
      }
      else{
        System.out.println("오류가 발생했습니다.");
      }
    }catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
