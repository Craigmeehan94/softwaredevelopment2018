/*
ServiceApp.java
Craig Meehan
21 10 2018
*/
import javax.swing.*;
public class ServiceApp{
	public static void main(String args[]){

//Variables
String service="";
String message="";
String location="";

//Objects
Service myService;
myService = new Service();

//input
service=JOptionPane.showInputDialog(null,"What type of service would you like? (full / interim / pre-nct)");
myService.setService(service);

location=JOptionPane.showInputDialog(null,"What Location suits you? (blanchardstown / stillorgan)");
myService.setLocation(location);


//process
myService.compute();


//output
message=myService.getMessage();
JOptionPane.showMessageDialog(null,""+message);


	}
}
