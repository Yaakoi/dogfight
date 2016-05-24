package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
private int speed;
private boolean isWeapon;
private Color color;
private Dimension dimension;
private Position position;
private Direction direction;
private String image;


public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	this.direction = direction;
	this.position = position;
	this.dimension = dimension;
	this.speed = speed;
	this.image = image;
	
}

public Direction getDirection(){
	return this.direction;
	
}

public void setDirection(Direction direction){
	
}

public Dimension getDimension(){
	return this.dimension;
}

public int getSpeed(){
	return 1;
}

public int getWidth(){
	return 1;
}

public int getHeight(){
	return 1;
}

public void move(){
}

public void placeInArea(IArea area){
	
}

public boolean isPlayer(int player){
	return this.isPlayer(player);
}

private void moveUp(){
	
}

private void moveRight(){
	
}

private void moveDown(){
	
}

private void moveLeft(){
	
}

public Color getColor(){
	return this.color;
}

public void setDogfightModel(IDogfightModel dogfightModel){
	
}

public boolean isWeapon(){
return this.isWeapon;
}

@Override
public Point getPosition() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Image getImage() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setDogfightModel(DogfightModel dogfightModel) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean hit() {
	// TODO Auto-generated method stub
	return false;
}
}
