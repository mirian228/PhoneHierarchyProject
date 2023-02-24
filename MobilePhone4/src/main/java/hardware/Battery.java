package hardware;

import java.util.Objects;

public class Battery {
	private String batteryModel;
	private int batteryPercentage;
	private int batteryHealth;
	private String batteryCapacity;

	public Battery(String batteryModel, int batteryPercentage, int batteryHealth, String batteryCapacity) {
		this.batteryModel = batteryModel;
		this.batteryPercentage = batteryPercentage;
		this.batteryHealth = batteryHealth;
		this.batteryCapacity = batteryCapacity;
	}

	public Battery() {
		batteryModel = "Default";
		batteryPercentage = 35;
		batteryHealth = 100;
		batteryCapacity = "1000";
	}

	@Override
	public String toString() {
		return batteryModel + "\n" + batteryPercentage + "\n" + batteryHealth + "\n" + batteryCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, batteryHealth, batteryModel, batteryPercentage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Battery other = (Battery) obj;
		return Objects.equals(batteryCapacity, other.batteryCapacity) && batteryHealth == other.batteryHealth
				&& Objects.equals(batteryModel, other.batteryModel) && batteryPercentage == other.batteryPercentage;
	}

	public String getBatteryModel() {
		return batteryModel;
	}

	public void setBatteryModel(String batteryModel) {
		this.batteryModel = batteryModel;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public int getBatteryHealth() {
		return batteryHealth;
	}

	public void setBatteryHealth(int batteryHealth) {
		this.batteryHealth = batteryHealth;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

}
