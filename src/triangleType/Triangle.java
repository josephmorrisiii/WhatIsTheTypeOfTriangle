package triangleType;

public class Triangle {


    public static void theAreaOfATriangle(int base, int height, int width) {
        int area = base * width * height;
        System.out.println("The area of the triangle is " + area +"\n");
    }

    public static void theHypotenuseOfATriangle(int theLengthOfSideA, int theLengthOfSideB) {
        int theLengthOfSideC = (theLengthOfSideA * theLengthOfSideA) + (theLengthOfSideB * theLengthOfSideB);
        double hypotenuseBeforeTwoDecimalPoints = Math.sqrt(theLengthOfSideC);
        String hypotenuseAfterTwoDecimalPoints = String.format("%.02f", hypotenuseBeforeTwoDecimalPoints);
        System.out.println("The hypotenuse of a triangle with the length of side A being: " + theLengthOfSideA + "\nand the length of side B being: " + theLengthOfSideB + "\nis equal too: " + hypotenuseAfterTwoDecimalPoints);
    }
}
