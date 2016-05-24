package jpu2016.gameframe;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import com.sun.prism.Graphics;

import jpu2016.dogfight.model.IDogfightModel;

public interface IGraphicsBuilder {

	
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	
	public int getGlobalWidth();
	
	public int getGlobalHeight();
}
