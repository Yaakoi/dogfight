package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Sky extends Image implements IArea{
	private Image image;
	private Dimension dimension;
	
public Sky (Dimension dimension){
}

public Dimension getDimension(){
	return null;
}

@Override
public Image getImage() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getWidth(ImageObserver observer) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getHeight(ImageObserver observer) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ImageProducer getSource() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Graphics getGraphics() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object getProperty(String name, ImageObserver observer) {
	// TODO Auto-generated method stub
	return null;
}

/*public void setImage(Image image) {
	this.image = image;
}*/
}
