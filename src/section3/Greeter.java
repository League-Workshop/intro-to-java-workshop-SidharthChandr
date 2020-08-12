package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("What Is Your Name?");
		JOptionPane.showMessageDialog(null, "hello "+x);
		System.out.println(x);
	}

}
