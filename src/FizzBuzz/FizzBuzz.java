package FizzBuzz;

public class FizzBuzz {

    private final static int SIZE = 100;

    public void defineConditionals(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
    }

    public int startGame() {
        for (int i = 1; i <= SIZE; i++) {
            defineConditionals(i);
        }
        return SIZE;
    }
}
