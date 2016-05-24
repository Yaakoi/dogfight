package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {
	
	private IDogfightModel iDogfightModel;
	private IOrderPerformer iOrderPerformer;
	
	private GraphicsBuilder graphicsBuilder;
	private EventPerformer eventPerformer;
	
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
		graphicsBuilder = new GraphicsBuilder(iDogfightModel);
		
		eventPerformer = new EventPerformer(iOrderPerformer);
	}	
	
	@Override
	public void run(){
		
	}

	public void displayMessage(String message){
		
	}
	
	public void closeAll(){
		
	}
		
}
