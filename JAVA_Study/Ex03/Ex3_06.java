

public class Ex3_06 {
  static int[][] arr1 = new int[4][5];
  static int[][] arr2 = new int[4][5];
  static int[][] arr3 = new int[4][5];

public static void dataArr(){
  int num1 = 11;
  int num2 = 31;
  int num3 = 51;

  for(int i = 0; i < 4; i++){
    for(int j = 0; j < 5; j++){
      arr1[i][j] = num1;
      num1++;
    }
  }

  for(int i = 0; i < 4; i++){
    for(int j = 0; j < 5; j++){
      arr2[i][j] = num2;
      num2++;
    }
  }

  for(int i = 0; i < 4; i++){
    for(int j = 0; j < 5; j++){
      arr3[i][j] = num3;
      num3++;
    }
  }
}

public static void printArr(int[][] array){
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      System.out.print(array[i][j] + " ");
    }
    System.out.println();
  }
}

public static void displayArr(){
  System.out.println("1번째 2차원 배열");
  printArr(arr1);

  System.out.printf("\n2번째 2차원 배열\n");
  printArr(arr2);

  System.out.printf("\n3번째 2차원 배열\n");
  printArr(arr3);
}

  public static void main(String[] args) {
    dataArr();
    displayArr();
  }
}
