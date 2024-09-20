
import java.util.Scanner;

public class ex_password {
  public static void main(String[] args) {
      int password, nextpassword;
      System.out.println("패스워드 입력: ");
      try (Scanner scanner = new  Scanner(System.in)) {
        password = scanner.nextInt();
        System.out.println("다시 패스워드 입력: ");
        nextpassword = scanner.nextInt();
      }
        if(password == nextpassword){
          System.out.println("통과");
        }
        else {
          System.out.println("비밀번호가틀립니다.");
        }
  }
}
