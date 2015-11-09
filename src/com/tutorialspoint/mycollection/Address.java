package com.tutorialspoint.mycollection;


public class Address {

	String address1,address2;
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	@Override
	public String toString() {
		String rtv="";
		if (address1==null) {
			rtv=address2;
		}else if(address2==null )
			rtv= address1 ;
	return rtv;
	}
	
	
}
