
import java.util.Scanner;

public class Ex2_04 {
  public static int sumUp(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum += i;
    }
    return sum;
  }

  public static void enterNum(){
    int num1, sumReturn;
    System.out.println("1부터 x까지의 합을 구하자");
    System.out.print("x의 값: ");
    try (Scanner scanner = new Scanner(System.in)) {
      num1 = scanner.nextInt();
    }
    sumUp(num1);

    sumReturn = sumUp(num1);
    System.out.printf("1부터 %d까지의 합은 %d입니다.", num1, sumReturn);
  }
  public static void main(String[] args) {
    enterNum();
  }
}