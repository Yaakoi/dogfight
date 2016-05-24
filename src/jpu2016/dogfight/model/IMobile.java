package jpu2016.dogfight.model;

public interface IMobile {
public Direction getDirection();
public void setDirection(Direction direction);
public Point getPosition();
public Dimension getDimension();
public int getWidth();
public void setWidth(int width);
public int getHeight();
public void setHeight(int height);
}
