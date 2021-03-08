package com.returnordermanag.componentProcessModule.Model;

import org.springframework.stereotype.Component;

@Component
public class ProcessRequest {
	
	private String userName;
	private long userContactNumber;
	private DefectiveComponentDetail defectiveComponentDetail;
	private boolean isPriority;
	
	public ProcessRequest() {
	}
	
	public ProcessRequest(String userName, long userContactNumber, DefectiveComponentDetail defectiveComponentDetail,
			boolean isPriority) {
		super();
		this.userName = userName;
		this.userContactNumber = userContactNumber;
		this.defectiveComponentDetail = defectiveComponentDetail;
		this.isPriority = isPriority;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	public DefectiveComponentDetail getDefectiveComponentDetail() {
		return defectiveComponentDetail;
	}
	public void setDefectiveComponentDetail(DefectiveComponentDetail defectiveComponentDetail) {
		this.defectiveComponentDetail = defectiveComponentDetail;
	}
	public boolean isPriority() {
		return isPriority;
	}
	public void setPriority(boolean isPriority) {
		this.isPriority = isPriority;
	}
	
	
	

}
