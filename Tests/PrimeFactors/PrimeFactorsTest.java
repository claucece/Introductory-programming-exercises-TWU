package PrimeFactors;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    PrimeFactors primeFactorsTest;
    List<Integer> testList;

    @Before
    public void setUp() {
        primeFactorsTest = new PrimeFactors();
        testList = new ArrayList<Integer>() {{
            add(2);
            add(2);
            add(2);
            add(5);
        }};
    }

    @Test
    public void shouldReturnAListOfPrimes() {
        assertEquals(primeFactorsTest.generatePrimes(40), testList);
    }
}