package com.xworkz.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.Flight;
import com.xworkz.xworkzapp.FlightDTO;

public class FlightUtil {
	
	public static final int size = 0;

	public static void main(String[] args) {
		Flight flight=new Flight();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter flight booking information");
		FlightDTO flightdto=new FlightDTO();
		for(int i=0;i<size;i++) 
		{
		FlightDTO dto=new FlightDTO();
			System.out.println("enter airplane code");
			String airplaneCode=sc.next();
			
			System.out.println("enter company name");
			String company=sc.next();
			
			System.out.println("eneter buisness class price");
			String buisnessClassPrice=sc.next();
			
			System.out.println("enter starting point");
			String startingPoint=sc.next();
			
			
			flightdto.setAirplaneCode("Air123");
			flightdto.setCompany("indigo");
			flightdto.setBusinessClassPrice(2500);
			flightdto.setStartingPoint("Bangalore");
		}
		
		flight.addFlightBooking();
		System.out.println("search flight by starting point");
		sc.next();
		
		flight.addFlightBooking();
		
		System.out.println("indigo");
		sc.next();
		//Flight.displayflight();
		String startingPoint=sc.next();
		sc.close();
		
		
			
			
			
			

	}

}
