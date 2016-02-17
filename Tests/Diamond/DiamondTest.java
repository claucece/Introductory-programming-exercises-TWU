package Diamond;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    Diamond diamondTest;

    @Before
    public void setUp() {
        diamondTest = new Diamond();

    }

    @Test
    public void shouldCalculateBase(){
        assertEquals(diamondTest.defineBase(4), 7);
    }

    @Test
    public void shouldCalculateAsterisks(){
        assertEquals(diamondTest.defineAsterisk(4), 9);
    }

    @Test
    public void shouldCalculateSecondAsterisks(){
        assertEquals(diamondTest.defineSecondAsterisk(5), 9);
    }

    @Test
    public void shouldCalculateSpaces(){
        assertEquals(diamondTest.defineSpace(8, 2), 3);
    }

    @Test
    public void shouldCalculateMinus(){
        assertEquals(diamondTest.defineMinus(8), 7);
    }

    @Test
    public void shouldPrintName(){
        assertEquals(diamondTest.drawName("Sofia"), "Sofia");
    }

}