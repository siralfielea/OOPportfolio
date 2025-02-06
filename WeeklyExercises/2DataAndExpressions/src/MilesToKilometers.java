import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        int miles = input.nextInt();
        System.out.println(miles + " miles is equal to " + calculateKilometers(miles) + "km");
    }
    public static float calculateKilometers(float miles) {
        return (float) (miles * 1.60935);
    }
}
