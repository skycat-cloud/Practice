
import java.util.Random;

public class ex_dice {
  public static void main(String[] args) {
    int dice1, dice2, dice3;
    int count = 1;
    Random random = new Random();

    while (true) {
      dice1 = random.nextInt(6)+1;
      dice2 = random.nextInt(6)+1;
      dice3 = random.nextInt(6)+1;
      count++;
      if(dice1 == dice2){
        if(dice2 == dice3)
        break;
      }
    }

    System.out.printf("3개 주사위는 모두 %d 입니다\n", dice1);
    System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다.", count);
  }
}
