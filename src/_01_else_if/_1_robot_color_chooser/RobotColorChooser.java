
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenWidth(10);
		
		String color = JOptionPane.showInputDialog("what color");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor (Color.red);
	
		}
		else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor (Color.green);
		}
		else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor (Color.blue);
	}
	else {
		rob.setRandomPenColor();
	}
		for (int i = 0; i<4; i++) {
			rob.move(100);
			rob.turn(90);
		}
color = JOptionPane.showInputDialog("what color?");
		rob.hide();


	}
}
