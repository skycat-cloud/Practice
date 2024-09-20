
import java.util.Scanner;

public class Ex2_06 {
  public static void printSeason(int m){
    if(m < 1 || m > 12){
    }
    else if (m >=3 && m <= 5) {
      System.out.print("해당 월의 계절은 봄입니다.");
    }
    else if (m >=6 && m <= 8){
      System.out.print("해당 월의 계절은 여름입니다.");
    }
    else if (m >=9 && m <= 11){
      System.out.print("해당 월의 계절은 가을입니다.");
    }
    else if ( (m <= 2 && m >= 1) || m == 12){
      System.out.print("해당 월의 계절은 겨울입니다.");
    }
  }

  public static void enterSeason(){
    int month;
    System.out.print("몇 월입니까(1~12): ");
    try (Scanner scanner = new Scanner(System.in)) {
      month = scanner.nextInt();
    }
    printSeason(month);
  }
  public static void main(String[] args) {
    enterSeason();
  }
}
