
import java.util.Random;
import java.util.Scanner;

public class Ex3_07 {
  public static void enter(){
    int num1;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("요소 수: ");
      num1 = scanner.nextInt();
    }
    int[] arr1 = new int[num1];
    loop(arr1);
  }

  public static void loop(int[] arr1){
    Random random = new Random();

    for(int i = 0; i < arr1.length; i++){
      arr1[i] = random.nextInt(10)+1;
    }

    for(int i = 10; i >= 1; i--){
      for(int j = 0; j < arr1.length; j++){
        if(arr1[j] == i || arr1[j] > i){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    for(int k = 0; k < arr1.length; k++){
      System.out.print("-");
    }
    System.out.println("");
    for(int k = 0; k < arr1.length; k++){
      if(k < 10){
        System.out.print(k);
      }
      else {
        System.out.print(k%10);
      }
    }
  }
  public static void main(String[] args) {
    enter();
  }
}
