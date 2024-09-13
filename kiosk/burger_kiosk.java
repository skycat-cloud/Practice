import java.util.Scanner;

public class burger_kiosk {
  
  public static void burgermenu(){
    int burgerNum, burgerQ;
    System.out.println("///////////////////햄버거///////////////////");
    System.out.println("");
    System.out.println("1. 통새우와퍼 || 744 Kcal || 7,900 원");
    System.out.println("2. 콰트로치즈와퍼 || 901 Kcal || 7,900 원");
    System.out.println("3. 몬스터와퍼 || 1110 Kcal || 9,300 원");
    System.out.println("");
    System.out.print("주문할 햄버거 메뉴 번호를 입력해주세요: ");
    try(Scanner scanner = new Scanner(System.in)){
      burgerNum = scanner.nextInt();
      System.out.print("수량을 입력해 주세요: ");
      burgerQ = scanner.nextInt();
      System.out.println("");
      switch (burgerNum) {
        case 1 -> System.out.printf("통새우와퍼 %d개 선택하셨습니다.%n", burgerQ);
        case 2 -> System.out.printf("콰트로치즈와퍼 %d개 선택하셨습니다.%n", burgerQ);
        case 3 -> System.out.printf("몬스터와퍼 %d개 선택하셨습니다.%n", burgerQ);
        default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
      }
    }
  }
  
  public static void check(){
    int orderNum;
    System.out.println("///////////////////주문 상태///////////////////");
    System.out.println("주문 번호 입력: ");
    try(Scanner scanner = new Scanner(System.in)){
      orderNum = scanner.nextInt();
    }
  }
  
  public static void admin(){
    int adminNum;
    System.out.println("///////////////////관리자 메뉴///////////////////");
    System.out.println("1. 메뉴 추가 || 2. 메뉴 삭제");
    try(Scanner scanner = new Scanner(System.in)){
      adminNum = scanner.nextInt();
    }
  }

  public static void main(String[] args) {
    System.out.println("버거킹 키오스크 입니다.");
    System.out.println("1: 주문하기 || 2: 주문 상태 확인 || 3: 관리자 메뉴");
    System.out.print("숫자를 입력해 주세요: ");
    int selectnum1, goOrder;
    try(Scanner scanner = new Scanner(System.in)){
      selectnum1 = scanner.nextInt();
      switch (selectnum1) {
        case 1 -> burgermenu();
        case 2 -> check();
        case 3 -> admin();
        default -> System.out.println("에러가 발생했습니다. 올바른 숫자를 입력해 주세요.");
      }
      System.out.println("1: 사이드 추가 주문 || 2: 결제 진행하기");
    }
    catch (Exception e) {
      System.out.print("에러가 발생했습니다. 올바른 숫자를 입력해 주세요.");
    }

  }
}
