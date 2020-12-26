package com.xworkz.xworkzapp;

public class FlightDTO {
	
	public String airplaneCode;
	public String company;
	public String startingPoint;
	public String destination;
	public String totalseats;
	public String domestic;
	public long   businessClassPrice;
	public long   economyClassPrice;
	
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(String totalseats) {
		this.totalseats = totalseats;
	}
	public String getDomestic() {
		return domestic;
	}
	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}
	public long getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(long businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public long getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(long economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	
	

}
