package zebra.section1;

import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		Robot rob = new Robot();
for(int i=1; i<80; i++) {
		rob.setRandomPenColor();
		rob.hide();
		rob.setSpeed(100);
		rob.penDown();
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.move(100);
		rob.turn(150);
		rob.move(100);
		rob.turn(150);
		rob.move(100);
	}
		
		
		// 1. Make a new Robot().  Remember to give it a name!
		
		// 2. Make your robot move()
		
		// 3. Make your robot turn()  
		
		// 4. Make your robot put its penDown()
		
		// 5. Make your robot move() some more.  What do you see?
		
		// 6. Can you make your robot draw a square?  A triangle?  Something cool?
		
		
		
		
		
		
		
		
		
		// Bonus: Can you make your robot sparkle? miniaturize? draw with a different color?
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
	
}
