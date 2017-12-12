package visual;

import javax.swing.JOptionPane;

/**
 *
 * @author elizeu
 */
public class Alerta {

    public static char pegaChar(String msg) {
        return JOptionPane.showInputDialog(msg).charAt(0);
    }

    public static String pegaString(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static int pegaInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static void mostraString(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostraString(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
