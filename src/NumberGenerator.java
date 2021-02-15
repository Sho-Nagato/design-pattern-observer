import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    // Observerたちを保持
    private ArrayList<Observer> observers = new ArrayList<>();

    // Observerを追加
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observerを削除
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observerへ通知
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    // 数を取得する
    public abstract int getNumber();

    // 数を生成する
    public abstract void execute();
}
