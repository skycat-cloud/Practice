
import java.util.Scanner;

public class Ex3_15 {
  public static void arrEnter(){
    System.out.print("요소 수: ");
    int i;
    try (Scanner scanner = new Scanner(System.in)) {
      i = scanner.nextInt();
      int[] arr1 = new int[i];

      int tmp;
      for(int j = 0; j < arr1.length; j++){
        System.out.print("a["+ j + "] = ");
        tmp = scanner.nextInt();
        arr1[j] = tmp;
      }
      arrReverse(arr1);
    }
  }

  public static void arrReverse(int[] arr1){
    int[] arr2 = new int[arr1.length];
    
    for(int j = 0; j < arr2.length; j++){
      arr2[j] = arr1[arr2.length-j-1];
    }
    arrDisplay(arr2);
  }

  public static void arrDisplay(int[] arr2){
    System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
    for(int i = 0; i < arr2.length; i++){
      System.out.println("b[" + i + "] = " + arr2[i]);
    }
  }

  public static void main(String[] args) {
    arrEnter();
  }
}
