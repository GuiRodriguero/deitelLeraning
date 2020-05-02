package capitulo6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter three floating-point values separated by spaces: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        double result = maximum(n1, n2, n3);
        System.out.println("Maximum is: " + result);
    }

    public static double maximum (double x, double y, double z){
        double maximumValue = x;

        if(y>x){
            maximumValue = y;
        }
        if(z>y){
            maximumValue = z;
        }
        return maximumValue;
    }
}
