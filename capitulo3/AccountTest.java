package capitulo3;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name is %s%n", myAccount.getName());
        System.out.printf("balance: $%s%n", myAccount.getBalance());

        System.out.print("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = input.nextDouble();
        myAccount.deposit(depositAmount);
        System.out.println();

        System.out.printf("Name in object is: %s%n", myAccount.getName());
        System.out.printf("Current Balance: $%s%n", myAccount.getBalance());
    }
}
