package Triangle;

import Triangle.Triangle;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangleTest;

    @Before
    public void setUp() {
        triangleTest = new Triangle();
    }

    @Test
    public void ShouldPrintAsteriskDependingOnBaseValue() {
        assertEquals(triangleTest.drawBase(2), 2);
    }

    @Test
    public void ShouldPrintAsteriskDependingOnAltitudeValue() {
        assertEquals(triangleTest.drawBase(3), 3);
    }

    @Test
    public void ShouldPrintTriangle() {
        assertEquals(triangleTest.printTriangle(5), 5);
    }
}