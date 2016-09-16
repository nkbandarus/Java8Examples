package com.booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRoom {

    private static Integer ROOM_COUNT = 10;
    public static void main(String[] args) throws IOException{
	//Booking booking1 = new Booking(100,200,false);
	//Booking booking2 = new Booking(500,700,true);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	Map<Date, List<Booking>> map = new HashMap<>();
	List<Booking> bookingList = new ArrayList<>();
	while(null !=input){
	    input.split(" ");
	    Booking booking = new Booking();
	    bookingList.add(booking);
	}
    }
}
