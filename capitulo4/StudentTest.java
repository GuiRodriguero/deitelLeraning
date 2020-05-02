package capitulo4;
import javax.swing.JOptionPane;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();

        String nome = JOptionPane.showInputDialog("Type the student name: ");
        st.setName(nome);

        double nota = Double.parseDouble(JOptionPane.showInputDialog("Type the student grade: "));
        if ((nota >= 0.0) & (nota <= 10.0)) {
                st.setAverage(nota);
                JOptionPane.showMessageDialog(null, st.getName() + "'s letter grade is: " + st.getLetterGrade());
        }else {
            JOptionPane.showMessageDialog(null, "Type an average between 0 and 10.");
        }
    }
}
