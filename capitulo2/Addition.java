package capitulo2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Enter fisrt integer: ");
        n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        n2 = input.nextInt();

        System.out.printf("Sum is %d%n", n1+n2);
    }
}
