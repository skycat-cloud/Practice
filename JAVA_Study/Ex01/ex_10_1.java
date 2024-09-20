import java.util.Scanner;

public class ex_10_1 {
  public static void main(String[] args) {
      int num1, count, sum;
      count = 0;
      sum = 0;

      System.out.printf("1부터 n까지의 합을 구합니다.\n");
      System.out.printf("n의 값:");
      try(Scanner scanner = new Scanner(System.in)){
        num1 = scanner.nextInt();
        for(int i = 0; i <= num1; i++){
          sum = count + sum;
          count++;     
          System.out.printf("%d + ", count);
        }
      System.out.printf("= %d\n", sum);
    } catch (Exception e) {
      System.out.print("에러가 발생했습니다. 프로그램을 종료합니다.");
    }
  }
}
