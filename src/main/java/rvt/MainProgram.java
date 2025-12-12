public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        counter.increase(4);
        counter.increase(3);
        counter.decrease(7);
        System.out.println(counter.value());
    }
}
