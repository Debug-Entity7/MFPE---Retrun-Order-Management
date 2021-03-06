package com.returnordermanag.packageDeliveryModule.Model;

import org.springframework.stereotype.Component;

@Component
public class PackDeliveryData {
	
	private int IntergalPackaging = 100;
	private int IntergalDelivery = 200;
	private int AccessoryPacking = 50;
	private int AccessoryDelivery = 100;
	private int ProtectiveSheath = 50;
	
	public int getIntergalPackaging() {
		return IntergalPackaging;
	}
	public void setIntergalPackaging(int intergalPackaging) {
		IntergalPackaging = intergalPackaging;
	}
	public int getIntergalDelivery() {
		return IntergalDelivery;
	}
	public void setIntergalDelivery(int intergalDelivery) {
		IntergalDelivery = intergalDelivery;
	}
	public int getAccessoryPacking() {
		return AccessoryPacking;
	}
	public void setAccessoryPacking(int accessoryPacking) {
		AccessoryPacking = accessoryPacking;
	}
	public int getAccessoryDelivery() {
		return AccessoryDelivery;
	}
	public void setAccessoryDelivery(int accessoryDelivery) {
		AccessoryDelivery = accessoryDelivery;
	}
	public int getProtectiveSheath() {
		return ProtectiveSheath;
	}
	public void setProtectiveSheath(int protectiveSheath) {
		ProtectiveSheath = protectiveSheath;
	} 
	
}
