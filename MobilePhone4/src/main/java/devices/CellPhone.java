package devices;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import applications.Applications;
import exceptions.ArrayLengthException;
import exceptions.ArrayNegativeLengthException;
import exceptions.NegativeNumberException;
import exceptions.UserInstantiationException;
import hardware.Battery;
import hardware.Camera;
import hardware.Charger;
import hardware.Processor;
import interfaces.ICall;
import interfaces.ICharge;
import interfaces.IMessage;
import interfaces.IScreen;
import users.User;

public class CellPhone extends Phone implements IScreen, ICall, IMessage, ICharge {
	private String operatingSystem;
	private int numberOfButtons;
	private Processor processor;
	private Battery battery;
	private Charger charger;
	private User user;
	private Camera camera;
	private Applications applications;
	
	private final static Logger LOGGER = LogManager.getLogger(CellPhone.class);

	
	public CellPhone(String brand, String model, String weight, String dimensions, 
			 int numberOfButtons, String operatingSystem) {
		super(brand, model, weight, dimensions);
		this.numberOfButtons = numberOfButtons;
		this.operatingSystem = operatingSystem;
		
	}
	
	public CellPhone(String brand, String model, String weight, String dimensions, String displayType,
			String displaySize) {
		super(brand, model, weight, dimensions, displayType, displaySize);
	}

	public CellPhone(String brand, String model, String weight, String dimensions, String displayType,
			String displaySize, int numberOfButtons, String operatingSystem) {
		super(brand, model, weight, dimensions, displayType, displaySize);
		this.numberOfButtons = numberOfButtons;
		this.operatingSystem = operatingSystem;
		
	}

	public CellPhone(String brand, String model, String weight, String dimensions) {
		super(brand, model, weight, dimensions);
		
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
			LOGGER.info("Array can't be bigger than 15");
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
	public void sendMessage(String text) {
		LOGGER.info("The message: " + text + " has been sent to " + user + ".");

		
	}



	@Override
	public String toString() {
		return operatingSystem + "\n" + numberOfButtons + "\n" + processor + "\n" + battery + "\n" +
	charger + "\n" + user + "\n" + camera + "\n" + applications;
	}

	
	public Boolean installApplication(String applicationName) {
		LOGGER.info("Application " + applicationName + " has been installed"); 
		  return true;
	  }
	public Boolean uninstallApplication(String applicationName) {
		LOGGER.info("Application " + applicationName + " has been uninstalled");
		return true;
	}
	
	
	
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(applications, battery, camera, charger, numberOfButtons, operatingSystem,
				processor, user);
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
		CellPhone other = (CellPhone) obj;
		return Objects.equals(applications, other.applications) && Objects.equals(battery, other.battery)
				&& Objects.equals(camera, other.camera) && Objects.equals(charger, other.charger)
				&& numberOfButtons == other.numberOfButtons && Objects.equals(operatingSystem, other.operatingSystem)
				&& Objects.equals(processor, other.processor) && Objects.equals(user, other.user);
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


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public int getNumberOfButtons() {
		return numberOfButtons;
	}


	public void setNumberOfButtons(int numberOfButtons) {
		this.numberOfButtons = numberOfButtons;
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
	public void charge() {
	
		
	}

	@Override
	public void disconnectFromCharger() {
	
		
	}

	
	
	
	
	
	
	
}
