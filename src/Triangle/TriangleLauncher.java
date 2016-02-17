package Triangle;

public class TriangleLauncher {
    public static void main (String[] args) {
        Triangle triangleLauncher = new Triangle();
        System.out.println("Let's print base = 1");
        triangleLauncher.drawBase(1);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Let's print base = 8");
        triangleLauncher.drawBase(8);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Let's print altitude = 3");
        triangleLauncher.drawAltitude(3);
        System.out.println(" ");
        System.out.print("Let's print the triangle:");
        triangleLauncher.printTriangle(5);
    }
}
