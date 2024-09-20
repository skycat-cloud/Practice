
import java.util.Scanner;

public class ex_13 {
  public static void main(String[] args) {
    int month, yn;
    try (Scanner scanner = new Scanner(System.in)){
      System.out.print("계절을 찾습니다.");
      
      do { 
        System.out.print("몇 월입니까?:");
        month = scanner.nextInt();

        if(month < 0 || month >12){
          do { 
            System.out.print("1 ~ 12 사이의 수로 입력해 주세요\n");
            System.out.print("몇 월입니까?:");
            month = scanner.nextInt();
            if(month >= 1 && month <=12){
              break;
              }
            } while (true);
          }

        if(month >= 3 && month <= 5){
          System.out.print("봄입니다.\n");
        }
        else if(month <= 8 && month >= 6){
          System.out.print("여름입니다.\n");
        }
        else if(month <= 11 && month >=9){
          System.out.print("가을입니다.\n");
        }
        else if(month <= 12){
          System.out.print("겨울입니다.\n");
        }
          

        System.out.print("다시 하겠습니까? 1_yes/0_no:");
        yn = scanner.nextInt();

        if(yn==0){
          break;
        }
        else if (yn > 1 || yn < 0){
          System.out.print("0 또는 1로 입력해주세요\n");
          System.out.print("다시 하겠습니까? 1_yes/0_no:");
          yn = scanner.nextInt();
          if(yn==0){
            break;
          }
        }
      } while (true);
    }catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
