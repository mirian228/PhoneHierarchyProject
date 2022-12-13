package Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import devices.CellPhone;
import devices.LandlinePhone;
import devices.Phone;
import devices.SmartPhone;
import exceptions.DivisionByZeroException;
import hardware.Battery;
import hardware.Camera;
import hardware.Charger;
import hardware.Processor;
import interfaces.ICall;
import users.User;





public class Main {

	public final static Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {

		
		
		User userOne = new User("Mirian Surmanidze", 21, "Georgia", "Tbel Abuseridze Street");
		User userTwo = new User();
		User userThree = new User("Mirian Surmanidze", 21, "Georgia", "Tbel Abuseridze Street");
		
		
		//Polymorphism with abstract class
		Phone iphoneOne = new SmartPhone("Apple", "Iphone 13", "174g", "131 x 64 x 7.6 mm", "IOS");
		Phone nokia = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		Phone texas = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD", "5");
		
		//PolyMorphism with interface
		ICall iphone = new SmartPhone("Apple", "Iphone 13", "174g" , "131 x 64 x 7.6 mm", "IOS");
		ICall cellphone = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		ICall landlinephone = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD", "5");
	
		SmartPhone phoneOne = new SmartPhone("Apple", "Iphone 13", "174g" , "131 x 64 x 7.6 mm", "IOS");
		CellPhone phoneTwo = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		LandlinePhone phoneThree = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD", "5");
		CellPhone phoneFour = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		
		
		
		
		
		
		
		

		
		Processor processorOne = new Processor("A15 Bionic processor", 6, 3.23);
		Processor processorTwo = new Processor("Texas Instruments MAD2WD1", 1, 0.5);
		Battery batteryOne = new Battery("lithium-ion battery", 80, 95, "3095 mAh" );
		Battery batteryTwo = new Battery();
		Charger chargerOne = new Charger("Fast Charger", "20W", "60HZ", "USB-C");
		Charger chargerTwo = new Charger("Charger", "5W", "10HZ", "Micro USB");
		Camera cameraOne = new Camera("Dual 12MP", "5X", 3);
		Camera cameraTwo = new Camera("1.5MP", "2X", 1);
		Camera cameraThree = new Camera("Dual 12MP", "5X", 3);
		
		
		
		// Set user2 info:
		userTwo.setUserName("Jemal Qarcivadze");
		userTwo.setUserAge(50);
		userTwo.setUserNationality("Georgia");
		userTwo.setUserAdress("Loria Street");
		
		
		// Override toString
		LOGGER.info("\n" + userOne.toString() + "\n");
		LOGGER.info(userTwo.toString() + "\n");
		
		
		// Override equals and Hashcode
		LOGGER.info(userOne.hashCode() + "\n");
		LOGGER.info(userTwo.hashCode() + "\n");
		LOGGER.info(userThree.hashCode());
		LOGGER.info(userOne.equals(userThree) + "\n");
		LOGGER.info(phoneOne.hashCode() + "\n");
		LOGGER.info(phoneTwo.hashCode() + "\n");
		LOGGER.info(phoneThree.hashCode() + "\n");
		LOGGER.info(phoneFour.hashCode());
		LOGGER.info(phoneTwo.equals(phoneFour) + "\n");
	

		
	
	}

}
