import java.util.Scanner;

class OverloadDemo {
    void area(float x) {
        System.out.println("The area of the square is " + Math.pow(x, 2) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        float squareSide = scanner.nextFloat();
        ob.area(squareSide);

        System.out.print("Enter the length and width of the rectangle: ");
        float rectangleLength = scanner.nextFloat();
        float rectangleWidth = scanner.nextFloat();
        ob.area(rectangleLength, rectangleWidth);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        ob.area(circleRadius);

        scanner.close();
    }
}

