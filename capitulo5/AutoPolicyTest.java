package capitulo5;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy ap = new AutoPolicy();

        int ac = Integer.parseInt(JOptionPane.showInputDialog("Type the account number: "));
        ap.setAccountNumber(ac);

        String car = JOptionPane.showInputDialog("Type the car name: ");
        ap.setMakeAndModel(car);

        String state = JOptionPane.showInputDialog("Type the State of ther car: ");
        ap.setState(state);

        policyInNoFaultState(ap);
    }

    public static void policyInNoFaultState(AutoPolicy policy){

        JOptionPane.showMessageDialog(null, "The auto policy: ");

        JOptionPane.showMessageDialog(null,"Account #: " +  policy.getAccountNumber() + "  Car: " +
                policy.getMakeAndModel() + "  State: " + policy.getState() + (policy.isNoFaultState() ? " is" : " is not") +
                " a no-fault state");
    }
}
