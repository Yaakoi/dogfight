package jpu2016.dogfight.view;

import com.sun.glass.events.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerformer;
	private UserOrder userOrder;
	
	
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		userOrder = new UserOrder(keyCode, null);
		return userOrder;
	}

	@Override
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
	
}
