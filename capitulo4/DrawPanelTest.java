package capitulo4;
import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame jf = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.add(panel); // adiciona o painel ao frame
        jf.setSize(250,250); // configura o tamanho do frame
        jf.setVisible(true); // torna o frame visível
    }
}
