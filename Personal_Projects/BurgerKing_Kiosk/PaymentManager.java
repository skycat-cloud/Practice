import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PaymentManager {
  static int onum1 = 100;
  static Scanner scanner = new Scanner(System.in);
  public static void payment() {
    int selectedPaymentnum1;
    System.out.println("");
    System.out.println("");
    
    BurgerMenu.addTotalPrice();

    // 결제 방법 선택
    System.out.print("1. 카드로 결제하기 || 2. 현금으로 결제하기 : ");
    selectedPaymentnum1 = scanner.nextInt();
    
    switch(selectedPaymentnum1) {
      case 1 -> {
        System.out.println("카드로 결제합니다. 카드를 꽂아 주십시오.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.println("카드가 인식되었습니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.println("결제가 완료되었습니다. 주문번호가 잠시 후 출력됩니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.printf("주문번호는 %d 입니다.\n", onum1);
        onum1++;
        System.out.println("3초 후 메인 메뉴로 돌아갑니다.");
        try{
          TimeUnit.SECONDS.sleep(3);
        }catch(InterruptedException e){
        }
        BurgerMenu.mainmenu(); //키오스크 메인 메뉴
        MainMenuSelect.mainmenuselect(); //메인 메뉴 선택자
    }
      case 2 -> {
        System.out.println("현금으로 결제합니다.");
        try{
          TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
        }
        System.out.println("현금을 확인하고 있습니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.println("결제가 완료되었습니다. 주문번호가 잠시 후 출력됩니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.printf("주문번호는 %d 입니다.\n", onum1);
        onum1++;

        System.out.println("3초 후 메인 메뉴로 돌아갑니다.");
        try{
          TimeUnit.SECONDS.sleep(3);
        }catch(InterruptedException e){
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        BurgerMenu.mainmenu(); //키오스크 메인 메뉴
        MainMenuSelect.mainmenuselect(); //메인 메뉴 선택자
      }
      default -> {
        System.out.println("잘못된 선택입니다.");
        try{
            TimeUnit.SECONDS.sleep(1);
          }catch(InterruptedException e){
          }
          System.out.println("");
          System.out.println("");
          System.out.println("");
        payment();
        return;
      }
    }
  }
}