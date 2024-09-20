import java.util.Scanner;

public class ex_04_01 {
  public static void main(String[] args) {
    int num1, i, count, countdowmnum;
    System.out.println("카운트다운 합니다");

    try (Scanner scanner = new Scanner(System.in)) {
      do {
        System.out.print("양의 정숫값: ");
        num1 = scanner.nextInt();
      } while (num1 <= 0);

      i = num1;
      count = 0;

      while(i>=0){
        countdowmnum = --num1; // --num1, num1-- 위치를 바꿀경우 결과가 달라짐
        System.out.printf("%d\n", countdowmnum);
        count++;
        if(i==0){
          System.out.printf("x(입력한 정숫값)이 %d이(가) 됐습니다", num1-count);
        }
        i--;
      }
    }catch (Exception  e1){
      System.out.println("문제가 발생하였습니다. 프로그램을 종료합니다.");
    }
  }
}
