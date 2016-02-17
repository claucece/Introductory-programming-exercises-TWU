package FizzBuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sceli on 2/17/16.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzzTest;

    @Before
    public void setUp() {
        fizzBuzzTest = new FizzBuzz();
    }

    @Test
    public void ShouldHaveFixedSize() {
        assertEquals(fizzBuzzTest.startGame(), 100);
    }
}