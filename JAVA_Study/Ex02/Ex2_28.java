import java.util.Scanner;

public class Ex2_28 {
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

  public static void inputMatrix(Scanner scanner, int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.printf("요소 [%d][%d]를 입력하세요: ", i, j);
        matrix[i][j] = scanner.nextInt();
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("행렬의 행 수: ");
    int rows = scanner.nextInt();
    System.out.print("행렬의 열 수: ");
    int cols = scanner.nextInt();

    int[][] a = new int[rows][cols];
    int[][] b = new int[rows][cols];
    int[][] c = new int[rows][cols];

    System.out.println("행렬a");
    inputMatrix(scanner, a);

    System.out.println("행렬b");
    inputMatrix(scanner, b);

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
    

    if (result) {
        System.out.println("행렬c:");
        for(int i = 0; i < c.length; i++){
          for(int j = 0; j < c[0].length; j++){
            System.out.print(c[i][j] + " ");
          }
          System.out.println("");
        }
    } else {
        System.out.println("false를 반환했습니다. 행렬의 크기가 맞지 않아 덧셈을 수행할 수 없습니다.");
    }

    scanner.close();
  }
}