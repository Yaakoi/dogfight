package jpu2016.gameframe;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import com.sun.prism.Graphics;

public class GamePanel extends JPanel implements Observer{

	private IGraphicsBuilder graphicBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder){
		
	}
	
	
	public void paintComponent(Graphics graphic){
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
