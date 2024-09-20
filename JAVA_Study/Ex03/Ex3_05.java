
import java.util.Arrays;
import java.util.Scanner;

public class Ex3_05 {
  static Scanner scanner = new Scanner(System.in);

  public static double[] arrLength(){
    int i;
    System.out.print("dnum 배열의 길이 : ");
    i = scanner.nextInt();
    double[] arr1 = new double[i];
    System.out.println("초기화 전의 dnum[]의 값: " + Arrays.toString(arr1));
    return arr1;
  }

  public static void enterArr(double[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.printf("dnum[%d] 번째 데이터 입력: ", i);
      arr[i] = scanner.nextDouble();
    }
  }
  
  public static void displayArr(double[] arr){
    double sum = 0;
    double avg;
    int i;
    for(i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    System.out.printf("배열의 합은 %.1f입니다.\n", sum);
    avg = sum / i;
    System.out.printf("배열값의 평균은 %.1f입니다.", avg);
  }

  public static void main(String[] args) {
    double[] arr = arrLength();
    enterArr(arr);
    displayArr(arr);
  }
}
