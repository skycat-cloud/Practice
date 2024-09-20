
import java.util.Scanner;

public class ex_03 {
  public static void main(String[] args) {
    int A, B;

    try(Scanner scanner = new Scanner(System.in)){
      System.out.print("정수 A: ");
      A = scanner.nextInt();
      System.out.print("정수 B: ");
      B = scanner.nextInt();
    }
    
      if(A>B){
        for(int i=B; i<=A; i++){
          System.out.printf("%d ", i);
        }
      }
        else if(A<B){
          for(int i=A; i<=B; i++){
            System.out.printf("%d ", i);
        }
      }
        else{
          System.out.println("오류입니다.");
      }
  }
}
