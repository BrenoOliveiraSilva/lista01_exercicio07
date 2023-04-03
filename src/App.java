import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double side = 0;

        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Informe o lado do quadrado (cm)");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Lado");
            try {
                side = Double.parseDouble(input_1);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double area = Math.pow(side , 2) * 2;
        JOptionPane.showMessageDialog(null, "A área do quadrado vezes 2 é de " + numberFormat.format(area) + " cm²");
    }
}