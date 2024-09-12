import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdminMenu { // 메뉴 추가/삭제
  private static boolean isAuthenticated = false; // 인증 상태 변수

  public static void admin() {
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

    if (!isAuthenticated) { // 인증 상태가 아니라면
      System.out.print("관리자 페이지입니다. 패스워드를 입력하세요: ");
      try {
        int password = scanner.nextInt(); // 패스워드 입력
        if (password == 450) { // 패스워드 확인
          isAuthenticated = true; // 인증 성공
          System.out.println("인증되었습니다.");
        } else {
          System.out.println("패스워드가 틀립니다. 3초 후 키오스크를 종료합니다.");
          try {
            TimeUnit.SECONDS.sleep(3); 
          } catch (InterruptedException e) {}
          System.exit(0);
        }
      } catch (InputMismatchException e) {
        System.out.println("숫자를 입력해주세요.");
        scanner.nextLine(); // 잘못된 입력 처리
        admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
        return;
      }
    }

    // 인증된 경우 관리자 메뉴 표시
    System.out.println("///////////////////관리자 메뉴///////////////////");
    System.out.println("1. 메뉴 추가 || 2. 메뉴 삭제 || 3. 메인 메뉴로 돌아가기");
    System.out.print("숫자를 입력해 주세요: ");

    try {
      int adminNum = scanner.nextInt();  // 관리자 메뉴 선택

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
            TimeUnit.SECONDS.sleep(1); // 1초 대기
            admin(); // 메뉴 추가 후 다시 관리자 메뉴로 돌아감
          } catch (InputMismatchException e) {
            System.out.println("올바른 값을 입력해주세요.");
            scanner.nextLine(); // 잘못된 입력 처리
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
              TimeUnit.SECONDS.sleep(1); // 1초 대기
              admin(); // 메뉴 삭제 후 다시 관리자 메뉴로 돌아감
            } else {
              System.out.println("잘못된 번호입니다.");
              TimeUnit.SECONDS.sleep(1); // 1초 대기
              admin(); // 잘못된 번호일 경우 다시 관리자 메뉴로 돌아감
            }
          } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
            scanner.nextLine(); // 잘못된 입력 처리
            admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
          }
        }

        case 3 -> {
          isAuthenticated = false; // 인증 상태 초기화
          BurgerMenu.mainmenu(); // 키오스크 메인 메뉴
          MainMenuSelect.mainmenuselect(); // 메인 메뉴 선택자
        }

        default -> {
          System.out.println("잘못된 선택입니다.");
          admin(); // 잘못된 선택일 경우 다시 관리자 메뉴로 돌아감
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("숫자를 입력해주세요.");
      scanner.nextLine(); // 잘못된 입력 처리
      admin(); // 잘못된 입력일 경우 다시 관리자 메뉴로 돌아감
    } catch (Exception e) {
      System.out.println("오류가 발생했습니다: " + e.getMessage());
      try {
        TimeUnit.SECONDS.sleep(1); // 1초 대기
      } catch (InterruptedException e1) {}
      admin(); // 예외 발생 시 다시 관리자 메뉴로 돌아감
    }
  }
}
