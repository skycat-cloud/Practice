
import java.util.Scanner;

public class ex_if {
  public static void main(String[] args) {
    int age, guro, discount;
    double price12=2000, price19=3000, price60=6000;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("나이를 입력하세요 (1~100): ");
      age = scanner.nextInt();
      if(age < 0 || age > 100){
        System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
        System.exit(0);
      }

      System.out.print("구로에 거주 하십니까 (1. yes, 2. no): ");
      guro = scanner.nextInt();
      if(guro < 1 || guro >2){
        System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
        System.exit(0);
      }

      System.out.print("할인을 선택해 주세요 (1.kt 10%, 2.lg 13%, 3.skt 14% 4. 없음: ");
      discount = scanner.nextInt();
    }

    if(discount < 1 || discount > 4){
      System.out.print("잘못된 입력입니다. 프로그램을 종료합니다.");
      System.exit(0);
    }
    
    if(age<5) {
      System.out.println("5세 미만은 입장 불가입니다.");
    }

    else if(age<=12){
      if(guro==1){
        price12=2000*0.85;
      }

        switch (discount) {
            case 1 -> price12 = price12*0.9;
            case 2 -> price12 = price12*0.87;
            case 3 -> price12 = price12*0.86;
            default -> {
            }
        }

      System.out.printf("입장료는 %.1f원 입니다.\n", price12);
    }
    else if(age<=19){
      
      if(guro==1){
        price19=3000*0.85;
      }

        switch (discount) {
            case 1 -> price19 = price19*0.9;
            case 2 -> price19 = price19*0.87;
            case 3 -> price19 = price19*0.86;
            default -> {
            }
        }
      System.out.printf("입장료는 %.1f원 입니다.\n", price19);
    }
    else if(age<=60){

      if(guro==1){
        price60=6000*0.85;
      }

        switch (discount) {
            case 1 -> price60 = price60*0.9;
            case 2 -> price60 = price60*0.87;
            case 3 -> price60 = price60*0.86;
            default -> {
            }
        }

      System.out.printf("입장료는 %.1f원 입니다.\n", price60);
    }
    else if(age<=100){
      System.out.printf("입장료는 무료 입니다.");
    }
  }
}
