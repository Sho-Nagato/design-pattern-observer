import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    // 乱数発生器
    private Random random = new Random();

    // 現在の数値
    private int number;

    // 現在の数値を取得
    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
