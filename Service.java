/*
Service.java
Craig Meehan
21 10 2018
*/

public class Service{

//Data Members
private String service;
private String message;
private String location;

//Constructors
public Service(){
String service="";
String message="";
String location="";
}

//setMethod
public void setService(String service){
	this.service=service;
}
public void setLocation(String location){
	this.location=location;
}


//Compute
public void compute(){ //opening compute
if(service.equals("full")){
	if(location.equals("blanchardstown")){
	message="Your service will be completed on Monday";
	}else if(location.equals("stillorgan")){
		message="Your service will be completed on Tuesday";
	}else{
		message="Your input is invalid";
	}
	}

if(service.equals("interim")){
	if(location.equals("blanchardstown")){
	message="Your service will be completed on Wednesday";
	}else if(location.equals("stillorgan")){
		message="Your service will be completed on Thursday";
	}else{
		message="Your input is invalid";
	}
	}

if(service.equals("pre-nct")){
	if(location.equals("blanchardstown")){
	message="Your service will be completed on Friday";
	}else if(location.equals("stillorgan")){
		message="Your service will be completed on Saturday";
	}else{
		message="Your input is invalid";
	}
	}


	} //closing compute

//getMethod
public String getMessage(){
	return message;
	}

	}