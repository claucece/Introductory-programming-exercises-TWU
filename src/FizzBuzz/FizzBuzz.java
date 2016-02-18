package FizzBuzz;

public class FizzBuzz {

    private final static int SIZE = 100;

    public int startGame() {
        for (int i = 1; i <= SIZE; i++) {
            String test = "";
            test += (i % 3) == 0 ? "Fizz" : "";
            test += (i % 5) == 0 ? "Buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
        return SIZE;
    }
}

