package com.returnordermanag.componentProcessModule.Model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ProcessResponse {
	
	private String RequestId;
	private float ProcessingCharge;
	private float PackagingAndDeliveryCharge;
	private Date DateOfDelivery;
	
	public ProcessResponse () {}
	
	public ProcessResponse(String requestId, float processingCharge, float packagingAndDeliveryCharge,
			Date dateOfDelivery) {
		super();
		RequestId = requestId;
		ProcessingCharge = processingCharge;
		PackagingAndDeliveryCharge = packagingAndDeliveryCharge;
		DateOfDelivery = dateOfDelivery;
	}
	
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public float getProcessingCharge() {
		return ProcessingCharge;
	}
	public void setProcessingCharge(float processingCharge) {
		ProcessingCharge = processingCharge;
	}
	public float getPackagingAndDeliveryCharge() {
		return PackagingAndDeliveryCharge;
	}
	public void setPackagingAndDeliveryCharge(float packagingAndDeliveryCharge) {
		PackagingAndDeliveryCharge = packagingAndDeliveryCharge;
	}
	public Date getDateOfDelivery() {
		return DateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		DateOfDelivery = dateOfDelivery;
	}
	

	
}
