package com.returnordermanag.componentProcessModule.Model;

public class DefectiveComponentDetail {
	
	private String ComponentType;
	private String ComponentName;
	private int Quantity;
	private String DetailOfDefective;
	
	public DefectiveComponentDetail () {}
	
	public DefectiveComponentDetail(String componentType, String componentName, int quantity,
			String detailOfDefective) {
		super();
		ComponentType = componentType;
		ComponentName = componentName;
		Quantity = quantity;
		DetailOfDefective = detailOfDefective;
	}
	public String getComponentType() {
		return ComponentType;
	}
	public void setComponentType(String componentType) {
		ComponentType = componentType;
	}
	public String getComponentName() {
		return ComponentName;
	}
	public void setComponentName(String componentName) {
		ComponentName = componentName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getDetailOfDefective() {
		return DetailOfDefective;
	}
	public void setDetailOfDefective(String detailOfDefective) {
		DetailOfDefective = detailOfDefective;
	}

}
