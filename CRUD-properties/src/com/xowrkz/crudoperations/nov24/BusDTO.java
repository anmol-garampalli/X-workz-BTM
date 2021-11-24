package com.xowrkz.crudoperations.nov24;

public class BusDTO {

	private String busId;
	private String busPoint;
	private String destination;
	private String driverName;

	public BusDTO(String busId, String busPoint, String destination, String driverName) {
		super();
		this.busId = busId;
		this.busPoint = busPoint;
		this.destination = destination;
		this.driverName = driverName;
		System.out.println("Initiliazed Parameterized Constructor");
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getBusPoint() {
		return busPoint;
	}

	public void setBusPoint(String busPoint) {
		this.busPoint = busPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
