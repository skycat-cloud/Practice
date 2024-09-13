import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PaymentManager {
  static Scanner scanner = new Scanner(System.in);
  public static void ordernum(){
    int onum1; // 주문번호
    Random random = new Random();
    onum1 = random.nextInt(300)+1;
    System.out.printf("주문번호는 %d 입니다.", onum1);
  }
  public static void payment() {
    int selectedPaymentnum1;
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    // 결제 금액 출력
    BurgerMenu.addTotalPrice();

    // 결제 방법 선택
    System.out.print("1. 카드로 결제하기 || 2. 현금으로 결제하기");
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
        System.out.print("결제가 완료되었습니다. 주문번호가 잠시 후 출력됩니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        ordernum();
    }
      case 2 -> {
        System.out.println("현금으로 결제합니다.");
        try{
          TimeUnit.SECONDS.sleep(4);
        }catch(InterruptedException e){
        }
        System.out.println("현금을 확인하고 있습니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        System.out.print("결제가 완료되었습니다. 주문번호가 잠시 후 출력됩니다.");
        try{
          TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException e){
        }
        ordernum();
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

