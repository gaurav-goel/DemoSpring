package com.test.webservice;

public class HelloWorld {


	public float addValue(float value) {
		return (value + 10);
	}
 
	public float subtractValue(float value) {
		return (value - 10);
	}
	
	public float divideValue(float value) throws Exception{
		float retValue= 0f;
		try{
			
			
			if (value ==0){
				throw new Exception();
			}
			retValue = 10/value;
			
			
		}catch (Exception e){
			System.out.println("zero value");
			
		}
		
		return retValue;
		
	}
}