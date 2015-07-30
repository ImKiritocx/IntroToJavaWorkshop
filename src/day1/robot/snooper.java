package day1.robot;

import javax.swing.JOptionPane;

public class snooper {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your name ?");
		String location	=JOptionPane.showInputDialog("Where do you live ?");
		String age = JOptionPane.showInputDialog("How old are you ?");
		String car = JOptionPane.showInputDialog("What type of car do your parents have ?");
		JOptionPane.showMessageDialog(null, "I know that your name is "+answer+".");
		JOptionPane.showMessageDialog(null,"I also know that you like at "+location+"." );
		JOptionPane.showMessageDialog(null,"You are "+age+" years old.");
		JOptionPane.showMessageDialog(null,"Your parents car is a  "+car+"." );
	}

}
