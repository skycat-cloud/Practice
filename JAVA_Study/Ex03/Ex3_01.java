import java.util.Scanner;

public class Ex3_01 {
 static  String[] arr = new String[3];
  static String st1, st2, st3;

  public static void enterArr(){
    System.out.println("3개 문자열을 입력하세요");
      try (Scanner scanner = new Scanner(System.in)) {
          st1 = scanner.nextLine();
          st2 = scanner.nextLine();
          st3 = scanner.nextLine();
      }

    arr[0] = st1;
    arr[1] = st2;
    arr[2] = st3;
  }

  public static void displayArr(){
    for(int i = 0; i < 3; i++){
      System.out.print(arr[i] +" ");
    }
  }

  public static void main(String[] args) {
    enterArr();
    displayArr();
  }
}
