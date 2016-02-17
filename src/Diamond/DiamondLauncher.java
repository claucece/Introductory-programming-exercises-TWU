package Diamond;

/**
 * Created by sceli on 2/17/16.
 */
public class DiamondLauncher {
    public static void main(String[] args) {
        Diamond diamondLauncher = new Diamond();
        System.out.println("Let's make a Diamond with your name:");
        System.out.println("First, let's print a triangle:");
        diamondLauncher.drawFirstTriangle(3);
        System.out.println();
        System.out.println("Then, let's print a diamond:");
        diamondLauncher.drawDiamond(3);
        System.out.println();
        System.out.println("Now, let's print that diamond with name:");
        diamondLauncher.drawNameInDiamond(3, "Bill");
    }
}
