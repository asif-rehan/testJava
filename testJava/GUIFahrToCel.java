package testJava;
import javax.swing.*;

public class GUIFahrToCel {

	public static void main(String[] args) {
		String fahrString;
		Double fahr, cel;
		fahrString = JOptionPane.showInputDialog("Enter Fahr: ");
		fahr = new Double(fahrString);
		cel = (fahr - 32) * 5.0/9.0;
		JOptionPane.showMessageDialog(null, "Cel = " + cel);

	}

}
