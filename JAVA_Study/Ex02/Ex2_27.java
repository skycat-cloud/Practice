public class Ex2_27 {
  public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
    if (x.length == y.length && x.length == z.length && x[0].length == y[0].length && x[0].length == z[0].length) 
    {
      for (int i = 0; i < x.length; i++) 
      {
        for (int j = 0; j < x[0].length; j++) {
          z[i][j] = x[i][j] + y[i][j];
        }
      }
      return true;
    } 
    else 
    {
      return false;
    } 
  }

  public static void main(String[] args) {
    int[][] a = {{1, 2, 3}, {4, 5, 6}};
    int[][] b = {{6, 3, 4}, {5, 1, 2}};
    int[][] c = new int[2][3];

    boolean result = addMatrix(a, b, c);

    System.out.println("행렬a");
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("");

    System.out.println("행렬b");
    for(int i = 0; i < b.length; i++){
      for(int j = 0; j < b[0].length; j++){
        System.out.print(b[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("");

    if (result==true) {
        System.out.println("행렬c");
        for(int i = 0; i < c.length; i++){
          for(int j = 0; j < c[0].length; j++){
            System.out.print(c[i][j] + " ");
          }
          System.out.println("");
        }
    } else {
      System.out.println("false를 반환했습니다. 행렬의 크기가 다릅니다.");
    }
  }
}
