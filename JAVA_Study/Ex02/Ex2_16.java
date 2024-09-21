
import java.util.Scanner;

public class Ex2_16 {
  static Scanner scanner = new Scanner(System.in);

  public static void minOf(int[][] a){
    int minH = Integer.MAX_VALUE;
    int minW = Integer.MAX_VALUE;

    for (int[] row : a) {
      minH = Math.min(minH, row[0]);
      minW = Math.min(minW, row[1]);
    }

    System.out.printf("가장 키가 작은 사람의 신장: %dcm\n", minH);
    System.out.printf("가장 마른 사람의 체중: %dkg", minW);
  }
  public static void arrLength(){
    int i, h, w;
  
    System.out.print("사람 수는: ");
    i = scanner.nextInt();
    int[][] arr = new int[i][2];

    System.out.printf("%d 명의 신장과 체중을 입력하자.\n", i);

    for(int j = 0; j < arr.length; j++){
      System.out.printf("%d번의 신장: ", j+1);
      h = scanner.nextInt();
      arr[j][0] = h;
      System.out.printf("%d번의 체중: ", j+1);
      w = scanner.nextInt();
      arr[j][1] = w;
    }
    minOf(arr);
  }

  public static void main(String[] args) {
    arrLength();
  }
}