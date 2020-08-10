package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
		Robot rob = new Robot();
		for( int i = 0; i < 10; i++ ) {
			rob.penDown();
			rob.setSpeed(100);
			rob.setPenColor(Color.red);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.penUp();
			rob.penDown();
			rob.setPenColor(Color.red);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			
		
		}
		
	}
}
