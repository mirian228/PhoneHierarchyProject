package Main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import applications.Contacts;
import constants.CountryPhoneCodes;
import devices.CellPhone;
import devices.LandlinePhone;
import devices.Phone;
import devices.SmartPhone;
import hardware.Battery;
import hardware.Camera;
import hardware.Charger;
import hardware.Processor;
import interfaces.ICall;
import users.User;

public class Main {

	public final static Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			InstantiationException, IllegalArgumentException, SecurityException, NoSuchMethodException {

		List<String> randomWords = Arrays.asList("truck", null, "car", "phone", "list", null, "school", null,
				"lecture");
		List<String> result = new ArrayList<String>();
		result = randomWords.stream().filter(x -> x != null).collect(Collectors.toList());
		LOGGER.info("Words excluding nulls: " + result);

		// Length of each word
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		vehicles.stream().map(x -> x.length()).forEach(System.out::println);

		// Collect many lists to one
		List<String> objects1 = Arrays.asList("Phone", "Wired phone", "Cell phone");
		List<String> objects2 = Arrays.asList("Car", "Truck", "Boat");
		List<String> objects3 = Arrays.asList("Monkey", "Elephant", "Lion");

		List<List<String>> allObjects = Arrays.asList(objects1, objects2, objects3);
		List<String> allObjectsCollection = allObjects.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		LOGGER.info(allObjectsCollection);

		List<Contacts> myContacts = Arrays.asList(
				new Contacts(new User("Mirian Surmanidze", 21, "Georgia", "Batumi"), CountryPhoneCodes.GEORGIA,
						555100100),
				new Contacts(new User("Nika Shainidze", 25, "Georgia", "Batumi"), CountryPhoneCodes.GEORGIA,
						577200200));
		List<String> listOfMyContacts = myContacts.stream().map(x -> x.toString()).collect(Collectors.toList());
		LOGGER.info(listOfMyContacts);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		LOGGER.info("These are even numbers: " + evenNumbers);

		List<Processor> processors = new ArrayList<>();
		processors.add(new Processor("A15 Bionic processor", 6, 3.23));
		processors.add(new Processor("Texas Instruments MAD2WD1", 1, 0.5));
		processors.add(new Processor("Snap Dragon", 8, 3.55));
		processors.add(new Processor("A15 Bionic processor", 6, 3.23));
		processors.stream().filter(x -> x.getProcessorGhz() > 3).forEach(x -> LOGGER.info(x.getProcessorModel()));

		// .reduce
		List<String> values = Arrays.asList("1", "5", "7", "AB", "BA", "CD", "@", "10");
		Optional<String> newValue = values.stream().reduce((value1, value2) -> {
			return value1 + value2;
		});
		LOGGER.info(newValue.get());

		Phone iphoneOne = new SmartPhone("Apple", "Iphone 13", "174g", "131 x 64 x 7.6 mm", "IOS");

		Field[] smartPhoneClassFields = iphoneOne.getClass().getDeclaredFields();
		Method[] smartPhoneClassMethods = iphoneOne.getClass().getDeclaredMethods();

		// Fields
		System.out.println("These are SmartPhone class fields: ");
		for (Field field : smartPhoneClassFields) {
			System.out.print(field.getName() + " ");
		}

		System.out.println("\nThese are SmartPhone class field modifiers: ");
		for (Field field : smartPhoneClassFields) {
			System.out.print(field.getModifiers() + " ");
		}

		// Methods
		System.out.println("\nThese are SmartPhone class methods: ");
		for (Method method : smartPhoneClassMethods) {
			System.out.print(method.getName() + " ");

		}
		System.out.println("\nThese are SmartPhone class method modifiers: ");
		for (Method method : smartPhoneClassMethods) {
			System.out.print(method.getModifiers() + " ");

		}
		System.out.println("\nThese are SmartPhone class method return types: ");
		for (Method method : smartPhoneClassMethods) {
			System.out.print(method.getReturnType() + " ");
		}
		// method invoking
		for (Method method : smartPhoneClassMethods) {
			if (method.getName().equals("calculateSum")) {
				System.out.println();
				LOGGER.info(method.invoke(iphoneOne, 5, 10));
			}
		}

		User userTwo = new User();

		// Polymorphism with abstract class

		Phone nokia = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		Phone texas = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD", "5");

		// PolyMorphism with interface
		ICall iphone = new SmartPhone("Apple", "Iphone 13", "174g", "131 x 64 x 7.6 mm", "IOS");
		ICall cellphone = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		ICall landlinephone = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD",
				"5");

		SmartPhone phoneOne = new SmartPhone("Apple", "Iphone 13", "174g", "131 x 64 x 7.6 mm", "IOS");
		CellPhone phoneTwo = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");
		LandlinePhone phoneThree = new LandlinePhone("AT&T", "BL102-2 DECT", "900g", "3.81 x 6.04 x 7.21 inches", "LCD",
				"5");
		CellPhone phoneFour = new CellPhone("Nokia", "3310", "85g", "115.6 x 51 x 12.8 mm", 15, "Java-powered Smart");

		Processor processorOne = new Processor("A15 Bionic processor", 6, 3.23);
		Processor processorTwo = new Processor("Texas Instruments MAD2WD1", 1, 0.5);
		Battery batteryOne = new Battery("lithium-ion battery", 80, 95, "3095 mAh");
		Battery batteryTwo = new Battery();
		Charger chargerOne = new Charger("Fast Charger", "20W", "60HZ", "USB-C");
		Charger chargerTwo = new Charger("Charger", "5W", "10HZ", "Micro USB");
		Camera cameraOne = new Camera("Dual 12MP", "5X", 3);
		Camera cameraTwo = new Camera("1.5MP", "2X", 1);
		Camera cameraThree = new Camera("Dual 12MP", "5X", 3);

		// Override equals and Hashcode LOGGER.info(userOne.hashCode() + "\n");
		LOGGER.info(chargerOne.hashCode() + "\n");
		LOGGER.info(batteryTwo.hashCode());
		LOGGER.info(batteryOne.equals(batteryTwo) + "\n");
		LOGGER.info(phoneOne.hashCode() + "\n");
		LOGGER.info(phoneTwo.hashCode() + "\n");
		LOGGER.info(phoneThree.hashCode() + "\n");
		LOGGER.info(phoneFour.hashCode());
		LOGGER.info(phoneTwo.equals(phoneFour) + "\n");

		// Set user2 info: userTwo.setUserName("Jemal Qarcivadze");
		userTwo.setUserAge(50);
		userTwo.setUserNationality("Georgia");
		userTwo.setUserAdress("Loria Street");

		// Override toString LOGGER.info("\n" + userOne.toString() + "\n");
		LOGGER.info(userTwo.toString() + "\n");

	}
}
