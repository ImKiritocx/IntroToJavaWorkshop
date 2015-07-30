package day1.robot;

import javax.swing.JOptionPane;

public class Question {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello "+answer);
		JOptionPane.showMessageDialog(null, "Hello "+answer);
	}

}
