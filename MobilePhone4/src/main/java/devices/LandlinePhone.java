package devices;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.ArrayLengthException;
import exceptions.ArrayNegativeLengthException;
import exceptions.NegativeNumberException;
import exceptions.UserInstantiationException;
import hardware.Battery;
import hardware.Charger;
import hardware.Processor;
import interfaces.ICall;
import users.User;

public class LandlinePhone extends Phone implements ICall {
	private int wireLength;
	private Processor processor;
	private Battery battery;
	private Charger charger;
	private User user;

	private final static Logger LOGGER = LogManager.getLogger(LandlinePhone.class);

	public LandlinePhone(String brand, String model, String weight, String dimensions, String displayType,
			String displaySize, int wireLength) {
		super(brand, model, weight, dimensions, displayType, displaySize);
		this.wireLength = wireLength;

	}

	public LandlinePhone(String brand, String model, String weight, String dimensions, String displayType,
			String displaySize) {
		super(brand, model, weight, dimensions, displayType, displaySize);

	}

	public LandlinePhone(String brand, String model, String weight, String dimensions) {
		super(brand, model, weight, dimensions);
	}

	@Override
	public void call(String user, int[] phoneNumber) {
		for (int i = 0; i < phoneNumber.length; i++)

			try {
				if (phoneNumber.length > 15) {
					throw new ArrayLengthException();
				} else if (phoneNumber.length < 0) {
					throw new ArrayNegativeLengthException();
				} else if (user.length() < 4) {
					throw new UserInstantiationException();
				} else if (phoneNumber[i] < 0) {
					throw new NegativeNumberException();

				}

			} catch (ArrayLengthException e) {
				LOGGER.info("Array can't be bigger than 15");
			} catch (ArrayNegativeLengthException e) {
				LOGGER.info("Array can't have negative length");
			} catch (UserInstantiationException e) {
				LOGGER.info("User name can't be less than 4");
			} catch (NegativeNumberException e) {
				LOGGER.info("Phone number can't be negative");
			}
	}

	@Override
	public String toString() {
		return processor + "\n" + battery + "\n" + charger + "\n" + user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(battery, charger, processor, user, wireLength);
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
		LandlinePhone other = (LandlinePhone) obj;
		return Objects.equals(battery, other.battery) && Objects.equals(charger, other.charger)
				&& Objects.equals(processor, other.processor) && Objects.equals(user, other.user)
				&& wireLength == other.wireLength;
	}

	public int getWireLength() {
		return wireLength;
	}

	public void setWireLength(int wireLength) {
		this.wireLength = wireLength;
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

}
