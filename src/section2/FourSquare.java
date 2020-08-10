package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot rob = new Robot();

	void go() {
		rob.setSpeed(100);

		// 5. Set the pen width to 5
		rob.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for( int i = 0; i < 4; i++ ) {
			// 7. Set the pen color to random
		rob.setRandomPenColor();
	
			// 1. Call the drawSquare() method
		drawSquare();
		rob.turn(90);
		
			// 8. Turn the robot 90 degrees to the right
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
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
		rob.turn(90);
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



