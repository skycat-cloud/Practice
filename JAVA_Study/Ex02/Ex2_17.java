
import java.util.Scanner;

public class Ex2_17 {
  static Scanner scanner = new Scanner(System.in);

  public static void arrLength(){
    int i;
    System.out.print("요소 수: ");
    i = scanner.nextInt();
    int[] arr = new int[i];

    arrEnter(arr);
  }

  public static void arrEnter(int[] arr){
    int num1, key, result1, result2;
    for(int i = 0; i < arr.length; i++){
      System.out.printf("x[%d]: ", i);
      num1 = scanner.nextInt();
      arr[i] = num1;
    }
    System.out.print("찾는 값: ");
    key = scanner.nextInt();

    result1 = linearSearch(arr, key);
    result2 = linearSearchR(arr, key);

    if(result1 == -1){
      System.out.print("해당 값의 요소가 존재하지 않습니다.");
    }
    else if(result1 == result2){
      System.out.printf("해당 값의 요소가 1개 존재합니다.\n");
      System.out.printf("요소는 x[%d]에 있습니다", result1);
    }
    else{
      System.out.printf("해당 값의 요소가 여러개 존재합니다.\n");
      System.out.printf("가장 앞에 위치한 값은 x[%d]에 있습니다.\n", result1);
      System.out.printf("가장 뒤에 위치한 값은 x[%d]에 있습니다.", result2);
    }
  }

  public static int linearSearch(int[] a, int key){
    int i;
    for(i = 0; i < a.length; i++){
      if(a[i] == key){
        return i; // key와 일치하는 첫번째 인덱스
      }
    }
    return -1; // key와 일치한 값이 없을경우 -1 반환
  }

  public static int linearSearchR(int[] a, int key){
    int i;
    for(i = a.length-1; i >= 0; i--){
      if(a[i] == key){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    arrLength();
  }
}
