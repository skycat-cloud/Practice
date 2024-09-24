
import java.util.Scanner;

public class Ex3_21 {
  public static void arrEnter(){
    int num;
    System.out.print("요소 수: ");
    try (Scanner scanner = new Scanner(System.in)) {
      num = scanner.nextInt();
      int[] arr1 = new int [num];

    int tmp;
      for(int j = 0; j < arr1.length; j++){
        System.out.print("a["+ j + "] = ");
        tmp = scanner.nextInt();
        arr1[j] = tmp;
      }
    arrDisplay(arr1);
    }
  }

  public static void arrDisplay(int[] arr1){
    System.out.print("a = {");
    for(int i = 0; i < arr1.length-1; i++){
      System.out.printf("%d, ", arr1[i]);
    }
    System.out.printf("%d}", arr1[arr1.length-1]);
  }
  public static void main(String[] args) {
      arrEnter();
  }
}
