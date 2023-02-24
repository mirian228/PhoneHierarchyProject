package hardware;

import java.util.Objects;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import interfaces.ICharge;

public class Charger implements ICharge {
	private String chargerType;
	private String chargerPower;
	private String chargerFrequency;
	private String outputPort;
	private Scanner scanner;

	public Charger(String chargerType, String chargerPower, String chargerFrequency, String outputPort) {

		this.chargerType = chargerType;
		this.chargerPower = chargerPower;
		this.chargerFrequency = chargerFrequency;
		this.outputPort = outputPort;
	}

	public final static Logger LOGGER = LogManager.getLogger(Charger.class);

	@Override
	public String toString() {
		return chargerType + "\n" + chargerPower + "\n" + chargerFrequency + "\n" + outputPort;

	}

	@Override
	public int hashCode() {
		return Objects.hash(chargerFrequency, chargerPower, chargerType, outputPort);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Charger other = (Charger) obj;
		return Objects.equals(chargerFrequency, other.chargerFrequency)
				&& Objects.equals(chargerPower, other.chargerPower) && Objects.equals(chargerType, other.chargerType)
				&& Objects.equals(outputPort, other.outputPort);
	}

	Charger() {
	}

	public String getChargerType() {
		return chargerType;
	}

	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}

	public String getChargerPower() {
		return chargerPower;
	}

	public void setChargerPower(String chargerPower) {
		this.chargerPower = chargerPower;
	}

	public String getChargerFrequency() {
		return chargerFrequency;
	}

	public void setChargerFrequency(String chargerFrequency) {
		this.chargerFrequency = chargerFrequency;
	}

	public String getOutputPort() {
		return outputPort;
	}

	public void setOutputPort(String outputPort) {
		this.outputPort = outputPort;
	}

	@Override
	public void charge() throws NullPointerException {
		scanner.next().toUpperCase();
		try {
			LOGGER.info("Do you want to charge your device?");
			LOGGER.info("\"Y\" for yes and \"N\" for no");
			if (scanner.next() == "Y") {
				LOGGER.info("Your device is being charged");

			} else if (scanner.next() == "N") {
				LOGGER.info("Charge offer declined");
			} else if (scanner.equals(null)) {
				throw new NullPointerException();
			} else {
				LOGGER.info("You should input only \"Y\" or \"N\"");
			}
		} catch (NullPointerException e) {
			LOGGER.info("Answer can't be null");
		}

	}

	@Override
	public void disconnectFromCharger() {

	}

}
