public class Ex3_04 {
  static int[][] arr1 = {{2, 3, 4}, {3, 2, 1}};
  static int[][] arr2 = {{1, 2, 3}, {-4, -2, 1}};
  static int[] arrsum1 = new int[3];
  static int[] arrsum2 = new int[3];

  public static void arrSum(){
    for(int i = 0; i < 3; i++){
      arrsum1[i] = arr1[0][i] + arr2[0][i];
      arrsum2[i] = arr1[1][i] + arr2[1][i];
    }
  }

  public static void arrSumDisplay(){
    System.out.println("두 행렬의 합");
    for(int i = 0; i < 3; i++){
      System.out.printf("%d   ", arrsum1[i]);
    }

    System.out.println("");
    
    for(int i = 0; i < 3; i++){
      System.out.printf("%d   ", arrsum2[i]);
    }
  }

  public static void main(String[] args) {
    arrSum();
    arrSumDisplay();
  }
}
