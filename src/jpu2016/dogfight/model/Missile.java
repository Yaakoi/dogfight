package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private static int SPEED = 4;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	private boolean isWeapon;

	public Missile(Direction direction, Dimension dimension) {
		super(direction, null,dimension, SPEED, IMAGE);
	}
	
	public static int getWidthWithADirection(Direction direction){ 
		return 1;
	}
	
	public static int getHeightWithADirection(Direction direction){
		return 1;
	}

	public void move(){
		
	}
	
	public boolean isWeapon(){
		return isWeapon;
	}
}
