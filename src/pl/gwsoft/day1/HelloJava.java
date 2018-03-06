package pl.gwsoft.day1;

public class HelloJava {

    public static void main(String[] args) {
        createTriangle();
        createRectangleDiagonal();
        createRectangle();
        createRectangleTwoDiagonals();
    }

    private static void createTriangle() {
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < i) System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void createRectangleDiagonal() {
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static void createRectangle() {
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || j == 5 || i == 5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static void createRectangleTwoDiagonals() {
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==i || j==(5-i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
