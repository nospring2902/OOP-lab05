/*
import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've choosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}
*/
package hust.soict.hedspi.lab01;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        String [] option = {"Yes", "No"};
        int choice = JOptionPane.showOptionDialog(
        	null, 
        	"Do you want to change to the first class ticket?", 
        	"Choose an option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
        	null, 
        	option,
        	option[0]
        );
        JOptionPane.showMessageDialog(null,(choice == 0 ? "You've chosen: Yes" : "You've chosen: No"));  
    }
}

