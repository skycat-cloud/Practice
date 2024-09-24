public class Ex3_22 {
  public static void calculate(int x, double y){
    System.out.println("2 x 4 x 3.14 = " + 2 * x * y);
  }
  public static void main(String[] args) {
    System.out.println("원의 둘레 구하는 공식: 2 x 반지름 x 원주율");
    calculate(4, 3.14);
  }
}
