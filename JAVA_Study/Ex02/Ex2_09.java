
import java.util.Scanner;

public class Ex2_09 {
  static Scanner scanner = new Scanner(System.in);
  public static int readPlusInt(int plusNum){
    int reverseNum;
    reverseNum = 0;
    if(plusNum > 0){
      while (plusNum != 0) {
        reverseNum = reverseNum * 10 + plusNum % 10;
        plusNum /= 10;
      }
    }
    return reverseNum;
  }
  
  public static void enterNum(){
    int plusNum, num2;
    System.out.print("양의 정숫값: ");
    plusNum = scanner.nextInt();
    while (true) { 
      if(plusNum <= 0){
        System.out.print("양의 정숫값: ");
        plusNum = scanner.nextInt();
      }
      else{
        break;
      }
    }
    num2 = readPlusInt(plusNum);
    System.out.printf("%d\n", num2);
  }

  public static void main(String[] args) {
    int num1;
    while (true) {
      enterNum();
      System.out.print("다시 한 번? <Yes_1/No_0>");
      num1 = scanner.nextInt();
      if(num1==0){
        break;
      }
    }
  }
}
