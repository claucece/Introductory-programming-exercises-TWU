package Triangle;

public class Triangle {

    public int drawBase(int base) {
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        return base;
    }

    public int drawAltitude(int altitude) {
        for (int i = 0; i < altitude; i++) {
            System.out.println("*");
        }
        return altitude;
    }

    public int printTriangle(int angle) {
        for (int i = 0; i < angle; i++) {
            drawBase(i);
            System.out.println();
        }
        return angle;
    }
}
