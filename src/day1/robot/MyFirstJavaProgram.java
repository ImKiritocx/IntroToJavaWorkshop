package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE


Robot kirito = new Robot();
kirito.penDown();
kirito.setPenWidth(50);
kirito.setRandomPenColor();
kirito.setSpeed(500);
for (int i = 0; i < 4; i++) {
	kirito.move(200);
	kirito.turn(90);
	kirito.setRandomPenColor();
}
kirito.turn(180);
for (int i = 0; i < 4; i++) {
	kirito.move(200);
	kirito.turn(270);
	kirito.setRandomPenColor();
}
for (int i = 0; i < 4; i++) {
	kirito.move(200);
	kirito.turn(90);
	kirito.setRandomPenColor();
}
kirito.turn(180);
for (int i = 0; i < 4; i++) {
	kirito.move(200);
	kirito.turn(270);
	kirito.setRandomPenColor();
}
	}
}
