package LibACT4E;

public class Sandbox implements Runnable {

    public static void main(String[] args) {
        new Sandbox().run();
    }

    @Override
    public void run() {
        final FiniteSetRepresentation<Integer> representation = new ArrayFiniteSetRepresentation<>();
        final FiniteSet<Integer> integers = new ArrayFiniteSet<Integer>(1, 2, 3);
    }
}
