package jpu2016.dogfight.model;

public class Cloud extends Mobile {
private static int SPEED = 1;
private static int WIDTH = 30;
private static int HEIGHT = 10;
private static String IMAGE = "cloud";
	
	public Cloud(Direction direction, Dimension dimension) {
		super(direction, null, dimension, SPEED, IMAGE);
	}

}
