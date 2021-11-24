package com.xowrkz.crudoperations.nov24;

public class AirportDTO {

	private String airportID;
	private String airportName;
	private String location;
	private String type;
	
	public AirportDTO(String airportID, String airportName, String location, String type) {
		super();
		this.airportID = airportID;
		this.airportName = airportName;
		this.location = location;
		this.type = type;
	}

	public String getAirportID() {
		return airportID;
	}

	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
}
