package com.vendor.container;

public class App {
	
	public static void main(String[] args) {
		
		Container container=new Container();  
		
		// 
		container.processReq("/get");
		
		container.processReq("/post");
		
	}

}
