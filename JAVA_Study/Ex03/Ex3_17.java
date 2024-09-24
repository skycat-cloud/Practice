
import java.util.Random;
import java.util.Scanner;

public class Ex3_17 {
  public static void arrEnter(){
    System.out.print("요소 수: ");
    int num;
    try (Scanner scanner = new Scanner(System.in)) {
      num = scanner.nextInt();
    }
    int[] arr1 = new int[num];
    arrRandom(arr1);
  }

  public static void arrRandom(int[] arr1){
    Random random = new Random();
    for(int i = 0; i < arr1.length; i++){
      int ranNum = random.nextInt(10)+1;
      arr1[i] = ranNum;
    }
    arrDisplay(arr1);
  }

  public static void arrDisplay(int[] arr1){
    for(int i = 0; i < arr1.length; i++){
      System.out.println("a[" + i + "] = " + arr1[i]);
    }
  }

  public static void main(String[] args) {
    arrEnter();
  }
}