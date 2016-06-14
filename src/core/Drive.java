package core;

import edu.wpi.first.wpilibj.CANTalon;

public class Drive {
	
	public double[] drive(double r, double theta) {
		double xPos = r*Math.cos(theta);
		double yPos = r*Math.sin(theta);
		
		double x = xPos * Math.abs(xPos);
		double y = yPos * Math.abs(yPos);
	
		double left = y + x;
		double right = y - x;
		
		return new double[] {left,right};
	}
}
