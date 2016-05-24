package jpu2016.gameframe;

import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import com.sun.glass.events.KeyEvent;

public class GameFrame extends JFrame implements KeyListener {

	private IEventPerformer iEventPerformer;
	private GamePanel gamePanel;
	private IGraphicsBuilder iGraphicsBuilder;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable){
		
		gamePanel = new GamePanel(iGraphicsBuilder);
		
	}
	
	@Override
	public void keyPressed(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
