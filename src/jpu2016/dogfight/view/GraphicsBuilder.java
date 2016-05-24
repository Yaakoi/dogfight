package jpu2016.dogfight.view;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import com.sun.prism.Graphics;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder{

	private BufferedImage bufferedImage;
	private IDogfightModel iDogfightModel;
	
	public GraphicsBuilder(IDogfightModel dogfightModel){
		bufferedImage = new BufferedImage(null, null, false, null);
		iDogfightModel = dogfightModel;
	}
	
	private void buildEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 0;
		
	}
	
	public int getGlobalHeight(){
		return 0;
		
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}
}

