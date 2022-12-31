package devices;

import java.util.Objects;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import applications.Applications;
import exceptions.ArrayLengthException;
import exceptions.ArrayNegativeLengthException;
import exceptions.CoordinatesOutOfRangeException;
import exceptions.NegativeCoordinatesException;
import exceptions.NegativeNumberException;
import exceptions.UserInstantiationException;
import hardware.Battery;
import hardware.Camera;
import hardware.Charger;
import hardware.Processor;
import interfaces.ICalculate;
import interfaces.ICall;
import interfaces.ICharge;
import interfaces.IMessage;
import interfaces.IRotate;
import interfaces.IScreen;

import users.User;

public class SmartPhone extends Phone implements IScreen, ICall, IMessage, ICharge, IRotate, ICalculate{

	private String operatingSystem;
	private Processor processor;
	private Battery battery;
	private Charger charger;
	private User user;
	private Camera camera;
	private Applications applications;
	
	
	
	
	public SmartPhone(String brand, String model, String weight, String dimensions,
			String displayType, String displaySize, String operatingSystem) {
		super( brand, model, weight, dimensions, displayType, displaySize);
		this.operatingSystem = operatingSystem;
	}

	public SmartPhone(String brand, String model, String weight, String dimensions, 
			String displayType, String displaySize) {
		super( brand, model, weight, dimensions, displayType, displaySize);
		
	}
	public SmartPhone(String brand, String model, String weight, String dimensions, String operatingSystem ) {
		super( brand, model, weight, dimensions);
		this.operatingSystem = operatingSystem;
	}
	
	
	@Override
	public String toString() {
		return operatingSystem + "\n" + processor + "\n" + battery + "\n" + charger + "\n" + user + "\n" +
	 camera + "\n" + applications;
	}
	
	
	
	public Boolean installApplication(String applicationName) {
		  LOGGER.info("Application " + applicationName + " has been installed"); 
		  return true;
	  }
	public Boolean uninstallApplication(String applicationName) {
		LOGGER.info("Application " + applicationName + " has been uninstalled");
		return true;
	}
	
	
	
	
	private final static Logger LOGGER = LogManager.getLogger(SmartPhone.class);

	//try catch with resources
	@Override
	public void charge() throws NullPointerException {
		
		try(Scanner scanner = new Scanner(System.in)) {
		LOGGER.info("Do you want to charge your device?");
		LOGGER.info("\"Y\" for yes and \"N\" for no");
		scanner.next().toUpperCase();
		
		if(scanner.next() == "Y") 
			{
			LOGGER.info("Your device is being charged");
			
			}
		else if(scanner.next() == "N") 
			{
			LOGGER.info("Charge offer declined");
			}
		else if(scanner.equals(null)) 
			{
			throw new NullPointerException();
			}
		else {
			LOGGER.info("You should input only \"Y\" or \"N\"");	
			}
		}
		catch(NullPointerException e) {
			LOGGER.info("Answer can't be null");
		}
		
		
	}
	
	public void rotateScreen(int x, int y, int z) {
		try { 
			if( x < 0 || y < 0 || z < 0) 
			{
				throw new NegativeCoordinatesException();
			}
			if( x > 360 || y > 360 || z > 360) {
				throw new CoordinatesOutOfRangeException();
			}
			
		}
		catch(NegativeCoordinatesException e) 
		{
			LOGGER.info("Coordinates of x,y,z can't be negative");
		}
		catch(CoordinatesOutOfRangeException e)
		{
			LOGGER.info("Coordinates can't be more than 360");
		}
		
		
	}

	
	@Override
	public void call(String user, int[] phoneNumber) 
	{   
		for(int i = 0; i<phoneNumber.length; i++)
		
			try
		{
			if(phoneNumber.length > 15) 
			{
			throw new ArrayLengthException();
			}
			else if (phoneNumber.length < 0) {
			throw new ArrayNegativeLengthException();	
			}
			else if (user.length() < 4) {
			throw new UserInstantiationException();	
			}
			else if ( phoneNumber[i] < 0 ) {
			throw new NegativeNumberException();
				
			}
		
		}
		catch(ArrayLengthException e) 
		{ 
			LOGGER.info("Array can't have length more than 15");
		}
		catch(ArrayNegativeLengthException e) 
		{
			LOGGER.info("Array can't have negative length");
		}
		catch(UserInstantiationException e)
		{
			LOGGER.info("User name can't be less than 4");
		}
		catch(NegativeNumberException e)
		{
			LOGGER.info("Phone number can't be negative");
		}
	}

    @Override
	public void divide(int x, int y) throws ArithmeticException {
		try {
			LOGGER.info(x/y);
		}
		catch(ArithmeticException e) {
			LOGGER.info("Can't divide by zero");
		}
		
	}

	public int calculateSum(int x, int y) {
		return x+y;
	}

	
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public void sendMessage(String text) {
		LOGGER.info("The message: " + text + " has been sent to " + user + ".");
		
	}

	

	@Override
	public String getDisplayType() {
		return super.getDisplayType();
	}

	@Override
	public void setDisplayType(String displayType) {
		
		super.setDisplayType(displayType);
	}

	@Override
	public String getDisplaySize() {
	
		return super.getDisplaySize();
	}

	@Override
	public void setDisplaySize(String displaySize) {
		super.setDisplaySize(displaySize);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(applications, battery, camera, charger, operatingSystem, processor, user);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(applications, other.applications) && Objects.equals(battery, other.battery)
				&& Objects.equals(camera, other.camera) && Objects.equals(charger, other.charger)
				&& Objects.equals(operatingSystem, other.operatingSystem) && Objects.equals(processor, other.processor)
				&& Objects.equals(user, other.user);
	}


	
	

	
	
	@Override
	public String getBrand() {
		return super.getBrand();
	}

	

	@Override
	public String getModel() {
		return super.getModel();
	}

	
	@Override
	public String getWeight() {
		return super.getWeight();
	}



	@Override
	public String getDimensions() {
		return super.getDimensions();
	}

	

	@Override
	public void turnOffScreen() {
		LOGGER.info("The screen of " + this.getModel() + " turned OFF");
		
	}

	@Override
	public void turnOnScreen() {
		LOGGER.info("The screen of " + this.getModel() + " turned ON");
		
	}

	@Override
	public void increaseBrightness() {
		LOGGER.info("The brightness of " + this.getModel() + " screen has been increased");
		
	}

	@Override
	public void decreaseBrightness() {
		LOGGER.info("The brightness of " + this.getModel() + " screen has been decreased");
		
	}

	
	public void darkModeOn() {
		LOGGER.info("Dark mode has been activated");
		
	}

	
	public void nightShiftOn() {
		LOGGER.info("night Shift has been activated");
		
	}

	
	public void trueToneOn() {
		LOGGER.info("True tone has been activated");
		
	}
	
	
	public void darkModeOff() {
		LOGGER.info("Dark mode has been deactivated");
		
	}


	public void nightShiftOff() {
		LOGGER.info("night Shift has been deactivated");
		
	}

	
	public void trueToneOff() {
		LOGGER.info("True tone has been deactivated");
		
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String OperatingSystem) {
		this.operatingSystem = OperatingSystem;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Applications getApplications() {
		return applications;
	}

	public void setApplications(Applications applications) {
		this.applications = applications;
	}


	

	@Override
	public void disconnectFromCharger() {
		
		
	}

	@Override
	public void rotateScreen() {
		
	}

	


	
	
	
	
}
