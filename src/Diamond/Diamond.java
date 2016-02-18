package Diamond;

public class Diamond {

    private int base;
    private int asterisk;
    private int space;

    public int defineBase(int height) {
        base = (2 * height) - 1;
        return base;
    }

    public int defineAsterisk(int i) {
        asterisk = (2 * i) + 1;
        return asterisk;
    }

    public int defineSecondAsterisk(int i) {
        asterisk = (2 * i) - 1;
        return asterisk;
    }

    public int defineSpace(int base, int asterisk) {
        space = (base - asterisk) / 2;
        return space;
    }

    public int defineMinus(int height) {
        int minus = height - 1;
        return minus;
    }

    public void makeTriangle(int space, int asterisk) {
        for (int j = 0; j < space; j++)
            System.out.print(" ");
        for (int k = 0; k < asterisk; k++)
            System.out.print("*");
    }

    public void drawFirstTriangle(int height) {
        base = defineBase(height);
        for (int i = 0; i < height; i++) {
            asterisk = defineAsterisk(i);
            space = defineSpace(base, asterisk);
            makeTriangle(space, asterisk);
            System.out.println();
        }
    }

    public void drawSecondTriangle(int height) {
        int minus = defineMinus(height);
        for (int i = minus; i > 0; i--) {
            asterisk = defineSecondAsterisk(i);
            space = defineSpace(base, asterisk);
            makeTriangle(space, asterisk);
            System.out.println();
        }
    }

    public void drawDiamond(int height) {
        drawFirstTriangle(height);
        defineMinus(height);
        drawSecondTriangle(height);
    }

    public String drawName(String name) {
        System.out.println(name);
        return name;
    }

    public void drawNameInDiamond(int height, String name) {
        int diamondHeight = height - 1;
        drawFirstTriangle(diamondHeight);
        drawName(name);
        drawSecondTriangle(height);
    }

}

