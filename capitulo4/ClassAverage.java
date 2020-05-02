package capitulo4;
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.print("Enter Grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter += 1;
        }

        int average = total/10;

        System.out.printf("%nTotal: %d%n", total);
        System.out.printf("Average: %d", average);
    }
}
