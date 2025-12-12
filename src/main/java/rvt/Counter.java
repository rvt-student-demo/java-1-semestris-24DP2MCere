
public class Counter {

    private int count;

    public Counter(int startValue) {
        this.count = startValue;
    }

    public Counter() {
        this.count = 0;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        } else {
            this.count += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        } else {
            this.count -= decreaseBy;
        }
    }

    public int value() {
        return this.count;
    }
}