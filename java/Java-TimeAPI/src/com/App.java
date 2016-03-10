package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/*
 * 
 *  java.util.Date     ( james gosling )
 *  
 *  java.sql.Date     
 *  java.sql.TimeStamp
 *  
 *  java.util.Calender ( given by IBM  )
 *  
 *  ...
 *  
 *  ------------------------------------
 *  
 *  Limitation with existing 'Date & Time' classes
 *  
 *  --> java.util.Date contains both date and time ,
 *      java.sql.Date contains date
 *      
 *      that is very bad design
 * 
 *  --> no class clearly defined for time,timestamp
 *  
 *  --> All the Date classes mutable, they are
 *      not 'thread-safe'
 *  
 *  --> date class dosen't provide i18n,
 *      no timezone support
 *      
 *      
 *   -----------------------------------------
 *   
 *    temp soln :
 *    
 *        third-party lib which provide good support for date and Time
 *        
 *        -> JODA time  
 *        
 *   ----------------------------------------
 *   
 *   in java-8
 *   
 *      java.time.*;  ( JSR-310 )
 *      java.time.chrono.* ; 
 *      java.time.format.*;
 *      java.time.zone.*;
 *      
 *      adv:
 *      
 *      --> immutability
 *      --> separation concern
 *      --> clarity
 *      --> utility method
 *      
 *    ---------------------------------------  
 *        
 *        
 *  
 */

public class App {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime  dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		//---------------------------------
		
		LocalDateTime todayKolkata=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(todayKolkata);
		
		
	}

}
