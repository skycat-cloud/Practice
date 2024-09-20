
import java.util.Random;
import java.util.Scanner;

public class Ex2_08 {
  public static int random(int a, int b){
    Random random = new Random();
    int ranNumReturn;

    if((b <= a)){
      return a;
    }
    else{
      ranNumReturn = random.nextInt(b-a)+a;
      return ranNumReturn;
    }
  }

  public static void enterNum(){
    int num1, num2;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("하한값: ");
      num1 = scanner.nextInt();
      System.out.print("상한값: ");
      num2 = scanner.nextInt();
    }
    int ranNum = random(num1, num2);

    if(num1 < num2){
      System.out.printf("생성한 난수는 %d입니다.", ranNum);
    }
    else{
      System.out.printf("하한값이 더 큽니다. %d을(를) 반환했습니다.", ranNum);
    }
  }
  public static void main(String[] args) {
    enterNum();
  }
}
