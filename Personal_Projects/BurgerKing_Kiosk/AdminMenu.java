import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdminMenu { // 메뉴 추가/삭제
  public static void admin() {
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
    
    int password;
    System.out.print("관리자 페이지 입니다. 패스워드를 입력하세요: 888 입력시 되돌아갑니다. ");
    
    try {
      password = scanner.nextInt(); // 패스워드 입력
      if(password == 888){
        BurgerMenu.initializeMenu(); //버거 메뉴판 불러옴
        BurgerMenu.mainmenu(); //키오스크 메인 메뉴
        MainMenuSelect.mainmenuselect(); //메인 메뉴 선택자
      }
      else if (password == 450) { // 패스워드 확인
        int adminNum;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("///////////////////관리자 메뉴///////////////////");
        System.out.println("1. 메뉴 추가 || 2. 메뉴 삭제 || 3. 메인 메뉴로 돌아가기");
        System.out.print("숫자를 입력해 주세요: ");

        try {
          adminNum = scanner.nextInt();  // 관리자 메뉴 선택
        } catch (InputMismatchException e) {
          System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
          try {
            TimeUnit.SECONDS.sleep(1); // 1초 대기
          } catch (InterruptedException e1) {}
          scanner.nextLine(); 
          System.out.println("");
          System.out.println("");
          System.out.println("");
          admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
          return;
        }

        switch (adminNum) {
          case 1 -> { // 메뉴 추가
            try {
              System.out.print("추가할 버거 이름: ");
              String name = scanner.next();  // 버거 이름 입력

              System.out.print("칼로리: ");
              int calories = scanner.nextInt();  // 칼로리 입력

              System.out.print("가격: ");
              int price = scanner.nextInt();  // 가격 입력

              BurgerMenu.burgerMenu.add(new Burger(name, calories, price));
              System.out.println("메뉴가 추가되었습니다.");
              try {
                TimeUnit.SECONDS.sleep(1); // 1초 대기
              } catch (InterruptedException e) {
              }
              System.out.println();
              admin(); // 메뉴 추가 후 다시 관리자 메뉴로 돌아감
            } catch (InputMismatchException e) {
              System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
              try {
                TimeUnit.SECONDS.sleep(1); // 1초 대기
              } catch (InterruptedException e1) {}
              scanner.nextLine(); 
              System.out.println("");
              System.out.println("");
              System.out.println("");
              admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
            }
          }

          case 2 -> { // 메뉴 삭제
            try {
              BurgerMenu.displayBurgerMenu();
              System.out.println("삭제할 메뉴 번호를 입력해주세요.");
              int removeIndex = scanner.nextInt();  // 삭제할 메뉴 번호 입력

              if (removeIndex > 0 && removeIndex <= BurgerMenu.burgerMenu.size()) {
                BurgerMenu.burgerMenu.remove(removeIndex - 1);
                System.out.println("메뉴가 삭제되었습니다.");
                try {
                  TimeUnit.SECONDS.sleep(1); // 1초 대기
                } catch (InterruptedException e) {
                  System.out.println("대기 중 오류 발생: " + e.getMessage());
                }
                admin(); // 메뉴 삭제 후 다시 관리자 메뉴로 돌아감
              } else {
                System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
                try {
                  TimeUnit.SECONDS.sleep(1); // 1초 대기
                } catch (InterruptedException e) {}
                admin(); // 잘못된 번호일 경우 다시 관리자 메뉴로 돌아감
              }
            } catch (InputMismatchException e) {
              System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
              try {
                TimeUnit.SECONDS.sleep(1); // 1초 대기
              } catch (InterruptedException e1) {}
              scanner.nextLine(); 
              System.out.println("");
              System.out.println("");
              System.out.println("");
              admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
            }
          }

          case 3 -> {
            BurgerMenu.mainmenu(); // 키오스크 메인 메뉴
            MainMenuSelect.mainmenuselect(); // 메인 메뉴 선택자
          }

          default -> {
            System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
            try {
              TimeUnit.SECONDS.sleep(1); // 1초 대기
            } catch (InterruptedException e1) {}
            System.out.println("");
            System.out.println("");
            System.out.println("");
            admin(); // 잘못된 선택일 경우 다시 관리자 메뉴로 돌아감
          }
        }
      } else {
        System.out.println("패스워드가 틀립니다. 보안을 위해 3초 후 키오스크를 종료합니다.");
        try {
          TimeUnit.SECONDS.sleep(3); 
        } catch (InterruptedException e) {}
        System.exit(0);
      }
    } catch (Exception e) {
      System.out.println("오류이거나 잘못된 접근입니다. 관리자 페이지를 다시 로드합니다. 보안을 위해 패스워드 재입력이 필요합니다.");
      try {
        TimeUnit.SECONDS.sleep(1); 
      } catch (InterruptedException e1) {}
      System.out.println("");
      System.out.println("");
      System.out.println("");
      admin(); // 예외 발생 시 다시 관리자 메뉴로 돌아감
    }
  }
}