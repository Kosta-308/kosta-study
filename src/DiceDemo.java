import java.util.Scanner;

public class DiceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주사위를 몇 번 굴릴까요? : ");
        int num = sc.nextInt();

        Dice dice = new Dice();

        while(num > 0){
            dice.roll();
            num--;
        }
    }
}
