package com.tutorialspoint.moldova.campingImpl;

import com.tutorialspoint.moldova.Wealth;
import com.tutorialspoint.moldova.intf.Camping;

public class TurkCampaign implements Camping{
	
	@Override
	public Wealth going() {
		Wealth wealth=null;
		preparing();
		go();
		fighting();
		wealth=takeWealth();
		System.out.println("Return wealth");
		return wealth;
	}

	private void preparing() {
		System.out.println("Preparing for Turkey camping");
		
	}

	private void go() {
		System.out.println("Going to Turkey");
		
	}

	private void fighting() {
		System.out.println("Fighting with Turkish");
		
	}

	private Wealth takeWealth() {
		System.out.println("Take Wealth");
		Wealth wealth=new Wealth();
		wealth.setWealth(10);
		return wealth;
	}

	

}
