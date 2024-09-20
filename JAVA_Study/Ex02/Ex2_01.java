
import java.util.Scanner;

public class Ex2_01 {

  public static void signOf(){
    int x;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("정수 x: ");
      x = scanner.nextInt();
    }
    if(x==0){
      System.out.print("signOf(x)는 0입니다");
    }
    else if(x > 0){
      System.out.print("signOf(x)는 1입니다");
    }
    else{
      System.out.print("signOf(x)는 -1입니다");
    }
  }

  public static void main(String[] args) {
    signOf();
  }
}
