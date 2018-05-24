package com.ki.designPattern.structural.proxy;

public class ProxyPatternClient {
	public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Prem Prakash Rohan");  
        access.grantInternetAccess();  
    }  
}
