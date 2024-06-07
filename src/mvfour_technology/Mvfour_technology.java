
package mvfour_technology;
import Telas.LoginTela;

/**
 *
 * @author Marcelinho
 */
public class Mvfour_technology {

    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        LoginTela LoginFrame = new LoginTela();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //centro
    }
}
