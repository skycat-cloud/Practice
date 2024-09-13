
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BurgerMenu {
  static ArrayList<Burger> burgerMenu = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);

  public static void mainmenu(){
    System.out.println("버거킹 키오스크 입니다.");
    System.out.println("1: 주문하기 || ***** || 3: 관리자 메뉴");
    System.out.print("숫자를 입력해 주세요: ");
  }

  public static void initializeMenu() {
    burgerMenu.add(new Burger("통새우와퍼", 744, 7900));
    burgerMenu.add(new Burger("콰트로치즈와퍼", 901, 7900));
    burgerMenu.add(new Burger("몬스터와퍼", 1110, 9300));
  }
  
  public static void addTotalPrice() {
    int totalPrice = 0; // 총 가격을 저장할 변수 초기화
    for (int i = 0; i < burgerMenu.size(); i++) {
      Burger burger = burgerMenu.get(i); // 인덱스 i에 위치한 Burger 객체를 가져옴
      totalPrice += burger.price; // 해당 Burger 객체의 price를 totalPrice에 추가
    }
    System.out.printf("총 가격은: %d원 입니다.\n", totalPrice); // 총 가격 출력
  }

  public static void displayBurgerMenu() {
    System.out.println("///////////////////햄버거///////////////////");
    for (int i = 0; i < burgerMenu.size(); i++) {
      Burger b = burgerMenu.get(i);
      System.out.printf("%d. %s || %d Kcal || %d 원%n", i + 1, b.name, b.calories, b.price);
    }
  }
  public static void orderBurger() {
    int burgerNum, burgerQ;
    System.out.println("주문할 햄버거 메뉴 번호를 입력해주세요");
    System.out.print("메인 메뉴로 돌아가시려면 888번을 입력해주세요: ");

    while (true) {  // 반복문으로 바꿈
      burgerNum = scanner.nextInt();
      if (burgerNum == 888) {
        System.out.println("");
        System.out.println("");
        BurgerMenu.mainmenu();
        MainMenuSelect.mainmenuselect(); //메인 메뉴 선택자
        return;  // 메인 메뉴로 돌아가기 때문에 메서드를 종료
      } 
      else if (burgerNum != 888 && (burgerNum < 1 || burgerNum > BurgerMenu.burgerMenu.size())) {
        System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
        try{
            TimeUnit.SECONDS.sleep(1);
          }catch(InterruptedException e){
          }
        System.out.println("");
        System.out.println("");
        BurgerMenu.displayBurgerMenu();
        orderBurger(); //버거 메뉴청, 주문창 다시띄움.
        return;
      } 
      else {
        System.out.print("수량을 입력해 주세요: ");
        burgerQ = scanner.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Burger selectedBurger = BurgerMenu.burgerMenu.get(burgerNum - 1);
        System.out.printf("%s %d개 선택하셨습니다.%n", selectedBurger.name, burgerQ);
        order.orderask();
        break;  // 정상적인 선택을 하면 반복문 종료
      }
    }
  }


}
