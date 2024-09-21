
import java.util.Random;
import java.util.Scanner;

public class Ex2_10{
  static int x, y, z;
  static Scanner scanner = new Scanner(System.in);
  public static int ranNum(){
    int num1;
    Random random = new Random();
    x = random.nextInt(899)+100;
    y = random.nextInt(899)+100;
    z = random.nextInt(899)+100;

    num1 = random.nextInt(3)+1;
    return num1;
  }

  public static void displayNum(){
    int num1 = ranNum();
    int answer, correct;
    System.out.println("암산 훈련!!");
    switch (num1) {
    case 1 -> {
      System.out.printf("%d + %d + %d = ", x, y, z);
      answer = scanner.nextInt();
      correct = x + y + z;
      if(answer != correct){
        System.out.println("틀렸습니다!");
        retry();
        }
      else {
        System.out.println("정답입니다!");
        retry();
        }  
      }
    case 2 -> {
      System.out.printf("%d + %d - %d = ", x, y, z);
      answer = scanner.nextInt();
      correct = x + y - z;
      if(answer != correct){
        System.out.println("틀렸습니다!");
        retry();
        }
      else {
        System.out.println("정답입니다!");
        retry();
        } 
      }
    case 3 -> {
      System.out.printf("%d - %d + %d = ", x, y, z);
      answer = scanner.nextInt();
      correct = x - y + z;
      if(answer != correct){
        System.out.println("틀렸습니다!");
        retry();
        }
      else {
        System.out.println("정답입니다!");
        retry();
        } 
      }
    case 4 -> {
      System.out.printf("%d - %d - %d = ", x, y, z);
      answer = scanner.nextInt();
      correct = x - y - z;
      if(answer != correct){
        System.out.println("틀렸습니다!");
        retry();
        }
      else {
        System.out.println("정답입니다!");
        retry();
        }
      }
    }
  }

  public static void retry(){
    int yn;
    System.out.print("다시 한 번? <Yes_1/No_0>: ");
    yn = scanner.nextInt();
    switch (yn) {
      case 1:
          displayNum();
          break;
      case 0:
          System.exit(0);
      default:
          System.out.println("잘못된 입력입니다.");
          break;
    }
  }
  public static void main(String[] args) {
    displayNum();
  }
}