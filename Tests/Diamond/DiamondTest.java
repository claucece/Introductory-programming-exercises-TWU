package Diamond;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondTest {

    Diamond diamondTest;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

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

    @Test
    public void shouldPrintTriangle() {
        System.setOut(new PrintStream(outContent));
        String testWelcome = "  *\n" +
                " ***\n" +
                "*****" +
                "\n";
        diamondTest.drawFirstTriangle(3);
        assertEquals(testWelcome, outContent.toString());
    }

    @Test
    public void shouldPrintDiamond() {
        System.setOut(new PrintStream(outContent));
        String testWelcome = "  *\n" +
                " ***\n" +
                "*****\n" +
                " ***\n" +
                "  *\n";
        diamondTest.drawDiamond(3);
        assertEquals(testWelcome, outContent.toString());
    }

    @Test
    public void shouldPrintNameInDiamond() {
        System.setOut(new PrintStream(outContent));
        String testWelcome = " *\n" +
                "***\n" +
                "Bill\n" +
                "***\n" +
                " *\n";
        diamondTest.drawNameInDiamond(3, "Bill");
        assertEquals(testWelcome, outContent.toString());
    }
}