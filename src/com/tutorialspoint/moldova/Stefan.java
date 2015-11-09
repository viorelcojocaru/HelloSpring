package com.tutorialspoint.moldova;

import com.tutorialspoint.moldova.intf.Camping;
import com.tutorialspoint.moldova.intf.Kings;

public class Stefan implements Kings {
	
	private Camping camping; 
	
	
	public void setCamping(Camping camping) {
		this.camping = camping;
	}
	
	public Camping getCamping() {
		return camping;
	}
	private Wealth wealth;
	
	public void setWealth(Wealth wealth) {
		this.wealth = wealth;
	}
	
	public Wealth getWealth() {
		return wealth;
	}
	
	@Override
	public void going() {
		wealth=camping.going();
	}
	
}
